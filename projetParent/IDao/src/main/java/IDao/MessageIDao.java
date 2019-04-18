package IDao;

import java.util.List;

import Entities.Message;

public interface MessageIDao extends IDAO 
{
	List<Message> getAll();
	List<Message> getByIdArticle(int id);
	void testDelete(Message message);
}
