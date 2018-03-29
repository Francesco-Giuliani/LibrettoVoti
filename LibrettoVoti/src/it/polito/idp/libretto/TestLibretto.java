package it.polito.idp.libretto;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libretto lib = new Libretto();
		
		lib.add(new Voto("Analisi I", 27));
		lib.add(new Voto("Chimica", 30));
		
		lib.stampa();
	}

}
