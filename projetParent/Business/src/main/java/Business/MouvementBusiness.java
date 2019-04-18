package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.Event;
import Entities.Mouvement;
import IBusiness.MouvementIBusiness;
import IDao.MouvementIDao;


@Remote(MouvementIBusiness.class)
@Stateless
public class MouvementBusiness implements MouvementIBusiness {

	@EJB
	private MouvementIDao proxyMouvement;
	
	
	@Override
	public List<Mouvement> getAll() {
		// TODO Auto-generated method stub
		return proxyMouvement.getAll();
	}


	@Override
	public List<Mouvement> getAllByIdTypeMouvement(int id) {
		
		return proxyMouvement.getAllByIdTypeMouvement(id);
	}

	@Override
	public Mouvement create(Mouvement a) {
		proxyMouvement.create(a);
		int id = proxyMouvement.getLastId();
		a.setId(id);
		return a;
	}
	
	@Override
	public Mouvement delete(Mouvement a) {
		proxyMouvement.delete(a);
		return a;
	}

	@Override
	public Mouvement update(Mouvement a) {
		proxyMouvement.update(a);
		return a;
	}

	@Override
	public Mouvement find(int id) {
		
		return proxyMouvement.find(Mouvement.class, id);
	}

}
