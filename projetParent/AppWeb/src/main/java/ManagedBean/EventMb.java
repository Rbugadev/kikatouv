package ManagedBean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import Entities.Event;
import Entities.Ville;
import IBusiness.EventIBusiness;
import IBusiness.UserIBusiness;
import IBusiness.VilleIBusiness;

@ManagedBean(name="mbEvent")
@SessionScoped
public class EventMb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private EventIBusiness proxyEvent;
	
	@EJB
	private UserIBusiness proxyUser;
	
	@EJB
	private VilleIBusiness proxyVille;
	
	private Event ajoutEvent = new Event();
	
	private Event event;
	
	@ManagedProperty(value="#{mblogin}")
	private LoginMb loginMb;
	
	@ManagedProperty(value="#{mbVille}")
	private VilleMb villeMb;
	
	

	
	public String addEvent(int id) {
		
		if(loginMb.getUser() != null) {
			ajoutEvent.setUser(loginMb.getUser());
			
			Ville v = proxyVille.create(villeMb.getVille());
			ajoutEvent.setVille(v);
			event = proxyEvent.create(ajoutEvent);
		
			return "/affichageSousCat.xhtml";}
		else {
			return "/connexion.xhtml";
		}
		
	}
	
	
	
	public EventIBusiness getProxyEvent() {
		return proxyEvent;
	}

	public void setProxyEvent(EventIBusiness proxyEvent) {
		this.proxyEvent = proxyEvent;
	}

	public Event getAjoutEvent() {
		return ajoutEvent;
	}

	public void setAjoutEvent(Event ajoutEvent) {
		this.ajoutEvent = ajoutEvent;
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



	public Event getEvent() {
		return event;
	}



	public void setEvent(Event event) {
		this.event = event;
	}



	public VilleIBusiness getProxyVille() {
		return proxyVille;
	}



	public void setProxyVille(VilleIBusiness proxyVille) {
		this.proxyVille = proxyVille;
	}



	public VilleMb getVilleMb() {
		return villeMb;
	}



	public void setVilleMb(VilleMb villeMb) {
		this.villeMb = villeMb;
	}

	
}
