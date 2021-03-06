package wbserver.action;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

public class WbsCreateMesaAction extends ActionSupport implements SessionAware {
	private WbserverBean wb;
	private Map<String, Object> session;
	private String mesa;
	
	public String execute() throws AccessException, RemoteException, NotBoundException {
		this.setWb(new WbserverBean());
		this.getWbserverBean().CreateMesa(this.getMesa());
		return SUCCESS;		
	}
	
	
	public String getMesa() {
		return mesa;
	}
	public WbserverBean getWb() {
		return wb;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setMesa(String mesa) {
		this.mesa = mesa;
	}
	
	public void setWb(WbserverBean wb) {
		this.wb = wb;
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
