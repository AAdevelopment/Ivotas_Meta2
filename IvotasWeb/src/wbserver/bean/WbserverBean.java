package wbserver.bean;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.Calendar;

import Server_RMI.Comunication_client;
import Server_RMI.Comunication_server;
import Server_RMI.Eleicao;
import Server_RMI.ListaCandidatos;
import Server_RMI.Pessoa;
import Server_RMI.Resposta;
import mesa_voto.Mesa_voto;

public class WbserverBean  {
	private Comunication_server server;
	private Comunication_client client;
	ArrayList<String>el = new ArrayList<String>();
	

	public WbserverBean() throws NotBoundException, AccessException, RemoteException{
		server = (Comunication_server) LocateRegistry.getRegistry(6500).lookup("connection_RMI");		
		//System.out.println("Conexao RMI Iniciada !");
	}
	
	public boolean CadastrarPessoa(String[]pessoa) throws RemoteException{
		server.CadastrarPessoa(pessoa);
		return true;
	}
	
	public boolean CriarLista(String[]lista,String nome,String tipo) throws RemoteException{
		ArrayList<String>list= new ArrayList();
		for(int i=0;i<lista.length;i++)
			list.add(lista[i]);
		server.CriarLista(list, nome, tipo);
		return true;
	}
	
	public ArrayList<String> getEl() {
		return el;
	}

	public void setEl(ArrayList<String> el) {
		this.el = el;
	}

	public boolean CriarFaculdade_Dpto(String nome,ArrayList<String>array) throws RemoteException{
		server.CriarFaculdade_Dpto(nome, array);
		return true;
	}
	
	public boolean criarEleicao(String[]eleicao) throws RemoteException{
		server.criarEleicao(eleicao);
		return true;
	}
	
	public String getMesasVoto() throws RemoteException{
		return server.getMesasList();
	}
	
	public String getCandidatosList() throws RemoteException{
		return server.getCandidatosList();
	}
	

	
	public String[] procuraEleicao(String titulo) throws RemoteException{
		String s=(server.procuraEleicao(titulo).toString());
		String array[]= new String [5];
		String split[]=s.split("\\|");
		for(int i=0;i<array.length;i++){
			array[i]=split[i+1];
			System.out.println(array[i]);
		}
		
		return array;
		
	}
	
	public boolean CreateMesa(String departamento) throws RemoteException{
		if(departamento!=null){
			server.create_mesa(departamento);
			return true;
		}
		else
			return false;
	}
	
	public void Alterar_Eleicao(String titulo,String[]array) throws RemoteException{
		server.alterar_eleicao(titulo, array);
	}
	
	public ArrayList<String> getEleicoesTitles() throws RemoteException{
			ArrayList<Eleicao>eleicoes = new ArrayList<Eleicao>();
			eleicoes.addAll(server.get_Eleicoes());
			for(int i=0;i<eleicoes.size();i++)
				el.add(eleicoes.get(i).getTitulo());
		
			return el;
	}
	
	public boolean AddTableandListToElection(String electionTitle,String ListTitle,Integer id) throws RemoteException{
		server.Add_table_to_election(electionTitle, id);
		server.Add_list_to_Election(electionTitle, ListTitle);
		return true;
	}
	
	public Pessoa AutenticateCC(String CC) throws RemoteException{
		Pessoa p=server.autenticate("cartao", CC);
		return p;
	}
	
	public Resposta LoginUser(Pessoa p,String username,String password) throws RemoteException{
		Resposta r=server.unlock_Web(p,username,password);
		return r;
		
	}
	
	public ArrayList <String> List(Eleicao el) throws RemoteException{
		ArrayList <ListaCandidatos> list = new ArrayList <ListaCandidatos>();
		for(int i=0;i<server.get_Listas(el).size();i++){
			list.add(server.get_Listas(el).get(i));
			System.out.println(list.get(i).toString());
			
		}
		ArrayList <String> v = new ArrayList<String>();
		for(int i=0 ;i<list.size();i++)
			v.add(list.get(i).nome);
		return v;
	}
	
	public boolean Votar(String lista, Eleicao eleicao, Pessoa pessoa) throws RemoteException{
		Mesa_voto mesa = null;
		boolean voto=false;
		Calendar data=Calendar.getInstance();
		for(Mesa_voto m:eleicao.mesas)
		   mesa= new Mesa_voto(m.departamento);
		  if(server.vote(lista, eleicao, pessoa, mesa, data)==true){
			  System.out.println("voto efetuado");
			  voto= true;
		  }
		  else{
			  voto= false;
		  }
		  
		  return voto;
	}

	public Comunication_server getServer() {
		return server;
	}

	public void setServer(Comunication_server server) {
		this.server = server;
	}
		
}
