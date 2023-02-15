package esercizio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import utils.jpaUtil;


public class EventoDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercizio2");
	static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
	
		Evento e = new Evento();
		e.setTitolo("Primo Evento");
		e.setDataevento(2022);
		e.setNumeromassimopartecipanti(120);
		e.setDescrizione("il nostro primo evento");

	}
	
	private static void aggiungiEvento(Evento e) {
		em.getTransaction().begin();//apre collegamento con il database
		em.persist(e);//qua gli si dice l'operazione da fare(persist aggiunge)
		em.getTransaction().commit();
		System.out.println("Evento aggiunto nel database");
	}
	
	private static void elimaUtente(Evento e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("evento eliminato nel db!!");

	}
	
	private static Evento leggiEvento(int id) {
		em.getTransaction().begin();
		Evento e =em.find(Evento.class, id);
		em.getTransaction().commit();
		return e;
	}
	
	private static void refresh(Evento e) {
		em.getTransaction().begin();
		em.refresh(e);
		em.getTransaction().commit();
	}

}
