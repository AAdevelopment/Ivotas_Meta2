package wbserver.action;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

public class WbsAlterElectAction  extends ActionSupport implements SessionAware  {
	private WbserverBean wb;
	private Map<String, Object> session;
	private String titulo;
	private String[]array= new String[10];
	
	public String execute() throws AccessException, RemoteException, NotBoundException{
		this.setWb(new WbserverBean());
		this.getWbserverBean().Alterar_Eleicao(titulo, array);
		return SUCCESS;
	}
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String[] getArray() {
		return array;
	}


	public void setArray(String[] array) {
		this.array = array;
	}


	public WbserverBean getWb() {
		return wb;
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
