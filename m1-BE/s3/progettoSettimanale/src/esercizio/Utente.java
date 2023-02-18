package esercizio;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Utente")
public class Utente {
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String Cognome;
	@Column(nullable = false)
	private String nascita;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long NumeroTessera;
	@OneToMany(mappedBy = "utente_id")
    private List<Prestito> prestiti = new ArrayList<>();
	
	
	




	public Utente() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return Cognome;
	}



	public void setCognome(String cognome) {
		Cognome = cognome;
	}



	public String getNascita() {
		return nascita;
	}



	public void setNascita(String nascita) {
		this.nascita = nascita;
	}



	public List<Prestito> getPrestiti() {
		return prestiti;
	}



	public void setPrestiti(List<Prestito> prestiti) {
		this.prestiti = prestiti;
	}



	public long getNumeroTessera() {
		return NumeroTessera;
	}



	
	
	
	
}
