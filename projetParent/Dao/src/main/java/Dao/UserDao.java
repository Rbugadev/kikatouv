package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Article;
import Entities.User;
import IDao.UserIDao;

@Remote(UserIDao.class)
@Stateless
public class UserDao extends DAO implements UserIDao{
	
	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;



	@Override
	public User connection(String log, String mdp) {
		Query query = em.createQuery("SELECT u from User u WHERE u.login=:login and u.password=:password",User.class);
		query.setParameter("login", log);
		query.setParameter("password", mdp);
		User robert = (User) query.getSingleResult();
		return robert;
	}



	@Override
	public List<User> getAll() {
		Query query = em.createQuery("SELECT u from User u",User.class);
		List<User> users= query.getResultList();
		return users;
		
	}

}


 