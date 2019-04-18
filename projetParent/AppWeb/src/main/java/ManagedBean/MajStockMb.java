package ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entities.Article;
import Entities.MajStock;
import Entities.Mouvement;
import IBusiness.ArticleIBusiness;
import IBusiness.MajStockIBusiness;
import IBusiness.MouvementIBusiness;


@ManagedBean(name="mbMajStock")
@SessionScoped
public class MajStockMb implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private MajStockIBusiness proxyMajStock;
	
	
	
	//A voir pour plus tard si on a besoin  	// AQ190404
	@EJB
	private ArticleIBusiness proxyArticle;      // AQ190404
	
	@EJB
	private MouvementIBusiness proxyMouvement;	// AQ190404

	
	
	private List<MajStock> allMajStocks = new ArrayList<MajStock>();
	private MajStock ajoutMajStock = new MajStock();
	
	@PostConstruct
	public void init(){
		allMajStocks = proxyMajStock.getAll();
		
	}
	
	public String addMajStock() {
		Article art = new Article();        // AQ190404
		Mouvement mouv = new Mouvement();	// AQ190404
		art  = proxyArticle.find(33);
		mouv = proxyMouvement.find(1);
		
		ajoutMajStock.setArticle(art);
		ajoutMajStock.setMouvement(mouv);
		
		proxyMajStock.create(ajoutMajStock);
		ajoutMajStock = new MajStock();
		
		return "/NewFile.html";
	}

	
	//**********************************************
	//* GETTER SETTER
	//**********************************************
	public MajStockIBusiness getProxyMajStock() {
		return proxyMajStock;
	}

	public void setProxyMajStock(MajStockIBusiness proxyMajStock) {
		this.proxyMajStock = proxyMajStock;
	}

	public List<MajStock> getAllMajStocks() {
		return allMajStocks;
	}

	public void setAllMajStocks(List<MajStock> allMajStocks) {
		this.allMajStocks = allMajStocks;
	}

	public MajStock getAjoutMajStock() {
		return ajoutMajStock;
	}

	public void setAjoutMajStock(MajStock ajoutMajStock) {
		this.ajoutMajStock = ajoutMajStock;
	}
	

}
