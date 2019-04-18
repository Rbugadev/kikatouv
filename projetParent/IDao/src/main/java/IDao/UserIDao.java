package IDao;

import java.util.List;

import Entities.Article;
import Entities.User;

public interface UserIDao  extends IDAO{
	

	User connection (String log,String mdp);
	List<User> getAll();

}


