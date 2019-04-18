package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name="event")
public class Event implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="dateDebut")
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Column(name="dateFin")
	 @Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Column(name="dateValidation")
	@Temporal(TemporalType.DATE)
	private Date dateValidation;
	
	@Column(name="rueLivraison")
	private String rueLivraison;
	
	@Column(name="dateRetour")
	@Temporal(TemporalType.DATE)
	private Date dateRetour;
	
	

	@OneToMany(fetch= FetchType.LAZY, mappedBy="event",cascade=CascadeType.ALL)
	private List<Commande> commandes;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Ville ville;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}
	

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Date getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	public String getRueLivraison() {
		return rueLivraison;
	}
	

	public void setRueLivraison(String rueLivraison) {
		this.rueLivraison = rueLivraison;
	}
	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	
	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public Event(Integer id, Date dateDebut, Date dateFin, Date dateValidation, String rueLivraison, Date dateRetour,
		 Ville ville, User user) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateValidation = dateValidation;
		this.rueLivraison = rueLivraison;
		this.dateRetour = dateRetour;
		this.ville = ville;
		this.user = user;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	
	
	

}
