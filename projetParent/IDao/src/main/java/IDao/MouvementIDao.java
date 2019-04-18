package IDao;

import java.util.List;

import Entities.Mouvement;

public interface MouvementIDao extends IDAO {
	List<Mouvement> getAll();
	List<Mouvement> getAllByIdTypeMouvement(int id);
	int getLastId();
}
