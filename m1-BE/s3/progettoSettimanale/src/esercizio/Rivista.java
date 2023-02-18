package esercizio;

import javax.persistence.Entity;

@Entity
public class Rivista extends ElementoCartaceo {
	
	private Periodicita periodicita;

	public Rivista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}
	
	

}
