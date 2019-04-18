package IBusiness;

import java.util.List;

import Entities.TypeMouvement;

public interface TypeMouvementIBusiness {

	TypeMouvement create(TypeMouvement typeMouvement);
	TypeMouvement delete(TypeMouvement typeMouvement);
	TypeMouvement update(TypeMouvement typeMouvement);
	TypeMouvement find(int id);
	TypeMouvement findByNom(String nom);
	List<TypeMouvement> getAll();

}
