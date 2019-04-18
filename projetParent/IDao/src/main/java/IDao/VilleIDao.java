package IDao;

import java.util.List;

import Entities.Ville;

public interface VilleIDao extends IDAO{

	List<Ville> getAll();
	Ville findByCp(String cp);
	int getLastId();
	
}
