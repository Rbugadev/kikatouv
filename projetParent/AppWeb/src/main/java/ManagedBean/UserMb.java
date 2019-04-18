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

import Entities.Commande;
import Entities.Event;
import Entities.User;
import Entities.Ville;
import IBusiness.CommandeIBusiness;
import IBusiness.EventIBusiness;
import IBusiness.UserIBusiness;
import IBusiness.VilleIBusiness;

@ManagedBean(name="mbUser")
@SessionScoped
public class UserMb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserIBusiness proxyUser;
	
	@EJB
	private EventIBusiness proxyEvent;
	
	@EJB
	private CommandeIBusiness proxyCommande;

	@EJB
	private VilleIBusiness proxyVille;
	
	@ManagedProperty(value="#{mbVille}")
	private VilleMb villeMb;
	
	private String DATE_FORMAT = "dd.MM.yyyy"; // format date utilisé dans tous les dataTableColumn de type date
	
	private List<User> users = new ArrayList<User>();
	private List<Event> events = new ArrayList<Event>();
	private List<Commande> commandes =new ArrayList<Commande>();
	private Double totalCommande = 0d;
	private double prixTotal=0d;
	private User userEvent = new User();
	private User ajoutUser = new User();
	
	public String addUser() {
		Ville v = proxyVille.create(villeMb.getVille());
		
		ajoutUser.setVille(v);
		ajoutUser.setDateInscription(new Date());
		proxyUser.createUser(ajoutUser);
	
		ajoutUser = new User();
		return "/connexion.xhtml";
		
		
	}
	
	@PostConstruct
	public void init() {
		users = proxyUser.getAll();
		
	}
	
	
	
	public List<Event> eventByIdUser(int id){
		events=proxyEvent.getAllByIdUser(id);
		userEvent = proxyUser.find(id);
		 FacesContext facesContext = FacesContext.getCurrentInstance();
		 facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/adminHistoEvent.xhtml?faces-redirect=true");
		
		return events;
	}
	
	public List<Commande> commandeByIdEvent(int id){
		commandes = proxyCommande.findByIdEvent(id);
		prixTotal=0d;
		//calcule periode
		Event toto=proxyEvent.find(id);
		Long diDi = (toto.getDateFin().getTime()-toto.getDateDebut().getTime())/(1000*60*60*24);
		for (Commande commande : commandes) {
			
			prixTotal+=(commande.getArticle().getPrix()*commande.getQuantite()*diDi);
		}
		 FacesContext facesContext = FacesContext.getCurrentInstance();
		 facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/adminHistoCommande.xhtml?faces-redirect=true");
		return commandes;
	}
	
	

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public UserIBusiness getProxyUser() {
		return proxyUser;
	}

	public void setProxyUser(UserIBusiness proxyUser) {
		this.proxyUser = proxyUser;
	}

	public User getAjoutUser() {
		return ajoutUser;
	}

	public void setAjoutUser(User ajoutUser) {
		this.ajoutUser = ajoutUser;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public EventIBusiness getProxyEvent() {
		return proxyEvent;
	}

	public void setProxyEvent(EventIBusiness proxyEvent) {
		this.proxyEvent = proxyEvent;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Double getTotalCommande() {
		return totalCommande;
	}

	public void setTotalCommande(Double totalCommande) {
		this.totalCommande = totalCommande;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public CommandeIBusiness getProxyCommande() {
		return proxyCommande;
	}

	public void setProxyCommande(CommandeIBusiness proxyCommande) {
		this.proxyCommande = proxyCommande;
	}
	
	public VilleMb getVilleMb() {
		return villeMb;
	}

	public void setVilleMb(VilleMb villeMb) {
		this.villeMb = villeMb;
	}

	public VilleIBusiness getProxyVille() {
		return proxyVille;
	}

	public void setProxyVille(VilleIBusiness proxyVille) {
		this.proxyVille = proxyVille;
	}

	public User getUserEvent() {
		return userEvent;
	}

	public void setUserEvent(User userEvent) {
		this.userEvent = userEvent;
	}

	public String getDATE_FORMAT() {
		return DATE_FORMAT;
	}

	public void setDATE_FORMAT(String dATE_FORMAT) {
		DATE_FORMAT = dATE_FORMAT;
	}

}


