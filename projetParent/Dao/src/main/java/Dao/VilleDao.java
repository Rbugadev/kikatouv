package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Ville;
import IDao.VilleIDao;

@Remote(VilleIDao.class)
@Stateless
public class VilleDao extends DAO implements VilleIDao {
	
	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;

	@Override
	public List<Ville> getAll() {
		Query query = em.createQuery("SELECT v from Ville v",Ville.class);
		List<Ville> villes= query.getResultList();
		return villes;
	}

	@Override
	public Ville findByCp(String cp) {
		Ville v = null;
		Query query = em.createQuery("SELECT v from Ville v WHERE v.codePostal=:cp",Ville.class);
		query.setParameter("cp", cp);
		
		try {
			v= (Ville)query.getSingleResult();
		} catch (Exception e) {
			v = null;
		}

		return v;
	}

	@Override
	public int getLastId() {
		Query query = em.createQuery("SELECT max(v.id) from Ville v");
		int id = (Integer)query.getSingleResult();
		return id;
	}

}
