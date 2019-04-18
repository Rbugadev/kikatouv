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
@Table(name="mouvement")
public class Mouvement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="description")
	private String description;

	@OneToMany(fetch=FetchType.EAGER,mappedBy="mouvement",cascade=CascadeType.ALL)
	private List<MajStock> majStocks;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private TypeMouvement typeMouvement;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TypeMouvement getTypeMouvement() {
		return typeMouvement;
	}

	public void setTypeMouvement(TypeMouvement typeMouvement) {
		this.typeMouvement = typeMouvement;
	}


	public List<MajStock> getMajStocks() {
		return majStocks;
	}

	public void setMajStocks(List<MajStock> majStocks) {
		this.majStocks = majStocks;
	}

	public Mouvement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mouvement(Integer id, Date date, List<MajStock> majStocks, TypeMouvement typeMouvement) {
		super();
		this.id = id;
		this.date = date;
		this.majStocks = majStocks;
		this.typeMouvement = typeMouvement;
	}

	@Override
	public String toString() {
		return "Mouvement [date=" + date + "]";
	}

	

	

	
	
}
