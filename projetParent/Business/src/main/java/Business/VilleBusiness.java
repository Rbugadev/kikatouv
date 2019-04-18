package Business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.Ville;
import IBusiness.VilleIBusiness;
import IDao.VilleIDao;

@Remote(VilleIBusiness.class)
@Stateless
public class VilleBusiness implements VilleIBusiness {

	@EJB
	private VilleIDao proxyVille;

	@Override
	public Ville create(Ville ville) {
		Ville v = proxyVille.findByCp(ville.getCodePostal());
		if (v != null) {			
			return v;
		}
		else {
			proxyVille.create(ville);
			int id = proxyVille.getLastId();
			ville.setId(id);
			return ville;
		}
	}

	@Override
	public Ville delete(Ville ville) {
		proxyVille.delete(ville);
		return ville;
	}

	@Override
	public Ville update(Ville ville) {
		// TODO Auto-generated method stub
		proxyVille.update(ville);
		return ville;
	}

	@Override
	public Ville find(int id) {
		return proxyVille.find(Ville.class, id);
	}
	
}
