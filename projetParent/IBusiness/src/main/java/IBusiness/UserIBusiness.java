package IBusiness;

import java.util.List;

import Entities.User;

public interface UserIBusiness {
	
	User createUser(User user);
	User delete (User user);
	User update (User user);
	User find (int id);
	User connection (String log, String mdp);
	List<User> getAll();
}
