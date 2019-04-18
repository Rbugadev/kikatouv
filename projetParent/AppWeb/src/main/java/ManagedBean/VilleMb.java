package ManagedBean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entities.Ville;
import IBusiness.VilleIBusiness;

@ManagedBean(name="mbVille")
@SessionScoped
public class VilleMb  implements Serializable {
	private static final long serialVersionUID = 2L;
	
	@EJB
	private VilleIBusiness proxyVille;	

	private Ville ville = new Ville();

	@PostConstruct
	public void init() {
		ville.setId(null);
		ville.setCodePostal(null);
		ville.setNom(null);
	}
	//un commentaire qui sert a rien sauf a push
	
	public String addVille() {
		proxyVille.create(ville);
		ville = new Ville();	
		return null;		
	}

	public VilleIBusiness getProxyVille() {
		return proxyVille;
	}

	public void setProxyVille(VilleIBusiness proxyVille) {
		this.proxyVille = proxyVille;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

}
