package IDao;

import java.util.Date;
import java.util.List;

import Entities.Article;
import Entities.Commande;
import Entities.MajStock;

public interface ArticleIDao extends IDAO{

	List<Article> getAll();
	List<Article> getAllByIdSousCat(int id);
	List<MajStock> getAllStockByIdArticle(int id);
	List<Commande> getAllCommandeByIdArticle(int id);
	int findQtyArticleBooked(int id, Date dateDebut, Date dateFin);


}
