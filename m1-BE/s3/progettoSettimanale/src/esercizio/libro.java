package esercizio;

import javax.persistence.Entity;

@Entity

public class libro extends ElementoCartaceo {
	private static final long serialVersionUID = 1L;

	private String autore;
	private String genere;
	


	public libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + ", " + super.toString() + "]";
	}
	
}

