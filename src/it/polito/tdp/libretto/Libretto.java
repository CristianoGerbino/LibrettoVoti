  package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto() {
		voti = new ArrayList<Voto>();
	}
	
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v
	 */
	
	public void add (Voto v) {
		voti.add(v);
	}
	
	//Per il punto 2 è preferibile utilizzare una funzione che ritorni una lista di voti,
	//in modo tale da poterla utilizzare anche con un interfaccia grafica
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * 
	 * @param punti punteggio da ricerca
	 * @return lista di Voti 
	 */
	public List<Voto> cercaVoti (int voto) {
		
		List <Voto> result = new ArrayList <Voto>();
		
		for (Voto v :this.voti) {
			if (v.getPunti()== voto) {
				result.add(v);
			}
		}
		return result;
	}
	
	public Voto cercaEsame( String nomeEsame) {
		Voto voto = new Voto (0, nomeEsame, null);
		int pos = this.voti.indexOf(voto);
		
		//poichè indexOf utilizza equals, il metodo equals implementato su un Voto,
		//controlla, essendo un esame univoco per nome del corso, solo se esiste già un oggetto 
		//con quel nome del corso, quindi abbiamo costruito un Voto fittizio, che ha come unica informazione utile
		//il nome del corso
		
		if (pos == -1)
			return null;
		else
			return this.voti.get(pos);
				
		
		/*for (Voto v : this.voti) {
			if (v.getCorso().equals(nomeEsame)) {
				return v;
			}
		}
		return null;*/
	}
	
	/**
	 * Dato un {@link Voto}, determina se esiste già un voto con uguale corso e uguale punteggio
	 * @param v
	 * @return {@code true}, se ha trovato un corso e punteggio uguali, 
	 * 		   {@code false} se non ha trovato il corso, oppure l'ha trovato con voto diverso 
	 */
	public boolean esisteGiaVoto (Voto v) {
		int pos = voti.indexOf(v);
		if (pos == -1)
			return true;
		else
			return (v.getPunti() == voti.get(pos).getPunti());
	}
}
