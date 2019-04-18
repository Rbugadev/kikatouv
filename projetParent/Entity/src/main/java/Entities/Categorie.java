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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorie")
public class Categorie implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nom")
     private String nom;
	
	@Column(name="description", length=800)
	private String description;	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="categorie",cascade=CascadeType.ALL)
	private List<SousCategorie> sousCategories;

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

	public List<SousCategorie> getSousCategories() {
		return sousCategories;
	}

	public void setSousCategories(List<SousCategorie> sousCategories) {
		this.sousCategories = sousCategories;
	}

	public Categorie(Integer id, String nom, List<SousCategorie> sousCategories) {
		super();
		this.id = id;
		this.nom = nom;
		this.sousCategories = sousCategories;
	}

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return nom;
	}



}
