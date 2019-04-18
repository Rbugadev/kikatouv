package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import Entities.Commande;
import IDao.CommandeIDao;

@Remote(CommandeIDao.class)
@Stateless
public class CommandeDao extends DAO implements CommandeIDao{

	
	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;
	
	
	@Override
	public List<Commande> findByIdEvent(int id) {
		Query query = em.createQuery("SELECT plop from Commande plop WHERE plop.event.id=:id",Commande.class);
		query.setParameter("id", id);
		List<Commande> commandes = query.getResultList();
		return commandes;
	}

	@Override
	public void deleteCommande(Commande c) {
		Commande comRemove= em.getReference(Commande.class, c.getId());
		em.remove(comRemove);
		
	}

}
