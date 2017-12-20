package wbserver.action;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import Server_RMI.Pessoa;
import Server_RMI.Resposta;
import wbserver.bean.WbserverBean;

public class WbsLoginVoterAction extends ActionSupport implements SessionAware {
	private WbserverBean wb;
	private Map<String, Object> session;
	private String username,password;
	private Pessoa p;
	public String execute() throws RemoteException, NotBoundException{
			p=(Pessoa)session.get("pessoa");
			System.out.println("Pessoa: "+p.toString());
			Resposta r=this.getWbserverBean().LoginUser(this.getP(),this.getUsername(),this.getPassword());
			System.out.println(r.mensagem+"  "+r.valor);
			if(r.valor > 0)
				return SUCCESS;
			else{
				addActionError("Username or Password are Incorrect !");
				return ERROR;
				

			}
	}
	
	
	public Map<String, Object> getSession() {
		return session;
	}


	public Pessoa getP() {
		return p;
	}


	public void setP(Pessoa p) {
		this.p = p;
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


	public WbserverBean getWbserverBean() throws AccessException, RemoteException, NotBoundException {
		if(!session.containsKey("WbserverBean"))
			this.WbserverBean(new WbserverBean());
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
