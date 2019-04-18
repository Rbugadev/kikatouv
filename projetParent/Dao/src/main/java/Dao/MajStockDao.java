package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.MajStock;
import IDao.MajStockIDao;


@Remote(MajStockIDao.class)
@Stateless
public class MajStockDao extends DAO implements MajStockIDao{

	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;
	
	
	@Override
	public List<MajStock> getAll() {
		Query query = em.createQuery("SELECT e from MajStock e",MajStock.class);
		List<MajStock> stocks= query.getResultList();
		return stocks;
	}

	@Override
	public List<MajStock> findByIdMouvement(int id) {
		Query query = em.createQuery("SELECT majs from Mouvement majs WHERE majs.mouvement.id=:id",MajStock.class);
		query.setParameter("id", id);
		List<MajStock> stocks = query.getResultList();
		return stocks;
	}

	@Override
	public List<MajStock> findByIdArticle(int id) {
		Query query = em.createQuery("SELECT majs from MajStock majs WHERE majs.article.id=:id",MajStock.class);
		query.setParameter("id", id);
		List<MajStock> stocks = query.getResultList();
		return stocks;
	}

}
