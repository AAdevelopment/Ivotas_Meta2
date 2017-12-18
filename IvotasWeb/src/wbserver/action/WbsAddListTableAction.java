package wbserver.action;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

public class WbsAddListTableAction extends ActionSupport implements SessionAware {
	private WbserverBean wb;
	private Map<String, Object> session;
	private String electionTitle,ListTitle;
	private Integer idmesa;


	public String execute() throws AccessException, RemoteException, NotBoundException{
		this.setWb(new WbserverBean());
		if(session.containsKey("titulo"))
			setElectionTitle(session.get("titulo").toString());
		System.out.println("electionTitle:  "+electionTitle);
		this.getWbserverBean().AddTableandListToElection(this.getElectionTitle(),this.getListTitle(),this.getIdmesa());
		return SUCCESS;
	}

	public String getElectionTitle() {
		return electionTitle;
	}


	public Integer getIdmesa() {
		return idmesa;
	}

	public void setIdmesa(Integer idmesa) {
		this.idmesa = idmesa;
	}

	public void setElectionTitle(String electionTitle) {
		this.electionTitle = electionTitle;
	}


	public String getListTitle() {
		return ListTitle;
	}


	public void setListTitle(String listTitle) {
		ListTitle = listTitle;
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
