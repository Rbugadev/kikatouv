package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import Entities.SousCategorie;
import IDao.SousCategorieIDao;


@Remote(SousCategorieIDao.class)
@Stateless
public class SousCategorieDAO extends DAO implements SousCategorieIDao{

	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;
	
	@Override
	public List<SousCategorie> getAllByIdCategorie(int id) {
		Query query = em.createQuery("SELECT plop from SousCategorie plop WHERE plop.categorie.id=:id",SousCategorie.class);
		query.setParameter("id", id);
		List<SousCategorie> sousCategories= query.getResultList();
		return sousCategories;
		
	}

}


