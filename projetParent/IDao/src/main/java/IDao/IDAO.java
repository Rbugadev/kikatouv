package IDao;

public interface IDAO {

	public <T> T create(T obj); 
	public <T> void  delete(T obj); 
	public <T> T update(T obj);
	public <T> T find(Class<T> c,int id);
	
}
