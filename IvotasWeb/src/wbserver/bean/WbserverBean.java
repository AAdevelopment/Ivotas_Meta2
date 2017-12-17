package wbserver.bean;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;

import Server_RMI.Comunication_client;
import Server_RMI.Comunication_server;
import Server_RMI.Eleicao;

public class WbserverBean  {
	private Comunication_server server;
	private Comunication_client client;
	public WbserverBean() throws NotBoundException, AccessException, RemoteException{
		server = (Comunication_server) LocateRegistry.getRegistry(6500).lookup("connection_RMI");		
		System.out.println("Conexao RMI Iniciada !");
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
		server.create_mesa(departamento);
		return true;
	}
	
	public void Alterar_Eleicao(String titulo,String[]array) throws RemoteException{
		server.alterar_eleicao(titulo, array);
	}
	
	public ArrayList<String> getEleicoesTitles() throws RemoteException{
		ArrayList<String>el = new ArrayList<String>();
		int size=server.get_Eleicoes().size();
		System.out.println(size);
		for(int i=0;i<size;i++){
			el.add(server.get_Eleicoes().get(i).getTitulo());
			System.out.println(el.get(i));
		}
		
		return el;
	}
	
	public boolean AddTableandListToElection(String electionTitle,String ListTitle,Integer id) throws RemoteException{
		server.Add_table_to_election(electionTitle, id);
		server.Add_list_to_Election(electionTitle, ListTitle);
		return true;
	}
}
