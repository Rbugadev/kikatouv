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

import Entities.Article;
import Entities.Event;
import Entities.Message;
import Entities.User;
import IBusiness.ArticleIBusiness;
import IBusiness.MessageIBusiness;
import IBusiness.UserIBusiness;

@ManagedBean(name="mbMessage")
@SessionScoped
public class MessageMB implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private MessageIBusiness proxyMessage;

	@EJB
	private ArticleIBusiness proxyArticle;
	
	@EJB
	private UserIBusiness proxyUser;
	
	private List<Message> allMessage = new ArrayList<Message>();

	private Message messageCurrent = new Message();

	
	public void deleteMessage(Message m) {
		//Message msg = proxyMessage.find(m.getId());
		//System.out.println(msg);
		proxyMessage.fuckingRemove(m);
		
	}
	
	@PostConstruct
	public void init() {
		allMessage = proxyMessage.getAll();
	}

	public Message getMessageCurrent() {
		return messageCurrent;
	}


	public void setMessageCurrent(Message messageCurrent) {
		this.messageCurrent = messageCurrent;
	}
	
	@ManagedProperty(value="#{mblogin}")
	private LoginMb loginMb;

	private Article articleSelect = new Article();
	private String msg;
	
	public String addMessage(int id) {
		// article et user bidon...
		//Article article = proxyArticle.find(1);
		if(loginMb.getUser() != null) {
		articleSelect = proxyArticle.find(id);
		messageCurrent.setArticle(articleSelect);
		//User user = proxyUser.find(1);
		messageCurrent.setUser(loginMb.getUser());
		messageCurrent.setDate(new Date());
		proxyMessage.create(messageCurrent);
		messageCurrent = new Message();
		return "";}
		else {
			 return msg = "* Vous devez être connecté pour laisser un avis sur cet article";
		}
	}

	public List<Message> getAllMessage() {
		return allMessage;
	}


	public void setAllMessage(List<Message> allMessage) {
		this.allMessage = allMessage;
	}


	public MessageIBusiness getProxyMessage() {
		return proxyMessage;
	}

	public void setProxyMessage(MessageIBusiness proxyMessage) {
		this.proxyMessage = proxyMessage;
	}

	public ArticleIBusiness getProxyArticle() {
		return proxyArticle;
	}

	public void setProxyArticle(ArticleIBusiness proxyArticle) {
		this.proxyArticle = proxyArticle;
	}

	public UserIBusiness getProxyUser() {
		return proxyUser;
	}

	public void setProxyUser(UserIBusiness proxyUser) {
		this.proxyUser = proxyUser;
	}

	public LoginMb getLoginMb() {
		return loginMb;
	}

	public void setLoginMb(LoginMb loginMb) {
		this.loginMb = loginMb;
	}

	public Article getArticleSelect() {
		return articleSelect;
	}

	public void setArticleSelect(Article articleSelect) {
		this.articleSelect = articleSelect;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
