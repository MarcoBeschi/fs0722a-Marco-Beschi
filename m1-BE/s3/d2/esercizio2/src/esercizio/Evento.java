package esercizio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the evento database table.
 * 
 */
@Entity
@NamedQuery(name="Evento.findAll", query="SELECT e FROM Evento e")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private int dataevento;
	@Column(nullable = false)
	private String descrizione;
	@Column(nullable = false)
	private Integer numeromassimopartecipanti;
	@Column(nullable = false)
	private String titolo;
	
	
	
	
	public Evento(Integer id, int dataevento, String descrizione, Integer numeromassimopartecipanti, String titolo) {
		super();
		this.id = id;
		this.dataevento = dataevento;
		this.descrizione = descrizione;
		this.numeromassimopartecipanti = numeromassimopartecipanti;
		this.titolo = titolo;
	}

	public Evento() {
	}

	public Integer getId() {
		return this.id;
	}


	public int getDataevento() {
		return this.dataevento;
	}

	public void setDataevento(int dataevento) {
		this.dataevento = dataevento;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getNumeromassimopartecipanti() {
		return this.numeromassimopartecipanti;
	}

	public void setNumeromassimopartecipanti(Integer numeromassimopartecipanti) {
		this.numeromassimopartecipanti = numeromassimopartecipanti;
	}

	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

}