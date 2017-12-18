package wbserver.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

public class WbsLoginVoterAction extends ActionSupport implements SessionAware {
	private WbserverBean wb;
	private Map<String, Object> session;
	private String username,password;
	
	public String execute(){
		if((this.username != null && !username.equals(""))&&
		  this.password != null && !this.password.equals("")){
			this.getWbserverBean();
		}
		
		return SUCCESS;
	}
	
	
	public void setWb(WbserverBean wb) {
		this.wb = wb;
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


	public WbserverBean getWbserverBean() {
		if(!session.containsKey("WbserverBean"))
			this.WbserverBean(wb);
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
