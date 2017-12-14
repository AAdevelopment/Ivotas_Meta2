package wbserver.bean;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;

import Server_RMI.Comunication_server;

public class WbserverBean {
	private Comunication_server server;
	
	public WbserverBean() throws AccessException, RemoteException, NotBoundException{
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
	
	public boolean CreateMesa(String departamento) throws RemoteException{
		server.create_mesa(departamento);
		return true;
	}
}
