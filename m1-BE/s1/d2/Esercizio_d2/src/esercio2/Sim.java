package esercio2;

public class Sim {
	String nTelefono;
	double credito;
	chiamate[] chiamate;
	
	public Sim(String nTelefono) {
		this.nTelefono = nTelefono;
		this.credito=0;
		this.chiamate=new chiamate[5];
	}
	
	public void StampaDati() {
		System.out.println("Sim"+this.nTelefono+" il tuo credito è di:" +this.credito);
	}
	
	public void StampaChiamate() {
		System.out.println("ultime chiamate:"+ this.chiamate[0]+ this.chiamate[1]+ this.chiamate[2]+ this.chiamate[3]+ this.chiamate[4]);
	}
}