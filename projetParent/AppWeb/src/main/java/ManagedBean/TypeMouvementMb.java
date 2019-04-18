package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entities.TypeMouvement;
import IBusiness.TypeMouvementIBusiness;

@ManagedBean(name="mbTypeMouvement")
@SessionScoped
public class TypeMouvementMb implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private TypeMouvementIBusiness proxyTypeBusiness;
	
	private TypeMouvement typeMouvement = new TypeMouvement();

	private List<TypeMouvement> allTypesMouvement = new ArrayList<TypeMouvement>();

	@PostConstruct
	public void init()
	{
		allTypesMouvement = proxyTypeBusiness.getAll();
	}

	public String addTypeMouvement() {
		proxyTypeBusiness.create(typeMouvement);
		typeMouvement = new TypeMouvement();
		return null;
	}

	public TypeMouvementIBusiness getProxyTypeBusiness() {
		return proxyTypeBusiness;
	}

	public void setProxyTypeBusiness(TypeMouvementIBusiness proxyTypeBusiness) {
		this.proxyTypeBusiness = proxyTypeBusiness;
	}

	public TypeMouvement getTypeMouvement() {
		return typeMouvement;
	}

	public void setTypeMouvement(TypeMouvement typeMouvement) {
		this.typeMouvement = typeMouvement;
	}

	public List<TypeMouvement> getAllTypesMouvement() {
		return allTypesMouvement;
	}

	public void setAllTypesMouvement(List<TypeMouvement> allTypesMouvement) {
		this.allTypesMouvement = allTypesMouvement;
	}
	
}
