package server.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Utente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int password;
	private String name;
	private static int id=0;
	private ArrayList<Configurazione> lista_conf= null;
	private ArrayList<Proprieta> lista_proprieta= null;
	public Utente(String n,int p) {
		this.password=p;
		this.name=n;
		id=id++;
		lista_conf=new ArrayList<Configurazione>();
		lista_proprieta= new ArrayList<Proprieta>();
		
	}

	public int getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void aggiungi_Conf(Configurazione c) {
		lista_conf.add(c);
	}
	
	public void aggiungi_Proprieta(Auto a) {
		Proprieta p= new Proprieta(a,this);
		lista_proprieta.add(p);
	}
	
	public ArrayList<Configurazione> getListaConf() {
		return this.lista_conf;
	}
	
	public ArrayList<Proprieta> getListaProprieta(){
		return lista_proprieta;
	}
	
}
