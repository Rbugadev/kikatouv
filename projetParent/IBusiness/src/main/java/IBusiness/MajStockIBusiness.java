package IBusiness;

import java.util.List;

import Entities.MajStock;

public interface MajStockIBusiness {
	MajStock create(MajStock s);
	MajStock delete(MajStock s);
	MajStock update(MajStock s);
	MajStock find (int id);
	List<MajStock> findByIdMouvement(int id);
	List<MajStock> getAll();
	List<MajStock> findByIdArticle(int id);

}
