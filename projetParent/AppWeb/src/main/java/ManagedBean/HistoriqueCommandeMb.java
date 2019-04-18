package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Entities.Commande;
import Entities.Event;
import Entities.User;
import IBusiness.CommandeIBusiness;
import IBusiness.EventIBusiness;
import net.bootsfaces.C;

@ManagedBean(name="mbHisto")
@SessionScoped
public class HistoriqueCommandeMb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{mblogin.user}")
	private User user;
	
	
	@EJB
	private EventIBusiness proxyEvent;
	
	@EJB
	private CommandeIBusiness proxyCommande;
	private Event event1 = new Event();
	private List<calculEvent> histoEvent=new ArrayList<calculEvent>();
	private List<Event> events = new ArrayList<Event>();
	private List<Commande> commandes =new ArrayList<Commande>();
	private Double totalCommande = 0d;
	private double prixTotal=0d;
	
	@PostConstruct
	public void init() {
		
		histoEvent.clear();
		events=proxyEvent.getAllByIdUser(user.getId());
		for (Event e : events) {
			calculEvent cE=new calculEvent();
			cE.setE(e);
			Long diDi = (e.getDateFin().getTime()-e.getDateDebut().getTime())/(1000*60*60*24);
			commandes=proxyCommande.findByIdEvent(e.getId()); 
			
				for (Commande commande : commandes) {
				totalCommande+= commande.getArticle().getPrix()*commande.getQuantite()*(diDi);
			}
			cE.setPrix(totalCommande);
			histoEvent.add(cE);
			totalCommande=0d;
		}
		
		
		
	}

	
	
	public void  ondblclick(Event event,String typeOfSelection,String indexes) {
		
		
	
		System.out.println("je suis dans la methode");
		System.out.println(event);
		event1=event;
		System.out.println(event1.getDateDebut());
		 FacesContext facesContext = FacesContext.getCurrentInstance();
		 facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/ajoutUser.xhtml?faces-redirect=true");
		
	}
	
	public List<Commande> commandeByIdEvent(int id){
		commandes = proxyCommande.findByIdEvent(id);
		prixTotal=0d;
		Event toto=proxyEvent.find(id);
		Long diDi = (toto.getDateFin().getTime()-toto.getDateDebut().getTime())/(1000*60*60*24);
		for (Commande commande : commandes) {
			
			prixTotal+=(commande.getArticle().getPrix()*commande.getQuantite()*diDi);
		}
		 FacesContext facesContext = FacesContext.getCurrentInstance();
		 facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/HistoriqueCommande.xhtml?faces-redirect=true");
		return commandes;
	}
	
	//pojo
	
	
	public EventIBusiness getProxyEvent() {
		return proxyEvent;
	}


	public Event getEvent1() {
		return event1;
	}

	public void setEvent1(Event event1) {
		this.event1 = event1;
	}

	public void setProxyEvent(EventIBusiness proxyEvent) {
		this.proxyEvent = proxyEvent;
	}
	public CommandeIBusiness getProxyCommande() {
		return proxyCommande;
	}
	public void setProxyCommande(CommandeIBusiness proxyCommande) {
		this.proxyCommande = proxyCommande;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public Double getTotalCommande() {
		return totalCommande;
	}

	public void setTotalCommande(Double totalCommande) {
		this.totalCommande = totalCommande;
	}
	
public List<calculEvent> getHistoEvent() {
		return histoEvent;
	}

	public void setHistoEvent(List<calculEvent> histoEvent) {
		this.histoEvent = histoEvent;
	}

public double getPrixTotal() {
		return prixTotal;
	}



	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

public class calculEvent {
	
	private Event e;
	private Double prix;
	
	public Event getE() {
		return e;
	}
	public void setE(Event e) {
		this.e = e;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
}
	
}
