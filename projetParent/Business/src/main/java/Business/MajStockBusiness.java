package Business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import Entities.MajStock;
import IBusiness.MajStockIBusiness;
import IDao.MajStockIDao;

@Remote(MajStockIBusiness.class)
@Stateless
public class MajStockBusiness implements MajStockIBusiness {

	@EJB
	private MajStockIDao proxyMajStock;
	
	@Override
	public MajStock create(MajStock s) {
		proxyMajStock.create(s);
		return s;
	}

	@Override
	public MajStock delete(MajStock s) {
		proxyMajStock.delete(s);
		return s;
	}

	@Override
	public MajStock update(MajStock s) {
		proxyMajStock.update(s);
		return s;
	}

	@Override
	public MajStock find(int id) {
		return proxyMajStock.find(MajStock.class, id);
	}

	@Override
	public List<MajStock> findByIdMouvement(int id) {
		return proxyMajStock.findByIdMouvement(id);
	}

	@Override
	public List<MajStock> getAll() {
		return proxyMajStock.getAll();
	}

	@Override
	public List<MajStock> findByIdArticle(int id) {
		return proxyMajStock.findByIdArticle(id);
	}

}
