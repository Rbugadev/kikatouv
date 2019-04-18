package IBusiness;

import java.util.List;

import Entities.Mouvement;

public interface MouvementIBusiness {
	Mouvement create(Mouvement a);
	Mouvement delete(Mouvement a);
	Mouvement update(Mouvement a);
	Mouvement find (int id);
	List<Mouvement> getAll();
	List<Mouvement> getAllByIdTypeMouvement(int id);
}
