package esercizio;

abstract class ElementoMultimediale {
	
	private String titolo;
	private int durata;

	
	public ElementoMultimediale(String titolo,int durata) {
		this.titolo=titolo;
		if(durata < 0) {
			System.out.println("La durata deve essere un numero positivo");
			this.durata=1;
		}else {
			this.durata=durata;
		}
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public int getDurata() {
		return durata;
	}

	protected abstract void play();

	protected abstract void show();

	@Override 
	public String toString(){
		return "Elemento "+this.titolo;
	}
}
