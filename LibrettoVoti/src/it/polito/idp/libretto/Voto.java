package it.polito.idp.libretto;
//import java.time.*; POI

public class Voto {

	private String esame;
	private int voto;
	//private LocalDate data; POI
	
	public Voto(String esame, int voto) {
		this.esame=esame;
		this.voto=voto;
	}

	public String getEsame() {
		return esame;
	}
	public void setEsame(String esame) {
		this.esame = esame;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		if(voto<0||voto>30)
			throw new IllegalArgumentException("Valore non ammesso.");
		this.voto = voto;
	}
	public String toString() {
		return this.esame+" "+this.voto;
	}
	
}
