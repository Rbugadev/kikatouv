package Entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="commande")
public class Commande implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="quantiteRetour")
	private int quantiteRetour;
	
	public int getQuantiteRetour() {
		return quantiteRetour;
	}

	public void setQuantiteRetour(int quantiteRetour) {
		this.quantiteRetour = quantiteRetour;
	}

	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Event event;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Article article;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}



	public Commande(Integer id, int quantite, int quantiteRetour, Event event, Article article) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.quantiteRetour = quantiteRetour;
		this.event = event;
		this.article = article;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	


	
	
	
	

}
