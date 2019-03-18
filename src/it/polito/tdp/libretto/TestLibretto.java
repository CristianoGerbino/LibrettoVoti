package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	//Serve a testare il nostro programma, evitando di utilizzare dati privati di Libretto

	public static void main(String[] args) {
		Libretto libr = new Libretto();
		libr.add(new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(21, "Chimica", LocalDate.of(2017, 2, 25)));
		libr.add(new Voto(25, "Fisica I", LocalDate.of(2017, 1, 30)));
		libr.add(new Voto(24, "Fisica II", LocalDate.of(2018, 2, 28)));
		libr.add(new Voto(28, "Ricerca Operativa", LocalDate.of(2018, 7, 15)));
		libr.add(new Voto(29, "Programmazione a Oggetti", LocalDate.of(2019, 1, 31)));
		libr.add(new Voto(25, "Geometria", LocalDate.of(2017, 6, 27)));
		
		List<Voto> venticinque = libr.cercaVoti(25);
		System.out.println(venticinque);

		Voto a1 = libr.cercaEsame("Analisi I");
		Voto a3 = libr.cercaEsame("Analisi III");
		System.out.println(a1);
		System.out.println(a3);
	}

}
