package server.entity;

import java.util.ArrayList;


public class InfoUtente {

	private static InfoUtente InfoUtente_instance=null;
	private ArrayList<Utente> lista_utente;
	
	private InfoUtente() {
		lista_utente= new ArrayList<Utente>();
	}
	
	public static synchronized InfoUtente getInfoUtente() {
		if(InfoUtente_instance==null) {
		//	System.out.println("Inizializzo l infoUtente");
			InfoUtente_instance=new InfoUtente();
		}
		//System.out.println("Ritorna l infoUtente");
		return InfoUtente_instance;
	}
	
	public Utente registraUtente(String s,int p) {
		Utente u= new Utente(s,p);
		lista_utente.add(u);
		return u;
	}
	
	public Utente getUtente(int id) {
		for(int i=0;i<lista_utente.size();i++) {
			if(lista_utente.get(i).getId()==id) {
				return lista_utente.get(i);
			}
		}
		return null;
	}
	
	public Utente checkUtente(Utente u) {
		for(int i=0;i<lista_utente.size();i++) {
			if(lista_utente.get(i).getName().equals(u.getName()) ) {//DA MODIFICARE
				System.out.println("Trovato l'utente");
				return lista_utente.get(i);
			}
		}
		return null;
	}
	
	public int getPassword(Utente u) {
		return u.getPassword();
	}

	public String getName(Utente u) {
		return u.getName();
	}
	
	public int getId(Utente u) {
		return u.getId();
	}
	public void aggiungi_Conf(Utente u,Configurazione c) {
		u.aggiungi_Conf(c);
	}
	
	public void aggiungi_Proprieta(Utente u,Auto a) {
		u.aggiungi_Proprieta(a);
	}
	
	public ArrayList<Configurazione> getListaConf(Utente u) {
		return u.getListaConf();
	}
	
	public ArrayList<Proprieta> getListaProprieta(Utente u){
		return u.getListaProprieta();
	}
	
}
