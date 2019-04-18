package IDao;

import java.util.List;

import Entities.TypeMouvement;

public interface TypeMouvementIDao  extends IDAO {
	List<TypeMouvement> getAll();
	TypeMouvement getByNom(String nom);
}
