package esercizio;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ElementoMultimediale[] utente = new ElementoMultimediale[5];

	public static void main(String[] args) {

		play2();

	}

	public static void play2() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci il tipo tra Audio, Video o Immagine: ");
			String tipologia = sc.nextLine();
			System.out.println("Inserisci il titolo: ");
			String titolo = sc.nextLine();
			if (tipologia.equals("audio")) {
				System.out.println("Inserisci la durata: ");
				int durata = Integer.parseInt(sc.nextLine());
				utente[i] = new Audio(titolo, durata);
				System.out.println(utente[i]);
			} else if (tipologia.equals("video")) {
				System.out.println("Inserisci la durata: ");
				int durata = Integer.parseInt(sc.nextLine());
				utente[i] = new Video(titolo, durata);
				System.out.println(utente[i]);
			} else if (tipologia.equals("immagine")) {
				utente[i] = new Audio(titolo, 1);
				System.out.println(utente[i]);
			} else {
				System.out.println("Inserisci il valore corretto");
			}
		}
		int num;
		do {
			System.out.println("Inserisci un numero tra 0 e 5:");
			num = Integer.parseInt(sc.nextLine());
			if(num>0 && num <= 5) {
			if (utente[num-1] instanceof Audio || utente[num-1] instanceof Video) {
				utente[num-1].play();
			} else {
				utente[num-1].show();
			}
			}else if(num == 0){
				System.out.println("Fine riproduzione");
			}else {
				System.out.println("Errore inserisci un numero tra 0 e 5");
			}
		} while (num != 0);
	}

}
