package Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import IDao.IDAO;

public class DAO implements IDAO {

	
	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;
	
	@Override
	public <T> T create(T obj) {
		 em.persist(obj);
		return obj;
		
	}

	@Override
	public <T> void delete(T obj) {
		em.remove(obj);
		
	}

	@Override
	public <T> T update(T obj) {
		em.merge(obj);
		return obj;
	}

	@Override
	public <T> T find(Class<T> c, int id) {
		// TODO Auto-generated method stub
		return em.find(c,id);
	}
	

	
	

}
