package esercizio;


import java.text.DateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainArchivio {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoSettimanale");
	public static void main(String[] args) throws ParseException {
		
		//creazione libro 1
		libro l1 = new libro();
		l1.setAutore("Rowling"); 
		l1.setAnnoPubblicazione(2020);
		l1.setGenere("Fantasy");
		l1.setNumeroPagine(320); 
		l1.setTitolo("Harry Potter");
		l1.setIsbn("ISMA203489");
		//creazione libro 2
		libro l2 = new libro();
		l2.setAutore("Rowling"); 
		l2.setAnnoPubblicazione(2018); 
		l2.setGenere("Fantasy"); 
		l2.setNumeroPagine(450); 
		l2.setTitolo("Harry Potter e la camera dei segreti");
		l2.setIsbn("ISMA548789");
		
		
		//creazione rivista 1
		Rivista r1= new Rivista();
		r1.setIsbn("RIV1865");
		r1.setAnnoPubblicazione(2005);
		r1.setTitolo("FOCUS");
		r1.setNumeroPagine(78);
		r1.setPeriodicita(Periodicita.MENSILE);
		//creazione rivista 2
		Rivista r2= new Rivista();
		r2.setIsbn("RIV1978");
		r2.setAnnoPubblicazione(2020);
		r2.setTitolo("Giallo Zafferano");
		r2.setNumeroPagine(85);
		r2.setPeriodicita(Periodicita.SETTIMANALE);
		
		
		//aggiunta rivista al catalogo
		//saveElementoCartaceo(r1);
		//saveElementoCartaceo(r2);
		
		//aggiunta libro al catalogo
		//saveElementoCartaceo(l1);
		//saveElementoCartaceo(l2);
		
		//creazione utente
		Utente u1=new Utente();
		u1.setNome("Mario");
		u1.setCognome("Rossi");
		u1.setNascita("12/25/1990");
		//saveUtente(u1);
		
		
		//ricerca libro per ISBM
		libro lb = getLibroByISBM("ISMA203489");
		System.out.println("Il libro cercato è "+lb.getTitolo() + " il suo autore è " + lb.getAutore());
		
		//ricerca rivista per ISBM
		Rivista rv = getRivistaByISBM("RIV1865");
		System.out.println("LA rivista cercata è "+ rv.getTitolo()+" pubblicata il "+rv.getAnnoPubblicazione());
		
		
		//ricerca per anno
		List<ElementoCartaceo> lista = getElementoCartaceoByAnno(2020);
		for (ElementoCartaceo elemento : lista) {
			System.out.println("Nell'anno "+elemento.getAnnoPubblicazione()+" è stato pubblicato: " + elemento.getTitolo());
		}
		//ricerca per autore
		List<libro> libro =getElementoCartaceoByAutore("Rowling");
		for (libro elemento : libro) {
			System.out.println("L'autore "+elemento.getAutore()+" nell'anno " +elemento.getAnnoPubblicazione()+ " ha pubblicato " +elemento.getTitolo());
		}
		
		//ricerca per titolo
		List<ElementoCartaceo> elemento= getElementoCartaceoByTitolo("Harry Potter");
		for (ElementoCartaceo a : elemento) {
			System.out.println("Nell'anno " +a.getAnnoPubblicazione()+ " è stato pubblicato " +a.getTitolo());
		}
		
		//elimina per isbm
		//eliminaElementoCartaceo("ISMA203489");
	}
	
	public static void saveUtente(Utente u) {
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
			System.out.println("L'Utente  " + u.getNome() +" "+ u.getCognome() +" è stato salvato nel DB!!!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.print("errore nel salvataggio");
		} finally {
			em.close();
		}
	}
	
	
	
	//SALVA NEL DATABASE
	public static void saveElementoCartaceo(ElementoCartaceo l) {
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(l);
			em.getTransaction().commit();
			System.out.println("L'Elemento  " + l.getTitolo() + " è stato salvato nel DB!!!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.print("errore nel salvataggio");
		} finally {
			em.close();
		}
	}
	//TROVA LIBRO PER ISBM
	public static libro getLibroByISBM(String ISBM) {
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		return em.find(libro.class, ISBM);
		} finally {
			em.close();
		}
	}
	//TROVA RIVISTA PER ISBM
	public static Rivista getRivistaByISBM(String ISBM) {
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		return em.find(Rivista.class, ISBM);
		} finally {
			em.close();
		}
	}
	//CERCA ELEMENTO PER ANNO
	private static List<ElementoCartaceo> getElementoCartaceoByAnno(int annoPubblicazione) {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("SELECT a FROM ElementoCartaceo a WHERE a.annoPubblicazione = :annoPubblicazione");
		q.setParameter("annoPubblicazione", annoPubblicazione);
		return q.getResultList();
	}
	//CERCA PER AUTORE
	private static List<libro> getElementoCartaceoByAutore(String autore) {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("SELECT a FROM libro a WHERE a.autore = :autore");
		q.setParameter("autore", autore);
		return q.getResultList();
	}
	//CERCA ELEMENTO DA TITOLO MA NON FUNZIONA
	private static List<ElementoCartaceo> getElementoCartaceoByTitolo(String titolo) {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("SELECT a FROM ElementoCartaceo a WHERE LOWER(a.titolo) LIKE LOWER(:titolo)");
		q.setParameter("titolo", "%" + titolo + "%");
		return q.getResultList();
	}
	
	public static void eliminaElementoCartaceo(String ISBM) {
		EntityManager em = emf.createEntityManager();
		ElementoCartaceo x = em.find(ElementoCartaceo.class, ISBM);
		
		try {
			em.getTransaction().begin();
			em.remove(x);
			em.getTransaction().commit();
			System.out.println("L'articolo con il codice " + x.getIsbn() +" è stato rimosso dal database");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			System.out.println(ec.getMessage());
		} finally {
			em.close();
		}
	}
}

