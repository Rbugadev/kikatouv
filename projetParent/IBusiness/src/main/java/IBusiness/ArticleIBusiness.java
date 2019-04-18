package IBusiness;

import java.util.Date;
import java.util.List;

import Entities.Article;

public interface ArticleIBusiness {
	
	Article create(Article a);
	Article delete(Article a);
	Article update(Article a);
	Article find (int id);
	List<Article> getAll();
	List<Article> getAllByIdSousCat(int id);
	int findQtyStock(int id);
	int findQtyCmd(int id);
	int findQtyPerte(Integer id);
	int findQtyArticleBooked(int id, Date dateDebut, Date dateFin);

}
