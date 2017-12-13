package wbserver.action;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

public class WbsInsertFaculDptoAction extends ActionSupport implements SessionAware {
	private WbserverBean wb;
	private Map<String, Object> session;
	private String nome;
	private String[] dpto = new String[3];
	
	
	public String execute() throws AccessException, RemoteException, NotBoundException {
		this.setWb(new WbserverBean());
		ArrayList<String>Dpto= new ArrayList();
		for(int i=0;i<dpto.length;i++)
			Dpto.add(dpto[i]);
	
		this.getWbserverBean().CriarFaculdade_Dpto(this.getNome(),Dpto);
		return SUCCESS;		
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String[] getDpto() {
		return dpto;
	}



	public void setDpto(String[] dpto) {
		this.dpto = dpto;
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
