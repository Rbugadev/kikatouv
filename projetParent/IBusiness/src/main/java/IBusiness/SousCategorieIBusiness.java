package IBusiness;

import java.util.List;

import Entities.SousCategorie;

public interface SousCategorieIBusiness {
	SousCategorie create(SousCategorie s);
	SousCategorie delete(SousCategorie s);
	SousCategorie update(SousCategorie s);
	SousCategorie find(int id);
	List<SousCategorie> getAllByIdCategorie(int id);

}
