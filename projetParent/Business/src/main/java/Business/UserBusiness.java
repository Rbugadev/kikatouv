package Business;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.User;
import IBusiness.UserIBusiness;
import IDao.UserIDao;

@Remote(UserIBusiness.class)
@Stateless
public class UserBusiness implements UserIBusiness{
	
	@EJB
	private UserIDao proxyUser;

	@Override
	public User createUser(User user) {
		
		 proxyUser.create(user);
		 return user;
	}

	@Override
	public User delete(User user) {
		proxyUser.delete(user);
		return user;
	}

	@Override
	public User update(User user) {
		proxyUser.update(user);
		return user;
	}

	@Override
	public User find(int id) {
		
		return proxyUser.find(User.class, id);
	}

	@Override
	public User connection(String log, String mdp) {
				
		return proxyUser.connection(log, mdp);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return proxyUser.getAll();
	}

}
