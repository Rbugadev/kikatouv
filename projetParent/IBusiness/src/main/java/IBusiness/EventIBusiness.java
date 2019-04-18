package IBusiness;

import java.util.List;

import Entities.Event;

public interface EventIBusiness {
	Event create(Event e);
	Event delete(Event e);
	Event update(Event e);
	Event find (int id);
	List<Event> findByIdCommande(int id);
	List<Event> getAllByIdUser(int id);
	List<Event> findNoRetour();
}
