package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.TypeMouvement;
import IBusiness.TypeMouvementIBusiness;
import IDao.TypeMouvementIDao;

@Remote(TypeMouvementIBusiness.class)
@Stateless
public class TypeMouvementBusiness implements TypeMouvementIBusiness {

	@EJB
	private TypeMouvementIDao proxyTypeMouvement;
	
	@Override
	public TypeMouvement create(TypeMouvement typeMouvement) {
		proxyTypeMouvement.create(typeMouvement);
		return typeMouvement;
	}

	@Override
	public TypeMouvement delete(TypeMouvement typeMouvement) {
		proxyTypeMouvement.delete(typeMouvement);
		return typeMouvement;
	}

	@Override
	public TypeMouvement update(TypeMouvement typeMouvement) {
		proxyTypeMouvement.update(typeMouvement);
		return typeMouvement;
	}

	@Override
	public TypeMouvement find(int id) {
		return proxyTypeMouvement.find(TypeMouvement.class, id);
	}

	@Override
	public TypeMouvement findByNom(String nom) {
		return proxyTypeMouvement.getByNom(nom);
	}

	@Override
	public List<TypeMouvement> getAll() {
		return proxyTypeMouvement.getAll();
	}
}
