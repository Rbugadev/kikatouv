package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import Entities.SousCategorie;
import IBusiness.SousCategorieIBusiness;

@ManagedBean(name="mbSousCat")
@SessionScoped
public class SousCategorieMb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@EJB
	private SousCategorieIBusiness proxySousCategorie;
	
	private List<SousCategorie> allCatById = new ArrayList<SousCategorie>();
	
	
	// initialisé par l'argument de URL
	private int sousCatSelect;
	
	//@PostConstruct
	public void init() {
		allCatById = proxySousCategorie.getAllByIdCategorie(sousCatSelect);
	}

	public List<SousCategorie> getAllCatById() {
		return allCatById;
	}

	public void setAllCatById(List<SousCategorie> allCatById) {
		this.allCatById = allCatById;
	}


	public int getSousCatSelect() {
		return sousCatSelect;
	}

	public void setSousCatSelect(int sousCatSelect) {
		this.sousCatSelect = sousCatSelect;
	}

	public SousCategorieIBusiness getProxySousCategorie() {
		return proxySousCategorie;
	}

	public void setProxySousCategorie(SousCategorieIBusiness proxySousCategorie) {
		this.proxySousCategorie = proxySousCategorie;
	}
	

}
