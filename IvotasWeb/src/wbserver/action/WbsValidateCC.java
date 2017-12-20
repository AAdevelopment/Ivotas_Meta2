package wbserver.action;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import Server_RMI.Pessoa;
import wbserver.bean.WbserverBean;

public class WbsValidateCC extends ActionSupport implements SessionAware {
	private WbserverBean wb;
	private Map<String, Object> session;
	private String CC;
	
	public String execute() throws RemoteException, NotBoundException{
		this.setWb(new WbserverBean());
		Pessoa p=this.getWbserverBean().AutenticateCC(CC);
		if(p!=null){
			session.put("pessoa", p);
			return SUCCESS;
		}
		else
			return ERROR;
	}
	public WbserverBean getWbserverBean() {
		if(!session.containsKey("WbserverBean"))
			this.WbserverBean(wb);
		return (WbserverBean) session.get("WbserverBean");
	}

	
	public String getCC() {
		return CC;
	}
	public WbserverBean getWb() {
		return wb;
	}
	public void setWb(WbserverBean wb) {
		this.wb = wb;
	}
	public void setCC(String cC) {
		CC = cC;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void WbserverBean(WbserverBean WbserverBean) {
		this.session.put("WbserverBean", WbserverBean);
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
