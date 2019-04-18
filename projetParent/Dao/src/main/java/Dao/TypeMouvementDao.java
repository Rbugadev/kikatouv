package Dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.TypeMouvement;
import Entities.User;
import IDao.TypeMouvementIDao;

@Remote(TypeMouvementIDao.class)
@Stateless
public class TypeMouvementDao extends DAO implements TypeMouvementIDao {
	
	@PersistenceContext(unitName="DidiDS")
	private EntityManager em;

	@Override
	public List<TypeMouvement> getAll() {
		Query query = em.createQuery("SELECT t from TypeMouvement t");
		List<TypeMouvement> typesMouvement = query.getResultList();
		return typesMouvement;
	}
	@Override
	public TypeMouvement getByNom(String nom) {
		Query query = em.createQuery("SELECT t from TypeMouvement t WHERE t.nom=:nom",TypeMouvement.class);
		query.setParameter("nom", nom);
		TypeMouvement result = (TypeMouvement) query.getSingleResult();
		return result;
	}

}
