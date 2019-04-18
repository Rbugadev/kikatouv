package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.Column;

import Entities.Article;
import Entities.Commande;
import Entities.MajStock;
import Entities.Mouvement;
import Entities.TypeMouvement;
import IBusiness.ArticleIBusiness;
import IBusiness.CommandeIBusiness;
import IBusiness.MajStockIBusiness;
import IBusiness.MouvementIBusiness;
import IBusiness.TypeMouvementIBusiness;

@ManagedBean(name="mbArticleStock")
@SessionScoped
public class ArticleStockMb implements Serializable 
{
	private static final long serialVersionUID = 1L;

	public class ArticleStock {
		private Article article;
		private int qtyStock;
		private int mvtCommande;
		private int perte;
		private int qtyStockDispo;
		private int qty;
		
		public int getPerte() {
			return perte;
		}
		public void setPerte(int perte) {
			this.perte = perte;
		}
		public int getMvtCommande() {
			return mvtCommande;
		}
		public void setMvtCommande(int mvtCommande) {
			this.mvtCommande = mvtCommande;
		}
		public int getQtyStockDispo() {
			return qtyStockDispo;
		}
		public void setQtyStockDispo(int qtyStockDispo) {
			this.qtyStockDispo = qtyStockDispo;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}

		public Article getArticle() {
			return article;
		}
		public void setArticle(Article article) {
			this.article = article;
		}

		public int getQtyStock() {
			return qtyStock;
		}
		public void setQtyStock(int qtyStock) {
			this.qtyStock = qtyStock;
		}
		
	}
	private List<ArticleStock> articlesStock = new ArrayList<ArticleStock>();
	
	private List<ArticleStock> articlesStockMvt = new ArrayList<ArticleStock>();
	
	@ManagedProperty(value="#{mbAdminMouvement}")
	private  MouvementAdminMb mouvementAdminMb;

	private Article articleSelect;
	private List<Article> articles = new ArrayList<Article>();

	@EJB
	private ArticleIBusiness proxyArticle;	
	@EJB
	private MajStockIBusiness proxyMajStock;	
	@EJB
	private MouvementIBusiness proxyMouvement;	
	@EJB
	private TypeMouvementIBusiness proxyTypeMouvement;	
 
	
	@PostConstruct
	public void init() {
		articlesStock.clear();
		articles = proxyArticle.getAll();
		for (Article article: articles) 
		{
			ArticleStock articleStock = new ArticleStock();
			articleStock.setArticle(article);
			articleStock.setQtyStock(proxyArticle.findQtyStock(article.getId()));
			articleStock.setMvtCommande(proxyArticle.findQtyCmd(article.getId()));
			articleStock.setPerte(proxyArticle.findQtyPerte(article.getId()));
			articleStock.setQtyStockDispo(articleStock.getQtyStock() - articleStock.getMvtCommande() - articleStock.getPerte());
			articleStock.setQty(0);			
			articlesStock.add(articleStock);
		}
	}
	
	// util si on veut actualiser le stock (avec un bouton Refresh)
	public void refreshStock() 
	{
		for (ArticleStock articleStock: articlesStock) 
		{
			articleStock.setQtyStock(proxyArticle.findQtyStock(articleStock.article.getId()));
		}
	}
	
	public void raz() 
	{
		for (ArticleStock articleStock: articlesStock) 
		{
			articleStock.setQty(0);
		}
	}

	public void addGlobal() 
	{
		articlesStockMvt.clear();
		//System.out.println("addGlobal");
		for (ArticleStock articleStock : articlesStock) 
		{
			//System.out.println("article : " + articleStock.article.getNom() + " qty : " + articleStock.getQty());
			if (articleStock.getQty() != 0) 
			{
				articlesStockMvt.add(articleStock);
			}
		}
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/recapArticleStock.xhtml?faces-redirect=true");
	}
	
	public void addGlobalValide() 
	{
		// creation du Mouvement
		mouvementAdminMb.setAjoutMouvement(proxyMouvement.create(mouvementAdminMb.getAjoutMouvement()));
		//System.out.println("addGlobal");
		for (ArticleStock articleStock : articlesStockMvt) 
		{
			//System.out.println("article : " + articleStock.article.getNom() + " qty : " + articleStock.getQty());
			if (articleStock.getQty() != 0) 
			{
				//System.out.println("article : " + articleStock.article.getNom() + " qty : " + articleStock.getQty());				
				addMajStock(articleStock.article.getId(), articleStock.getQty());
			}
		}
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/affichageArticleStockDispo.xhtml?faces-redirect=true");
	}
	public String annulationMvtRetour() 
	{
		return "/ajoutMouvement.xhtml";
	}
	
	public String add(int id, int quantite) {
		return addMajStock(id, quantite);
	}
	
	public String addMajStock(int id, int quantite) 
	{
		articleSelect = proxyArticle.find(id);
		//System.out.println(mouvementAdminMb.getAjoutMouvement().getTypeMouvement().getNom() + " : article[" + articleSelect.getNom() + "] qty :" + quantite);
		
		MajStock majStock = new MajStock();
		majStock.setArticle(articleSelect);
		// le mouvement est récupéré du beans MbAdminMouvement (on passe par cet écran avant)
		majStock.setMouvement(mouvementAdminMb.getAjoutMouvement());
		majStock.setQuantite(quantite);
		
		// création de l'occurence majStock
		proxyMajStock.create(majStock);
	
		return null;
	}
	
	public void AccesHistoriqueStock(int id) {
		articleSelect = proxyArticle.find(id);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/affichageHistoStock.xhtml?faces-redirect=true");
		// au lieu de :
		//return "/affichageHistoStock.xhtml";
	}
	
	// getters and setters
	
	public List<ArticleStock> getArticlesStock() {
		return articlesStock;
	}

	public List<ArticleStock> getArticlesStockMvt() {
		return articlesStockMvt;
	}

	public void setArticlesStockMvt(List<ArticleStock> articlesStockMvt) {
		this.articlesStockMvt = articlesStockMvt;
	}

	public MouvementAdminMb getMouvementAdminMb() {
		return mouvementAdminMb;
	}

	public void setMouvementAdminMb(MouvementAdminMb mouvementAdminMb) {
		this.mouvementAdminMb = mouvementAdminMb;
	}

	public MouvementIBusiness getProxyMouvement() {
		return proxyMouvement;
	}

	public void setProxyMouvement(MouvementIBusiness proxyMouvement) {
		this.proxyMouvement = proxyMouvement;
	}

	public TypeMouvementIBusiness getProxyTypeMouvement() {
		return proxyTypeMouvement;
	}

	public void setProxyTypeMouvement(TypeMouvementIBusiness proxyTypeMouvement) {
		this.proxyTypeMouvement = proxyTypeMouvement;
	}

	public void setArticlesStock(List<ArticleStock> articlesStock) {
		this.articlesStock = articlesStock;
	}
	
	public Article getArticleSelect() {
		return articleSelect;
	}

	public void setArticleSelect(Article articleSelect) {
		this.articleSelect = articleSelect;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public ArticleIBusiness getProxyArticle() {
		return proxyArticle;
	}

	public void setProxyArticle(ArticleIBusiness proxyArticle) {
		this.proxyArticle = proxyArticle;
	}

	public MajStockIBusiness getProxyMajStock() {
		return proxyMajStock;
	}

	public void setProxyMajStock(MajStockIBusiness proxyMajStock) {
		this.proxyMajStock = proxyMajStock;
	}

}
