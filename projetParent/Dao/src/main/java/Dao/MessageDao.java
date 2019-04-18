package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Article;
import Entities.Message;
import IDao.MessageIDao;

@Remote(MessageIDao.class)
@Stateless
public class MessageDao extends DAO implements MessageIDao {

	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;

	@Override
	public List<Message> getAll() {
		Query query = em.createQuery("SELECT message from Message message");
		List<Message> messages = query.getResultList();
		return messages;
	}

	@Override
	public List<Message> getByIdArticle(int id) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT plop from Message plop WHERE plop.article.id=:id",Message.class);
		query.setParameter("id", id);
		List<Message> messages = query.getResultList();
		
		return messages;
	}

	@Override
	public void testDelete(Message message) {
		Message messRemoved = em.getReference(Message.class, message.getId());
		System.out.println("_______________" + messRemoved.getTexte());
		em.remove(messRemoved);
		//em.remove(message);
		System.out.println("removes");
		
	}
	
	

}
