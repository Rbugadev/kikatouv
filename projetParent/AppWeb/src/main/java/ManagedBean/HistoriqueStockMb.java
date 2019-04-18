package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import Entities.Article;
import Entities.Commande;
import Entities.Event;
import Entities.MajStock;
import IBusiness.CommandeIBusiness;
import IBusiness.MajStockIBusiness;

@ManagedBean(name="mbStockHisto")
@SessionScoped
public class HistoriqueStockMb implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@EJB
	private MajStockIBusiness proxyMajStock;
	
	@ManagedProperty(value="#{mbArticleStock}")
	private  ArticleStockMb articleStockMb;

	public ArticleStockMb getArticleStockMb() {
		return articleStockMb;
	}

	public void setArticleStockMb(ArticleStockMb articleStockMb) {
		this.articleStockMb = articleStockMb;
	}

	public MajStockIBusiness getProxyMajStock() {
		return proxyMajStock;
	}

	public void setProxyMajStock(MajStockIBusiness proxyMajStock) {
		this.proxyMajStock = proxyMajStock;
	}


	public List<MajStock> getMajStocks() {
		return majStocks;
	}

	public void setMajStocks(List<MajStock> majStocks) {
		this.majStocks = majStocks;
	}

	private List<MajStock> majStocks = new ArrayList<MajStock>();
	
	@PostConstruct
	public void init() 
	{
		majStocks = proxyMajStock.findByIdArticle(articleStockMb.getArticleSelect().getId());	
		//System.out.println("on y passe !");
	}
	
}
