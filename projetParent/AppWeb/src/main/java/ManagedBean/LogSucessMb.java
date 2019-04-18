package ManagedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Entities.User;

@ManagedBean(name="mbsucess")
@SessionScoped
public class LogSucessMb implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="#{mblogin.user}")
	private User user;
	
	
	private String msg="";

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
