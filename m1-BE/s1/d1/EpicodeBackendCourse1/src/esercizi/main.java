package esercizi;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y=5;
		int somma=x*y;
		System.out.println(somma);
		
		String a = "Io ho : ";
		String s = String.valueOf(somma);
		System.out.println(a + s + " anni");
		
		
		String[] animali ;
		animali = new String[5];
		
		//-------------------esercizio3
		
		Scanner dati = new Scanner(System.in);
		System.out.println("Scrivi il tuo nome: ");
		String dato1 = dati.nextLine();
		System.out.println("Scrivi il tuo cognome: ");
		String dato2 = dati.nextLine();
		System.out.println("Scrivi dove abiti: ");
		String dato3 = dati.nextLine();
		System.out.println("Ciao " + dato1 +" "+ dato2 +" "+ dato3 );
		System.out.println("Ciao " + dato3 +" "+ dato2 +" "+ dato1 );
		
		
		//---------------------esercizio4
		
		
		
		Scanner perimetro = new Scanner(System.in);
		System.out.println("Scrivi Lato1: ");
		String latoX = perimetro.nextLine();
		System.out.println("Scrivi Lato2: ");
		String latoY = perimetro.nextLine();
		double perimetroX= Double.parseDouble(latoX)*2 + Double.parseDouble(latoY)*2;
		System.out.println("Il perimetro è di: " + perimetroX );
		
		Scanner area = new Scanner(System.in);
		System.out.println("Scrivi Lato1: ");
		String latoA = area.nextLine();
		System.out.println("Scrivi Lato2: ");
		String latoB = area.nextLine();
		System.out.println("Scrivi Lato3: ");
		String latoZ = area.nextLine();
		double latoC= Double.parseDouble(latoA);
		double latoV= Double.parseDouble(latoB);
		double latoN= Double.parseDouble(latoZ);
		double p = (latoC+latoV+latoN)/2;
		
		
		double areaX= Math.sqrt(p*(p-latoC)*(p-latoV)*(p-latoN));
		System.out.println("Il perimetro è di: " + areaX );
		
		Scanner numeri = new Scanner(System.in);
		System.out.println("Scrivi un numero intero :");
		String numero = numeri.nextLine();
		int numeroN= Integer.parseInt(numero);}
		public static int pari(int numeroN) {
		if((numeroN % 2)==0) {
			return   0;
		} else {
			return 1;
		}
		
		
		

}}
