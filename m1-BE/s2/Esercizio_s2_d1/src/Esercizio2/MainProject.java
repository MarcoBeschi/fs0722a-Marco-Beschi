package Esercizio2;

import java.util.Scanner;


public class MainProject {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("calcola quanti km al litro hai fatto");
		try{KmAlLitro();
		}catch(NumberFormatException e) {
			System.out.println("Errore!! Non hai inserito un numero");
			KmAlLitro();
			}catch(ArithmeticException e) {
				System.out.println("Hai spinto l'auto?");
				KmAlLitro();
				}
		
	}
	
	
	public static int KmAlLitro() {
		int km=chiediKm();
		int litri=chiediLitri();
		int somma=km/litri;
		System.out.println("Hai percorso " +somma + " km/litro");
		return somma;
	}
	
	public static int chiediKm() {
		System.out.println("Inserisci quanti km hai percorso: ");
		return Integer.parseInt(sc.nextLine());
		
			
	}
	public static int chiediLitri() {
		System.out.println("Inserisci quanti litri hai usato: ");
		return Integer.parseInt(sc.nextLine());
		
			
	}
}

