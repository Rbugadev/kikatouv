package Entities;

import java.io.Serializable;
import java.util.List;

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
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="article")
public class Article implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nom")
    private String nom;
	
	@Column(name="description", length=800)
	private String description;
	
	@Column(name="nomImage")
	private String nomImage;
	
	@Column(name="prix")
	private Double prix;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private SousCategorie sousCategorie;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="article",cascade=CascadeType.ALL)
	private List<Commande> commandes ;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="article")
	private List<Message> messages;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="article",cascade=CascadeType.ALL)
	private List<MajStock> majStocks;
	
	@Transient
	private int quantite;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNomImage() {
		return nomImage;
	}

	public void setNomImage(String nomImage) {
		this.nomImage = nomImage;
	}



	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	

	public SousCategorie getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(SousCategorie sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<MajStock> getMajStocks() {
		return majStocks;
	}

	public void setMajStocks(List<MajStock> majStocks) {
		this.majStocks = majStocks;
	}





	public Article(Integer id, String nom, String description, String nomImage, Double prix,
			SousCategorie sousCategorie, List<Commande> commandes, List<Message> messages, List<MajStock> majStocks) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.nomImage = nomImage;
		this.prix = prix;
		this.sousCategorie = sousCategorie;
		this.commandes = commandes;
		this.messages = messages;
		this.majStocks = majStocks;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}




	

	
}