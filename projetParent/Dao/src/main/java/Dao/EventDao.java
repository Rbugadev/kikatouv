package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Event;
import IDao.EventIDao;


@Remote(EventIDao.class)
@Stateless
public class EventDao extends DAO implements EventIDao{

	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;
	
	@Override
	public List<Event> getAll() {
		Query query = em.createQuery("SELECT e from Event e",Event.class);
		List<Event> events= query.getResultList();
		return events;
	}

	@Override
	public List<Event> findByIdCommande(int id) {
		Query query = em.createQuery("SELECT e from Event e WHERE e.commande.id=:id",Event.class);
		query.setParameter("id", id);
		List<Event> events = query.getResultList();
		return events;
	}

	@Override
	public List<Event> getAllByIdUser(int id) {
		Query query = em.createQuery("SELECT e from Event e WHERE e.user.id=:id",Event.class);
		query.setParameter("id", id);
		List<Event> events = query.getResultList();
		return events;
	}

	@Override
	public int getLastId() {
		Query query = em.createQuery("SELECT max(e.id) from Event e");
		int id = (Integer)query.getSingleResult();
		return id;
	}

	@Override
	public List<Event> findNoRetour() {
		Query query = em.createQuery("SELECT e from Event e WHERE e.dateRetour IS NULL AND e.dateFin < CURRENT_DATE ORDER BY e.dateFin",Event.class);
		List<Event> events = query.getResultList();

		return events;
	}
	
	
	
	
	
}
