package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ville")
public class Ville implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nom")
    private String nom;
	
	@Column(name="codePostal")
	private String codePostal;
	
	@OneToMany(mappedBy="ville",cascade=CascadeType.ALL)
	private List<User> users;
	
	@OneToMany(mappedBy="ville",cascade=CascadeType.ALL)
	private List<Event> events;

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

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Ville(Integer id, String nom, String codePostal, List<User> users, List<Event> events) {
		super();
		this.id = id;
		this.nom = nom;
		this.codePostal = codePostal;
		this.users = users;
		this.events = events;
	}

	public Ville() {
		super();
	}

	@Override
	public String toString() {
		return  nom ;
	}
	
}
