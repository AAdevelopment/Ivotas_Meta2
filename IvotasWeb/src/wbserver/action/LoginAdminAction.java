package wbserver.action;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

public class LoginAdminAction extends ActionSupport implements SessionAware {
	private String username,password;
	private WbserverBean wb;
	private Map<String, Object> session;
	
	
	public String execute() {
		if((this.username != null && !username.equals(""))&&
			this.password != null && !this.password.equals("")) {
			session.put("username", username);
			session.put("password", password);
			return SUCCESS;
		}
		else
			return LOGIN;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public void setWb(WbserverBean wb) {
		this.wb = wb;
	}
	public WbserverBean getWbserverBean() throws AccessException, RemoteException {
		if(!session.containsKey("WbserverBean"))
			try {
				this.setWb(new WbserverBean());
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return (WbserverBean) session.get("WbserverBean");
	}

	public void WbserverBean(WbserverBean WbserverBean) {
		this.session.put("WbserverBean", WbserverBean);
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
