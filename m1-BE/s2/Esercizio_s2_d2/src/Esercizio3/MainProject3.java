package Esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainProject3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreaUtente();
	}
	public static void CreaUtente() {
	Map<String, String> m = new HashMap<String,String>();
	System.out.println("inserisci il tuo nome: ");
	String nome = sc.nextLine();
	System.out.println("inserisci il tuo numero di telefono: ");
	String telefono = sc.nextLine();
	m.put(nome, telefono);
	System.out.println("inserisci il nome dell'utente che vuoi rimuovere: ");
	String rimuovi = sc.nextLine();
	m.remove(rimuovi);
	}
	
}
