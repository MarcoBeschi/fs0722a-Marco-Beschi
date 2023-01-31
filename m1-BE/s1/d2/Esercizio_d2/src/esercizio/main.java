package esercizio;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rettangolo r1 = new Rettangolo(12.4,15.7);
		stampaRettangolo(r1);
		
		Rettangolo r2 = new Rettangolo(15.5,17.8,13.2,27.8);
		stampaDueRettangoli(r2);
	}
	public static void stampaRettangolo(Rettangolo r) {
		System.out.println("perimetro: " + r.Perimetro()+" " + "area: " + r.Area());
	}
	public static void stampaDueRettangoli(Rettangolo r4) {
		System.out.println("il perimetro dei due rettangoli è: " + r4.SommaPerimetro() + " e la somma dell area è :" + r4.SommaArea());
	}
	
}
