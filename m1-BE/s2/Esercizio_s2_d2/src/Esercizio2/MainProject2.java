package Esercizio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainProject2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		NumeriCasuali();
		System.out.println(Pareggio());

	}
	
	public static void NumeriCasuali() {
		System.out.println("Inserisci quanti numeri vuoi creare: ");
		int N = Integer.parseInt(sc.nextLine());
		List<Integer> listaNumeri= new ArrayList<Integer>();
		int max = 100;
        int min = 0;
        int range = max - min + 1;
        for (int i = 0; i < N; i++) {
             listaNumeri.add((int)(Math.random() * range) + min);
          
	}  
        System.out.println("I numeri generati casualmente e ordinati sono: ");
      listaNumeri.sort(Comparator.naturalOrder());
       System.out.println(listaNumeri);
       List<Integer> listaNumeri2 = listaNumeri;
       listaNumeri2.sort(Comparator.reverseOrder());
       listaNumeri2.addAll(listaNumeri);
       System.out.println("numeri al contrario");
       System.out.println(listaNumeri2);
       
       
	}
	
	public static void Pareggio(Integer[] listaNumeri) {
		
		for (int i = 0; i < listaNumeri.length; i++) { 
            if (listaNumeri[i]%2==0) {
            System.out.println("I numeri pari sono: " + i);
		}else {
			System.out.println("I numeri dispari sono: " + i);
		}
		}
		
	}
}

