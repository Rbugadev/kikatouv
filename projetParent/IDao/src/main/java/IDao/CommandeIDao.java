package IDao;

import java.util.List;

import Entities.Commande;

public interface CommandeIDao extends IDAO{

	List<Commande> findByIdEvent(int id);
	void deleteCommande(Commande c);
}
