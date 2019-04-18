package IDao;

import java.util.List;

import Entities.Event;

public interface EventIDao extends IDAO{
	List<Event> getAll();
	List<Event> findByIdCommande(int id);
	List<Event> getAllByIdUser(int id);
	List<Event> findNoRetour();
	int getLastId();

}
