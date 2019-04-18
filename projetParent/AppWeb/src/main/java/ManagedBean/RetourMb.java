package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Entities.Commande;
import Entities.Event;
import IBusiness.CommandeIBusiness;
import IBusiness.EventIBusiness;

@ManagedBean(name="mbRetour")
@SessionScoped
public class RetourMb implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private EventIBusiness proxyEvent;
	
	@EJB
	private CommandeIBusiness proxyCommande;
	
	private List<Event> events = new ArrayList<Event>();
	private List<Commande> commandes =new ArrayList<Commande>();
	private Date dateRetour;
	private int idEventRetour;
	private double prixTotal=0d;
	private String msg;
	
	@PostConstruct
	public void init() {
		events = proxyEvent.findNoRetour();
		msg = null;
	}
	
	
	
	//*****************************************************
	//* Methodes
	//*****************************************************	
	public List<Event> eventNoRetour(){
		events=proxyEvent.findNoRetour();
		
		return events;
	}
	
	public List<Commande> commandeByIdEvent(int id){
		commandes = proxyCommande.findByIdEvent(id);
		idEventRetour = id;
		setPrixTotal(0d);
			
		for (Commande commande : commandes) {
			setPrixTotal(getPrixTotal() + (commande.getArticle().getPrix() * commande.getQuantite()));
		}
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/adminRetourCommande.xhtml?faces-redirect=true");
		
		return commandes;
	}
	
	public void retourEvent() {
		Boolean test = true;
		Event eRetour = proxyEvent.find(idEventRetour);

		if (eRetour.getDateFin().getTime() > dateRetour.getTime()) {
			test = false;
			msg = "* la date de retour doit être supérieur à la date " + eRetour.getDateFin();
		}
		else {
			for (Commande commande : commandes) {
				if (commande.getQuantite() < commande.getQuantiteRetour()) {
					test = false;
					msg = "* Il y a une erreur sur une quantité d'articles retournés";
				}
			}
		}
		
		
		
		if (test){
			eRetour.setDateRetour(dateRetour);
			proxyEvent.update(eRetour);
			
			for (Commande commande : commandes) {
				proxyCommande.update(commande);
			}
		
			FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/adminEventRetour.xhtml?faces-redirect=true");
		}
	}



	
	//*****************************************************
	//* Getter Setter
	//*****************************************************
	
	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public EventIBusiness getProxyEvent() {
		return proxyEvent;
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

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
