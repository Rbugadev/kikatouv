package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Entities.Event;
import Entities.Mouvement;
import Entities.TypeMouvement;
import Entities.User;
import IBusiness.MouvementIBusiness;
import IBusiness.TypeMouvementIBusiness;

@ManagedBean(name="mbAdminMouvement")
@SessionScoped
public class MouvementAdminMb implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private MouvementIBusiness proxyMouvement;
	@EJB
	private TypeMouvementIBusiness proxyTypeMouvement;
	
	private List<TypeMouvement> AllTypeMouvement = new ArrayList<TypeMouvement>();
	
	private List<Mouvement> mouvements = new ArrayList<Mouvement>();
	private int mouvementSelectedId;
	private Mouvement mouvementSelected;
	
	private Mouvement ajoutMouvement = new Mouvement();

	@PostConstruct
	public void init() 
	{
		AllTypeMouvement = proxyTypeMouvement.getAll();
		mouvements = proxyMouvement.getAll();
		ajoutMouvement = new Mouvement();
		ajoutMouvement.setDate(new Date());
	}
	
	public void initMouvementSelected() 
	{
		if (mouvementSelectedId != 0) 
		{
			mouvementSelected = proxyMouvement.find(mouvementSelectedId);
		}
	}
	
	public void addMouvement() 
	{
		// création déportée au moment de l'enregistrement des majStock
		//ajoutMouvement = proxyMouvement.create(ajoutMouvement);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,"/affichageArticleStock.xhtml?faces-redirect=true");
	}

	// getters and Setters
	
	public MouvementIBusiness getProxyMouvement() {
		return proxyMouvement;
	}

	public int getMouvementSelectedId() {
		return mouvementSelectedId;
	}

	public void setMouvementSelectedId(int mouvementSelectedId) {
		this.mouvementSelectedId = mouvementSelectedId;
	}

	public List<Mouvement> getMouvements() {
		return mouvements;
	}

	public void setMouvements(List<Mouvement> mouvements) {
		this.mouvements = mouvements;
	}

	public Mouvement getMouvementSelected() {
		return mouvementSelected;
	}

	public void setMouvementSelected(Mouvement mouvementSelected) {
		this.mouvementSelected = mouvementSelected;
	}

	public void setProxyMouvement(MouvementIBusiness proxyMouvement) {
		this.proxyMouvement = proxyMouvement;
	}

	public TypeMouvementIBusiness getProxyTypeMouvement() {
		return proxyTypeMouvement;
	}

	public void setProxyTypeMouvement(TypeMouvementIBusiness proxyTypeMouvement) {
		this.proxyTypeMouvement = proxyTypeMouvement;
	}

	public List<TypeMouvement> getAllTypeMouvement() {
		return AllTypeMouvement;
	}

	public void setAllTypeMouvement(List<TypeMouvement> allTypeMouvement) {
		AllTypeMouvement = allTypeMouvement;
	}

	public Mouvement getAjoutMouvement() {
		return ajoutMouvement;
	}

	public void setAjoutMouvement(Mouvement ajoutMouvement) {
		this.ajoutMouvement = ajoutMouvement;
	}
	
}
