package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entities.Categorie;
import IBusiness.CategorieIBusiness;

@ManagedBean(name="mbCategorie")
@SessionScoped
public class CategorieMb implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private CategorieIBusiness proxyCategorie;
	
	private List<Categorie> allCategories = new ArrayList<Categorie>();
	
	private Categorie categorie = new Categorie();

	private Integer plop;
	

	@PostConstruct
	public void init()
	{
		allCategories = proxyCategorie.afficherCategorie();
		
	}
	public Categorie chargementCat(int catChargement) {
	 plop=catChargement;
		return categorie;
	}
	
	public void initById() {}
	

	public CategorieIBusiness getProxyCategorie() {
		return proxyCategorie;
	}

	public void setProxyCategorie(CategorieIBusiness proxyCategorie) {
		this.proxyCategorie = proxyCategorie;
	}

	public List<Categorie> getAllCategories() {
		return allCategories;
	}

	public void setAllCategories(List<Categorie> allCategories) {
		this.allCategories = allCategories;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Integer getPlop() {
		return plop;
	}
	public void setPlop(Integer plop) {
		this.plop = plop;
	}


	
}
