package esercizio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Prestito")
public class Prestito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente_id;	
	private Rivista elementoPrestato;
	private Date dataInizioPrestito;
	private Date dataRestituzionePrevista;
	private Date dataRestituzioneEffettiva;
	
	
	 @OneToOne
	 @JoinColumn(name = "id_lettura")
	 private ElementoCartaceo elemento;



	public Prestito() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Rivista getElementoPrestato() {
		return elementoPrestato;
	}


	public void setElementoPrestato(Rivista elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}


	public Date getDataInizioPrestito() {
		return dataInizioPrestito;
	}


	public void setDataInizioPrestito(Date dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}


	public Date getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}


	public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}


	public Date getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}


	public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}


	public ElementoCartaceo getElemento() {
		return elemento;
	}


	public void setElemento(ElementoCartaceo elemento) {
		this.elemento = elemento;
	}


	public int getId() {
		return id;
	}


	public Utente getUtente_id() {
		return utente_id;
	}
	 
	 
}
