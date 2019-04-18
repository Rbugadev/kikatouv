package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.Categorie;
import IBusiness.CategorieIBusiness;
import IDao.CategorieIDao;

@Remote(CategorieIBusiness.class)
@Stateless
public class CategorieBusiness implements CategorieIBusiness{
	
	@EJB
	private CategorieIDao proxyCategorie;

	@Override
	public List<Categorie> afficherCategorie() {
		// TODO Auto-generated method stub
		return proxyCategorie.getAll();
	}
	

}
