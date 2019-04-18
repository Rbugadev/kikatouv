package IDao;

import java.util.List;

import Entities.SousCategorie;

public interface SousCategorieIDao extends IDAO{
	
	List<SousCategorie> getAllByIdCategorie(int id);

}
