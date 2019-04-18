package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entities.Event;
import Entities.Mouvement;
import Entities.TypeMouvement;
import Entities.User;
import IBusiness.MouvementIBusiness;
import IBusiness.TypeMouvementIBusiness;

@ManagedBean(name="mbMouvement")
@SessionScoped
public class MouvementMB implements Serializable{


	private static final long serialVersionUID = 1L;

	@EJB
	private MouvementIBusiness proxyMouvement;
	
	private List<Mouvement> AllMouvementById = new ArrayList<Mouvement>();
	private Mouvement ajoutMouvement = new Mouvement();
	private TypeMouvement selectedTypeMouvement = new TypeMouvement();
	
	@PostConstruct
	public void init() {
		AllMouvementById = proxyMouvement.getAllByIdTypeMouvement(2);
	}
	
	public String addMouvement() {
		
		ajoutMouvement.setTypeMouvement(selectedTypeMouvement);
		
		//problème avec récupération date: en attendant on force à la date du jour 
		ajoutMouvement.setDate(new Date());
		

		proxyMouvement.create(ajoutMouvement);
		
		ajoutMouvement = new Mouvement();
		
		return "/NewFile.html";
		
	}
		
	public MouvementIBusiness getProxyMouvement() {
		return proxyMouvement;
	}

	public void setProxyMouvement(MouvementIBusiness proxyMouvement) {
		this.proxyMouvement = proxyMouvement;
	}

	public List<Mouvement> getAllMouvementById() {
		return AllMouvementById;
	}

	public void setAllMouvementById(List<Mouvement> allMouvementById) {
		AllMouvementById = allMouvementById;
	}

	public Mouvement getAjoutMouvement() {
		return ajoutMouvement;
	}

	public void setAjoutMouvement(Mouvement ajoutMouvement) {
		this.ajoutMouvement = ajoutMouvement;
	}

	public TypeMouvement getSelectedTypeMouvement() {
		return selectedTypeMouvement;
	}

	public void setSelectedTypeMouvement(TypeMouvement selectedTypeMouvement) {
		this.selectedTypeMouvement = selectedTypeMouvement;
	}
	

}
