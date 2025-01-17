package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nom")
     private String nom;
	
	@Column(name="prenom")
    private String prenom;
	
	@Column(name="dateDeNaissance")
	@Temporal(TemporalType.DATE)
    private Date dateDeNaissance;
	
	@Column(name="numTelPortable")
    private String numTelPortable;
	
	@Column(name="numTelFixe")
    private String numTelFixe;
	
	@Column(name="adresseMail")
    private String adresseMail;
	
	@Column(name="adresse")
    private String adresse;
	
	@Column(name="dateInscription")
	@Temporal(TemporalType.DATE)
    private Date dateInscription;
	
	@Column(name="dateDesinscription")
    private String dateDesinscription;
	
	@Column(name="login")
    private String login;
	
	@Column(name="password")
    private String password;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private Ville ville;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Event> events;
	
	@OneToMany(mappedBy="user")
	private List<Message> messages;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getNumTelPortable() {
		return numTelPortable;
	}

	public void setNumTelPortable(String numTelPortable) {
		this.numTelPortable = numTelPortable;
	}

	public String getNumTelFixe() {
		return numTelFixe;
	}

	public void setNumTelFixe(String numTelFixe) {
		this.numTelFixe = numTelFixe;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getDateDesinscription() {
		return dateDesinscription;
	}

	public void setDateDesinscription(String dateDesinscription) {
		this.dateDesinscription = dateDesinscription;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public User(Integer id, String nom, String prenom, Date dateDeNaissance, String numTelPortable, String numTelFixe,
			String adresseMail, String adresse, Date dateInscription, String dateDesinscription, String login,
			String password, Ville ville, List<Event> events, List<Message> messages) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.numTelPortable = numTelPortable;
		this.numTelFixe = numTelFixe;
		this.adresseMail = adresseMail;
		this.adresse = adresse;
		this.dateInscription = dateInscription;
		this.dateDesinscription = dateDesinscription;
		this.login = login;
		this.password = password;
		this.ville = ville;
		this.events = events;
		this.messages = messages;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}





}
