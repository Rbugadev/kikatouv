package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import Entities.Article;
import Entities.Commande;
import Entities.Event;
import Entities.Message;
import Entities.SousCategorie;
import Entities.User;
import IBusiness.ArticleIBusiness;
import IBusiness.CommandeIBusiness;
import IBusiness.EventIBusiness;
import IBusiness.MessageIBusiness;
import IBusiness.SousCategorieIBusiness;
import IBusiness.UserIBusiness;

@ManagedBean(name="mbArticle")
@SessionScoped
public class ArticleMb implements Serializable{


	private static final long serialVersionUID = 1L;

	@EJB
	private ArticleIBusiness proxyArticle;
	
	private List<Article> AllArticleById = new ArrayList<Article>();
	
	@EJB
	private SousCategorieIBusiness proxySousCat;
	
	
	private int idArticle;
	private int sousCatSelect;
	private Article articleD;
	private List<Article> articles = new ArrayList<Article>();
	private SousCategorie sousCatS = new SousCategorie();
	
	//@PostConstruct
	public void init() {
	
		AllArticleById = proxyArticle.getAllByIdSousCat(sousCatSelect);
		messages = proxyMessage.getAllByIdArticle(idart);
		articleD = proxyArticle.find(idArticle);
		sousCatS= proxySousCat.find(sousCatSelect);
		
	}
	
	

	
	@EJB
	private MessageIBusiness proxyMessage;
	
	@EJB
	private UserIBusiness proxyUser;
	
	private List<Message> messages = new ArrayList<>();
	private Message msg;
	private int idart;
	
	
	
	
	public ArticleIBusiness getProxyArticle() {
		return proxyArticle;
	}

	public void setProxyArticle(ArticleIBusiness proxyArticle) {
		this.proxyArticle = proxyArticle;
	}

	public List<Article> getAllArticleById() {
		return AllArticleById;
	}

	public void setAllArticleById(List<Article> allArticleById) {
		AllArticleById = allArticleById;
	}
	
	
	
	@EJB
	private CommandeIBusiness proxyCommande;
	
	@EJB
	private EventIBusiness proxyEvent;
	
	private Commande ajoutCommande = new Commande();
	private Event event = new Event();
	
	private Article articleSelect = new Article();
	
	@ManagedProperty(value="#{mbEvent}")
	private EventMb eventmb;
	
	@ManagedProperty(value="#{mblogin}")
	private LoginMb loginMb;
	
	private String msgE;
	
	public String addCommande(int id, int quantite) {
		
		if(eventmb.getEvent() != null) {
		
			if (quantite ==0) {
				msgE="* Vous devez entrer une quantité";
			} else {
			articleSelect=proxyArticle.find(id);
			ajoutCommande.setEvent(eventmb.getEvent());
			ajoutCommande.setArticle(articleSelect);
			ajoutCommande.setQuantite(quantite);
			proxyCommande.create(ajoutCommande);	
			ajoutCommande = new Commande();}
		
			return "";}
		
		else if (loginMb.getUser() == null){
			return "/connexion.xhtml";
		}
		
		else {
			return "/ajoutEventTest.xhtml";
		}
	}

	public CommandeIBusiness getProxyCommande() {
		return proxyCommande;
	}

	public void setProxyCommande(CommandeIBusiness proxyCommande) {
		this.proxyCommande = proxyCommande;
	}

	public Commande getAjoutCommande() {
		return ajoutCommande;
	}

	public void setAjoutCommande(Commande ajoutCommande) {
		this.ajoutCommande = ajoutCommande;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public int getSousCatSelect() {
		return sousCatSelect;
	}

	public void setSousCatSelect(int sousCatSelect) {
		this.sousCatSelect = sousCatSelect;
	}

	public EventIBusiness getProxyEvent() {
		return proxyEvent;
	}

	public void setProxyEvent(EventIBusiness proxyEvent) {
		this.proxyEvent = proxyEvent;
	}

	public Article getArticleSelect() {
		return articleSelect;
	}

	public void setArticleSelect(Article articleSelect) {
		this.articleSelect = articleSelect;
	}



	public Article getArticleD() {
		return articleD;
	}

	public void setArticleD(Article articleD) {
		this.articleD = articleD;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	

	public MessageIBusiness getProxyMessage() {
		return proxyMessage;
	}

	public void setProxyMessage(MessageIBusiness proxyMessage) {
		this.proxyMessage = proxyMessage;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message getMsg() {
		return msg;
	}

	public void setMsg(Message msg) {
		this.msg = msg;
	}

	public int getIdart() {
		return idart;
	}

	public void setIdart(int idart) {
		this.idart = idart;
	}

	

	public UserIBusiness getProxyUser() {
		return proxyUser;
	}

	public void setProxyUser(UserIBusiness proxyUser) {
		this.proxyUser = proxyUser;
	}


	public EventMb getEventmb() {
		return eventmb;
	}

	public void setEventmb(EventMb eventmb) {
		this.eventmb = eventmb;
	}

	public LoginMb getLoginMb() {
		return loginMb;
	}

	public void setLoginMb(LoginMb loginMb) {
		this.loginMb = loginMb;
	}

	public SousCategorieIBusiness getProxySousCat() {
		return proxySousCat;
	}

	public void setProxySousCat(SousCategorieIBusiness proxySousCat) {
		this.proxySousCat = proxySousCat;
	}

	public SousCategorie getSousCatS() {
		return sousCatS;
	}

	public void setSousCatS(SousCategorie sousCatS) {
		this.sousCatS = sousCatS;
	}

	public String getMsgE() {
		return msgE;
	}

	public void setMsgE(String msgE) {
		this.msgE = msgE;
	}

}
