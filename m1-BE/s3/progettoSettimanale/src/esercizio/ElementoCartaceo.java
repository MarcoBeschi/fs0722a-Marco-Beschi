package esercizio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "ElementoCartaceo")
@Table(name = "ElementoCartaceo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class ElementoCartaceo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique=true)
	private String ISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;
    
    @OneToOne(mappedBy = "elemento")
    private Prestito prestito;
	
	

	public ElementoCartaceo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return ISBN;
	}

	public void setIsbn(String isbn) {
		this.ISBN = isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "ElementoCartaceo [isbn=" + ISBN + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	

}
