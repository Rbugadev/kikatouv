package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.Event;
import IBusiness.EventIBusiness;
import IDao.EventIDao;

@Remote(EventIBusiness.class)
@Stateless
public class EventBusiness implements EventIBusiness{

	@EJB
	private EventIDao proxyEvent;
	
	@Override
	public Event create(Event e) {
		proxyEvent.create(e);
		int id = proxyEvent.getLastId();
		e.setId(id);
		return e;
	}

	@Override
	public Event delete(Event e) {
		proxyEvent.delete(e);
		return e;
	}

	@Override
	public Event update(Event e) {
		proxyEvent.update(e);
		return e;
	}

	@Override
	public Event find(int id) {
		return proxyEvent.find(Event.class, id);
	}

	@Override
	public List<Event> findByIdCommande(int id) {
		return proxyEvent.findByIdCommande(id);
	}

	@Override
	public List<Event> getAllByIdUser(int id) {
		return proxyEvent.getAllByIdUser(id);
	}

	@Override
	public List<Event> findNoRetour() {
		return proxyEvent.findNoRetour();
	}
	

}
