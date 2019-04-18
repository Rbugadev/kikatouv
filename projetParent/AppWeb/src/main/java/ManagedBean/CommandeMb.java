package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Entities.Commande;
import Entities.Event;
import IBusiness.CommandeIBusiness;
import IBusiness.EventIBusiness;

@ManagedBean(name="mbcommande")
@SessionScoped
public class CommandeMb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@EJB
	private CommandeIBusiness proxyCommande;
	
	@EJB
	private EventIBusiness proxyEvent;

	private Double prixTotal=0d;
	private int quantiteTotalArticle=0;
	private Event event = new Event();
	private List<Commande> commandes= new ArrayList<Commande>();
	private String msg;
	
	@ManagedProperty(value="#{mbEvent}")
	private EventMb eventmb;
	
	//@PostConstruct
	public void init() {
		try {
			
			//calcul de la date 
			Long diDi = (eventmb.getEvent().getDateFin().getTime()-eventmb.getEvent().getDateDebut().getTime())/(1000*60*60*24);
			System.out.println(diDi);
			System.out.println(eventmb.getEvent().getDateFin().getTime());
			System.out.println(eventmb.getEvent().getDateDebut().getTime());
			
			commandes=proxyCommande.findByIdEvent(eventmb.getEvent().getId());
			prixTotal=0d;
			quantiteTotalArticle=0;
			for (Commande commande : commandes) {
					
					prixTotal+=(commande.getQuantite()*commande.getArticle().getPrix()*(diDi));
					quantiteTotalArticle+=commande.getQuantite();
					
				}
		}catch (Exception e) {
			System.out.println("tkt sa marche et sa crache plus ^^");
		}
			
		}
	
	
	public void deleteCommande(Commande c) {
		proxyCommande.deleteCommande(c);
	}
	
	public void paiement() {
		
	
		 FacesContext facesContext = FacesContext.getCurrentInstance();
		 facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/paiement.xhtml?faces-redirect=true");
	}
	
	public Double CalculPrixCommande() {
		
	
		return prixTotal;
	}

	public void ajoutDateValidation() {
		
		event = eventmb.getEvent();
		event.setDateValidation(new Date());
		proxyEvent.update(event);
		msg = "Votre commande est validée. Merci d'avoir commandé chez nous! :)";
		 
		eventmb.setEvent(new Event());
		quantiteTotalArticle=0;

		 FacesContext facesContext = FacesContext.getCurrentInstance();
		 facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/HistoriqueEvent.xhtml?faces-redirect=true");
	}
	
	
	public CommandeIBusiness getProxyCommande() {
		return proxyCommande;
	}

	public void setProxyCommande(CommandeIBusiness proxyCommande) {
		this.proxyCommande = proxyCommande;
	}

	

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	


	public Double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public int getQuantiteTotalArticle() {
		return quantiteTotalArticle;
	}

	public void setQuantiteTotalArticle(int quantiteTotalArticle) {
		this.quantiteTotalArticle = quantiteTotalArticle;
	}

	public EventMb getEventmb() {
		return eventmb;
	}

	public void setEventmb(EventMb eventmb) {
		this.eventmb = eventmb;
	}


	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}


	public EventIBusiness getProxyEvent() {
		return proxyEvent;
	}


	public void setProxyEvent(EventIBusiness proxyEvent) {
		this.proxyEvent = proxyEvent;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
}
