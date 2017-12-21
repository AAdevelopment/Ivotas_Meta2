package wbserver.action;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

public class ElectionListAction  extends ActionSupport implements SessionAware {
	private WbserverBean wb;
	private Map<String, Object> session;
	private ArrayList<String>Eleicoes= new ArrayList<String>();
	public String execute() throws NotBoundException, RemoteException {
		this.setWb(new WbserverBean());
		this.getWbserverBean();
		System.out.println("Session ElectionList: "+session.keySet());
		return SUCCESS;
	}
	
	public WbserverBean getWb() {
		return wb;
	}
	
	
	public ArrayList<String> getEleicoes() {
		return Eleicoes;
	}

	public void setEleicoes(ArrayList<String> eleicoes) {
		Eleicoes = eleicoes;
	}

	public void setWb(WbserverBean wb) {
		this.wb = wb;
	}
	
	
	public WbserverBean getWbserverBean() throws AccessException, RemoteException {
		if(!session.containsKey("WbserverBean"))
			try {
				this.setWb(new WbserverBean());
			} catch (NotBoundException e) {
				e.printStackTrace();
			}
		return (WbserverBean) session.get("WbserverBean");
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
