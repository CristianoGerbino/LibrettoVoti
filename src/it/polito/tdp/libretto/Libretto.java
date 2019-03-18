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
	
	public List<Voto> cercaVoti (int voto) {
		
		List <Voto> result = new ArrayList <Voto>();
		
		for (Voto v :this.voti) {
			if (v.getPunti()== voto) {
				result.add(v);
			}
		}
		return result;
	}
	
	
	
}
