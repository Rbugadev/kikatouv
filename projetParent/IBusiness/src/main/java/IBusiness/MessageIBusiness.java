package IBusiness;

import java.util.List;

import Entities.Article;
import Entities.Message;
 
public interface MessageIBusiness {
	
	Message create(Message m);
	void delete(Message m);
	Message update(Message m);
	Message find(int id);
	List<Message> getAll();
	List<Message> getAllByIdArticle(int id);
	void fuckingRemove(Message message);

}
