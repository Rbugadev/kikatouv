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

@Entity
@Table(name="sousCategorie")
public class SousCategorie implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nom")
    private String nom;

	@ManyToOne
	@JoinColumn(referencedColumnName="id")
    private Categorie categorie;

	@Column(name="description", length=800)
	private String description;
	
	@Column(name="nomImage")
	private String nomImage;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sousCategorie",cascade=CascadeType.ALL)
	private List<Article> articles;

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

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
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

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public SousCategorie(Integer id, String nom, Categorie categorie, List<Article> articles) {
		super();
		this.id = id;
		this.nom = nom;
		this.categorie = categorie;
		this.articles = articles;
	}

	public SousCategorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return nom;
	}

	
}