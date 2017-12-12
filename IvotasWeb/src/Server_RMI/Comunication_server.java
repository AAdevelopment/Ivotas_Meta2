/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI;

/**
 *
 * @author gustavo
 */

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import mesa_voto.Mesa_voto;



public interface Comunication_server extends Remote {
    
    public String getTestconnection() throws RemoteException;
    public void subscribe(String name, Comunication_client c) throws RemoteException;
    public void criarEleicao(String v[])throws RemoteException;
    public boolean vote(String lista, Eleicao eleicao, Pessoa pessoa, Mesa_voto mesa, Calendar data)throws RemoteException;
    public void CadastrarPessoa(String o[])throws RemoteException;
    public Pessoa autenticate(String campo, String dados) throws RemoteException;
    public Resposta unlock_terminal(Pessoa pessoa,String CC, String Password)throws RemoteException;
    public ArrayList<Eleicao> get_Eleicoes()throws RemoteException;
    public void CriarLista(ArrayList<String> lista,String nome,String tipo)throws RemoteException;
    public ArrayList<ListaCandidatos> get_Listas(Eleicao eleicao)throws RemoteException;
    public void CriarFaculdade_Dpto(String nome,ArrayList<String> array)throws RemoteException;
    public void alterar_eleicao(String nome_eleicao,String v[])throws RemoteException;
    public Eleicao getEleicao(String titulo) throws RemoteException;
    public void addMesaVoto(Mesa_voto mesa)throws RemoteException;
    public Mesa_voto create_mesa(String departamento) throws RemoteException;
    public boolean alterarDepartamento(String oldname, String new_name) throws RemoteException;
    public boolean removeDepartamento(String departamento) throws RemoteException;
    public boolean removeMesaVoto(int id) throws RemoteException;
    public void Count_voters(Eleicao e,Mesa_voto mesa)throws RemoteException;
    public boolean configMesa(String [] config)throws RemoteException;
}
