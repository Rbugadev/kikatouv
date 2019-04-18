package Business;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.Article;
import Entities.Commande;
import Entities.MajStock;
import IBusiness.ArticleIBusiness;
import IDao.ArticleIDao;

@Remote(ArticleIBusiness.class)
@Stateless
public class ArticleBusiness implements ArticleIBusiness {

	@EJB
	private ArticleIDao proxyArticle;
	
	
	@Override
	public List<Article> getAll() {
		// TODO Auto-generated method stub
		return proxyArticle.getAll();
	}


	@Override
	public List<Article> getAllByIdSousCat(int id) {
		
		return proxyArticle.getAllByIdSousCat(id);
	}

	@Override
	public Article create(Article a) {
	 proxyArticle.create(a);
		return a;
	}

	@Override
	public Article delete(Article a) {
		proxyArticle.delete(a);
			return a;
	}

	@Override
	public Article update(Article a) {
		proxyArticle.update(a);
		return a;
	}

	@Override
	public Article find(int id) {
		
		return proxyArticle.find(Article.class, id);
	}
	
	@Override
	public int findQtyStock(int id) {
		int qtyTotal = 0;
		List<MajStock> stocks = proxyArticle.getAllStockByIdArticle(id);
		for (MajStock stock: stocks) 
		{
			qtyTotal += stock.getQuantite();
		}
		return qtyTotal;
	}

	@Override
	public int findQtyCmd(int id) {
		Date dateDuJour = new Date();
		//System.out.println("articleid : " + id);
		int qtySortie = 0;
		List<Commande> commandes = proxyArticle.getAllCommandeByIdArticle(id);
		for (Commande commande: commandes) 
		{
			Date dateDebut = commande.getEvent().getDateDebut();
			// la date de fin n'est pas prise en compte...que faire quand elle est dépassé et pas dateRetour ???? règle métier !
			Date dateFin = commande.getEvent().getDateFin();
			Date dateRetour = commande.getEvent().getDateRetour();
			Date dateValidation = commande.getEvent().getDateValidation();
			
			if ((dateValidation != null) // event valide
				&& (!dateDebut.after(dateDuJour)) // event commencé : avant ou le même jour que 
				&& (dateRetour == null)) // et articles non retournés
			{
				//System.out.println("Event pris en compte : " + dateDebut);
				qtySortie += commande.getQuantite();
				//System.out.println("sortie : " + commande.getQuantite());
			}
		}
		return qtySortie;
	}

	@Override
	public int findQtyPerte(Integer id) {
		Date dateDuJour = new Date();
		//System.out.println("articleid : " + id);
		int qtySortie = 0;
		List<Commande> commandes = proxyArticle.getAllCommandeByIdArticle(id);
		for (Commande commande: commandes) 
		{
			Date dateDebut = commande.getEvent().getDateDebut();
			// la date de fin n'est pas prise en compte...que faire quand elle est dépassé et pas dateRetour ???? règle métier !
			Date dateFin = commande.getEvent().getDateFin();
			Date dateRetour = commande.getEvent().getDateRetour();
			Date dateValidation = commande.getEvent().getDateValidation();
			
			if ((dateValidation != null) // event valide
				&& (!dateDebut.after(dateDuJour)) // event commencé : avant ou le même jour que
				&& (dateRetour != null)) // et articles retournés
			{
				//System.out.println("Event pris en compte : " + dateDebut);
				qtySortie += commande.getQuantite();
				//System.out.println("sortie : " + commande.getQuantite());
				qtySortie -= commande.getQuantiteRetour();
				//System.out.println("entrée : " + commande.getQuantiteRetour());
			}
		}
		return qtySortie;
	}
	
	private static Date ajouterJour(Date date) 
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}
	
	private int articleDisponibleJour(int id, Date date) {
		//System.out.println("articleid : " + id);
		int qtySortie = 0;
		List<Commande> commandes = proxyArticle.getAllCommandeByIdArticle(id);
		for (Commande commande: commandes) 
		{
			Date dateDebut = commande.getEvent().getDateDebut();
			// la date de fin n'est pas prise en compte...que faire quand elle est dépassé et pas dateRetour ???? règle métier !
			Date dateFin = commande.getEvent().getDateFin();
			Date dateRetour = commande.getEvent().getDateRetour();
			Date dateValidation = commande.getEvent().getDateValidation();
			
			if ((dateValidation != null) // event valide
				&& (!dateDebut.after(date))) // event commencé : avant ou le même jour que 
			{
				//System.out.println("Event pris en compte : " + dateDebut);
				qtySortie += commande.getQuantite();
				//System.out.println("sortie : " + commande.getQuantite());
				if (dateRetour != null) 
				{
					qtySortie -= commande.getQuantiteRetour();
					//System.out.println("entrée : " + commande.getQuantiteRetour());
				}
			}
			else {
				//System.out.println("Event NON pris en compte : " + dateDebut);
			}
		}
		return qtySortie;
	}
	/*
	@Override
	public int articleDisponiblePeriode(int id, Date datePeriodeDebut, Date datePeriodeFin) 
	{
		int qty = 0;
		Date datePeriode = datePeriodeDebut;  
		while (!datePeriode.after(datePeriodeFin)) 
		{
			System.out.println(datePeriode);
			int qtyDatePeriode = articleDisponibleJour(id, datePeriode);
			if (qtyDatePeriode < qty) 
			{
				qty = qtyDatePeriode;
			}
			datePeriodeDebut = ajouterJour(datePeriodeDebut);
		}
		return (qty>0?qty:0); // valeur négative ?
	}
	*/
	@Override
	public int findQtyArticleBooked(int id, Date dateDebut, Date dateFin) {
		// TODO Auto-generated method stub
		return proxyArticle.findQtyArticleBooked(id, dateDebut, dateFin);
	}



}
