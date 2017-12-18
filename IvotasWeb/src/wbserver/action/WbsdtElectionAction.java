package wbserver.action;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

public class WbsdtElectionAction extends ActionSupport implements SessionAware  {
	private String titulo;
	private WbserverBean wb;
	private Map<String, Object> session;
	private String eleicao[] = new String[5];

	
	public String execute() throws AccessException, RemoteException, NotBoundException {
		this.setWb(new WbserverBean());
		if(session.containsKey("titulo"))
			setTitulo(session.get("titulo").toString());
		eleicao=this.getWbserverBean().procuraEleicao(titulo);
		return SUCCESS;	
	}
	
	
	public String[] getEleicao() {
		return eleicao;
	}


	public void setEleicao(String[] eleicao) {
		this.eleicao = eleicao;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
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