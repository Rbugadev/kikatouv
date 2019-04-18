package ManagedBean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import Entities.User;
import IBusiness.UserIBusiness;

@ManagedBean (name="mbMonCompte")
@SessionScoped
public class MonCompteMb implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private UserIBusiness proxyUser;
	
	
	
	@ManagedProperty(value="#{mblogin}")
	private LoginMb loginMb;
	
	private User majUser =new User();
	
	@PostConstruct
	public void init() {
		majUser=loginMb.getUser();
	}
	
	public String majUser( ) {
		
	
		proxyUser.update(majUser);
		
		return "/affichageSousCat.xhtml";
	}


	public UserIBusiness getProxyUser() {
		return proxyUser;
	}


	public void setProxyUser(UserIBusiness proxyUser) {
		this.proxyUser = proxyUser;
	}




	public User getMajUser() {
		return majUser;
	}


	public void setMajUser(User majUser) {
		this.majUser = majUser;
	}


	public LoginMb getLoginMb() {
		return loginMb;
	}


	public void setLoginMb(LoginMb loginMb) {
		this.loginMb = loginMb;
	}
	
	
}
