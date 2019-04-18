package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.Commande;
import IBusiness.CommandeIBusiness;
import IDao.CommandeIDao;

@Remote(CommandeIBusiness.class)
@Stateless
public class CommandeBusiness implements CommandeIBusiness{

	@EJB
	private CommandeIDao proxyCommande;
	
	@Override
	public Commande create(Commande c) {
		proxyCommande.create(c);
		return c;
	}

	@Override
	public Commande delete(Commande c) {
		proxyCommande.delete(c);
		return c;
	}

	@Override
	public Commande update(Commande c) {
		proxyCommande.update(c);
		return c;
	}

	@Override
	public Commande find(int id) {
		
		return proxyCommande.find(Commande.class, id);
	}

	@Override
	public List<Commande> findByIdEvent(int id) {
	
		return proxyCommande.findByIdEvent(id);
	}

	@Override
	public void deleteCommande(Commande c) {
		proxyCommande.deleteCommande(c);
		
	}

}
