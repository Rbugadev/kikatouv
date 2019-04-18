package IBusiness;

import Entities.Ville;

public interface VilleIBusiness {
	
	Ville create(Ville ville);
	Ville delete(Ville ville);
	Ville update(Ville ville);
	Ville find(int id);

}
