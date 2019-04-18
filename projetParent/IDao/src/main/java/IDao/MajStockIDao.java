package IDao;

import java.util.List;

import Entities.MajStock;

public interface MajStockIDao extends IDAO {
	List<MajStock> getAll();
	List<MajStock> findByIdMouvement(int id);
	List<MajStock> findByIdArticle(int id);
}
