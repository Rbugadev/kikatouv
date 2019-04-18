package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Categorie;
import IDao.CategorieIDao;

@Remote(CategorieIDao.class)
@Stateless
public class CategorieDao implements CategorieIDao{
	
	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;

	@Override
	public List<Categorie> getAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT categorie from Categorie categorie");
		List<Categorie> categories = query.getResultList();
		return categories;
	}


	


}
