package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Mouvement;
import IDao.MouvementIDao;

@Remote(MouvementIDao.class)
@Stateless
public class MouvementDao extends DAO implements MouvementIDao{

	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;
	


	@Override
	public List<Mouvement> getAll() {
		
		Query query = em.createQuery("SELECT a from Mouvement a",Mouvement.class);
		List<Mouvement> mouvements= query.getResultList();
		return mouvements;
		
				
	}


	@Override
	public List<Mouvement> getAllByIdTypeMouvement(int id) {
		Query query = em.createQuery("SELECT plop from Mouvement plop WHERE plop.typeMouvement.id=:id",Mouvement.class);
		query.setParameter("id", id);
		List<Mouvement> mouvements = query.getResultList();
		
		return mouvements;
	}

	@Override
	public int getLastId() {
		Query query = em.createQuery("SELECT max(e.id) from Mouvement e");
		int id = (Integer)query.getSingleResult();
		return id;
	}

}
