package ManagedBean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Entities.User;
import IBusiness.UserIBusiness;

@ManagedBean(name="mblogin")
@SessionScoped
public class LoginMb implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@EJB
	private UserIBusiness proxyUser;
	
	private User user;
	private String log;
	private String mdp;
	private String msg="";

	// si isConnected = 0, on affiche le bouton "Connexion" et on masque le bouton "Déconnexion"
	// et si isConnected = 1, on affiche le bouton "Déconnexion" et on masque le bouton "Connexion"
    private int isConnected=0;
	

public String connexion() {
	try {
		user=proxyUser.connection(log, mdp);
		isConnected = 1;
		if(log.equals("admin") && mdp.equals("admin")) {
			return "/affichageArticleStockDispo.xhtml";
		}else {
			return "/affichageSousCat.xhtml?id=1";
		}			
	} catch (Exception e) {
		isConnected = 0;
		return msg = "* L'utilisateur ou le mot de passe est incorrect";
	}
}	

public String deconnection() {
	FacesContext facesContext = FacesContext.getCurrentInstance();
	facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/connexion.xhtml?faces-redirect=true");
	FacesContext.getCurrentInstance()
				.getExternalContext()
				.invalidateSession();
		isConnected = 0;
		return "/AppWeb/faces/Accueil.xhtml?faces-redirect=true"; 
	}

public String pageconnexion() {
	return "/connexion.xhtml";
}


public UserIBusiness getProxyUser() {
	return proxyUser;
}


public void setProxyUser(UserIBusiness proxyUser) {
	this.proxyUser = proxyUser;
}


public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}


public String getLog() {
	return log;
}


public void setLog(String log) {
	this.log = log;
}


public String getMdp() {
	return mdp;
}


public void setMdp(String mdp) {
	this.mdp = mdp;
}


public String getMsg() {
	return msg;
}


public void setMsg(String msg) {
	this.msg = msg;
}

public int getIsConnected() {
	return isConnected;
}

public void setIsConnected(int isConnected) {
	this.isConnected = isConnected;
}

}
