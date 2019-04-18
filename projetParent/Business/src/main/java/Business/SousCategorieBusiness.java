package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.SousCategorie;
import IBusiness.SousCategorieIBusiness;
import IDao.SousCategorieIDao;

@Remote(SousCategorieIBusiness.class)
@Stateless
public class SousCategorieBusiness implements SousCategorieIBusiness{

	@EJB
	private SousCategorieIDao proxySousCategorie;
	
	@Override
	public List<SousCategorie> getAllByIdCategorie(int id) {
	
		return proxySousCategorie.getAllByIdCategorie(id);
	}

	@Override
	public SousCategorie create(SousCategorie s) {
		// TODO Auto-generated method stub
		return proxySousCategorie.create(s);
	}

	@Override
	public SousCategorie delete(SousCategorie s) {
		// parce que les ptit comment dans le code qui serve a rien c'est toujours drole de tomber dessus
		 proxySousCategorie.delete(s);
		return s;
	}

	@Override
	public SousCategorie update(SousCategorie s) {
		// TODO Auto-generated method stub
		return proxySousCategorie.update(s);
	}

	@Override
	public SousCategorie find(int id) {
		// TODO Auto-generated method stub
		return proxySousCategorie.find(SousCategorie.class, id);
	}

}
