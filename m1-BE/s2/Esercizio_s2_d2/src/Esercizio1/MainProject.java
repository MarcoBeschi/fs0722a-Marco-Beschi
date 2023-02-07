package Esercizio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MainProject {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ChiediDati();

	}
	
	
	public static void ChiediDati() {
		Set<String> s = new HashSet<String>();
		System.out.println("Inserisci il numero di parole che vuoi inserire: ");
		 int N = Integer.parseInt(sc.nextLine());
		 for (int i = 0; i < N; i++) {
			 System.out.println("Inserisci le "+N+" che vuoi inserire :" );
			 s.add(sc.nextLine());
			 
		}
		 System.out.println("Le parole che hai inserito sono :");
		 System.out.println(s.toString());
		 
			 int size = s.size();
		 System.out.println("Hai inserito :"+size+" parole"  );
	}
}
