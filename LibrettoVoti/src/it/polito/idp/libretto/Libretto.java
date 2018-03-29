package it.polito.idp.libretto;
import java.util.*;
public class Libretto {

	private List<Voto> voti ;
	
	public Libretto() {
		this.voti = new ArrayList<>();
	}
	public void add(Voto v) {
		this.voti.add(v);
	}
	public void stampa() {
		System.out.println("Ci sono "+voti.size()+" voti:\n");
		for(Voto v : voti)
			System.out.println(v.toString());
	}
}
