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
@Table(name="typeMouvement")
public class TypeMouvement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nom")
    private String nom;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="typeMouvement",cascade=CascadeType.ALL)
	private List<Mouvement> mouvements;

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

	public List<Mouvement> getMouvements() {
		return mouvements;
	}

	public void setMouvements(List<Mouvement> mouvements) {
		this.mouvements = mouvements;
	}

	@Override
	public String toString() {
		return "TypeMouvement [id=" + id + ", nom=" + nom + "]";
	}

	public TypeMouvement() {
		super();
	}

	public TypeMouvement(Integer id, String nom, List<Mouvement> mouvements) {
		super();
		this.id = id;
		this.nom = nom;
		this.mouvements = mouvements;
	}
	
	
}
