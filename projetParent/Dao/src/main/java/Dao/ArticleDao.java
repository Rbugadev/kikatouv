package Dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Article;
import Entities.Commande;
import Entities.EventQuantite;
import Entities.MajStock;
import Entities.SousCategorie;
import IDao.ArticleIDao;


@Remote(ArticleIDao.class)
@Stateless
public class ArticleDao extends DAO implements ArticleIDao{

	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;

	@Override
	public List<Article> getAll() {
		
		Query query = em.createQuery("SELECT a from Article a",Article.class);
		List<Article> articles= query.getResultList();
		return articles;		
	}

	@Override
	public List<Article> getAllByIdSousCat(int id) {
		Query query = em.createQuery("SELECT plop from Article plop WHERE plop.sousCategorie.id=:id",Article.class);
		query.setParameter("id", id);
		List<Article> articles = query.getResultList();
		
		return articles;
	}

	@Override
	public List<Commande>  getAllCommandeByIdArticle(int id) {
		Query query = em.createQuery("SELECT ms from Commande ms WHERE ms.article.id=:id",Commande.class);
		query.setParameter("id", id);
		List<Commande> commandes = query.getResultList();
		return commandes;
	}
	
	@Override
	public List<MajStock> getAllStockByIdArticle(int id) {
		Query query = em.createQuery("SELECT ms from MajStock ms WHERE ms.article.id=:id",MajStock.class);
		query.setParameter("id", id);
		List<MajStock> stocks = query.getResultList();
		return stocks;
	}
	
	@Override
	public int findQtyArticleBooked(int id, Date dateDebut, Date dateFin) {
		Query query = em.createQuery(
		"SELECT new EventQuantite (e.dateDebut, e.dateFin, c.quantite) "
		+ "from Commande c "
		+ "INNER JOIN Event e"
		+ "ON c.event_id = e.id"
		+ "WHERE c.article_id=:id"
		+ "AND (:dateDebut <= e.dateFin and :dateFin >= e.dateDebut)",Commande.class);
		query.setParameter("id", id).setParameter("dateDebut", dateDebut).setParameter("dateFin", dateFin);
		//query.setParameter("id", id, "dateDebut", dateDebut, "dateFin", dateFin);
		List<EventQuantite> eventQuantites = query.getResultList();
		int qtyArticleBooked = 0;
		Date d = new Date();
		for (d.equals(dateDebut); d.equals(dateFin); d = ajouterJour(d)) 
		{
			int qtyArticleBookedDay = 0;
			for (EventQuantite eventQuantite: eventQuantites) 
			{
				if (d.after(eventQuantite.getDateDebut()) && d.before(eventQuantite.getDateFin()))
				{
					qtyArticleBookedDay += eventQuantite.getQuantite();
				}
			}
			if (qtyArticleBookedDay > qtyArticleBooked)
			{
				qtyArticleBooked = qtyArticleBookedDay;
			}
		}
		
		return qtyArticleBooked;
	}
	public static Date ajouterJour(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
		}
}
