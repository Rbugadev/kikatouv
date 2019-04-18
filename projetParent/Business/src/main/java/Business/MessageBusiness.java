package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.Article;
import Entities.Message;
import IBusiness.ArticleIBusiness;
import IBusiness.MessageIBusiness;
import IDao.ArticleIDao;
import IDao.MessageIDao;

@Remote(MessageIBusiness.class)
@Stateless
public class MessageBusiness implements MessageIBusiness {
 
	@EJB
	private MessageIDao proxyMessage;

	
	@Override
	public Message create(Message m) {
		proxyMessage.create(m);
		return m;
	}

	@Override
	public void delete(Message m) {
		//m = proxyMessage.update(m);
		//System.out.println(message);
		
		proxyMessage.delete(m);
		
	}

	@Override
	public Message update(Message m) {
		proxyMessage.update(m);
		return m;
	}

	@Override
	public Message find(int id) {
		return proxyMessage.find(Message.class, id);
	}

	@Override
	public List<Message> getAll() {
		return proxyMessage.getAll();
	}

	@Override
	public List<Message> getAllByIdArticle(int id) {
		// TODO Auto-generated method stub
		return proxyMessage.getByIdArticle(id);
		
	}

	@Override
	public void fuckingRemove(Message message) {
		proxyMessage.testDelete(message);
		
	}

}
