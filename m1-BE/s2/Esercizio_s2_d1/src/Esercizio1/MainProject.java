package Esercizio1;

import java.util.Random;
import java.util.Scanner;

public class MainProject {
	
	static int[] numeri = new int[5];

	public static void main(String[] args) {
		creaNumeroCasuale();
		
	}
	
	public static void creaNumeroCasuale() {
		Random r = new Random();
		for (int i=0;i<numeri.length;i++) {
			numeri[i]=r.nextInt(11);
		}
		System.out.println(r.nextInt(11));
	}



public static void stampaArray() {
	for (int i=0;i<numeri.length;i++) {
		System.out.println(numeri[i]);
	}
}
public static void inserisciNumero() {
	do {
	Scanner sc =new Scanner(System.in);
	System.out.println(r.nextInt("Inserisci il numero:");
	int num =Integer.parseInt(sc.nextLine());
	System.out.println("inserisci posizione: ");
	int pos = Integer.parseInt(sc.nextLine());
	if(num==0) {
		return;
	}
	numeri[pos]=num;
}
}