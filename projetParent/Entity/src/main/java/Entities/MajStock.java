package Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="majStock")
public class MajStock implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="quantite")
	private int quantite;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Article article;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Mouvement mouvement;

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

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}


	@Override
	public String toString() {
		return "MajStock [id=" + id + ", quantite=" + quantite + ", article=" + article + ", mouvement=" + mouvement
				+ "]";
	}

	public MajStock(Integer id, int quantite, Article article, Mouvement mouvement) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.article = article;
		this.mouvement = mouvement;
	}

	public Mouvement getMouvement() {
		return mouvement;
	}

	public void setMouvement(Mouvement mouvement) {
		this.mouvement = mouvement;
	}

	public MajStock() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	

}
