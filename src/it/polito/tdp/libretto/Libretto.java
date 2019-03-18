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
}
