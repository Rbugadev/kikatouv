package IBusiness;

import java.util.List;

import Entities.Commande;

public interface CommandeIBusiness {

	Commande create(Commande c);
	Commande delete(Commande c);
	Commande update(Commande c);
	Commande find (int id);
	List<Commande> findByIdEvent(int id);
	void deleteCommande(Commande c);
}
