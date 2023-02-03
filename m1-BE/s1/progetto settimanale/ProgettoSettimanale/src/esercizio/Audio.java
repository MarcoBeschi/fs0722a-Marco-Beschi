package esercizio;

public class Audio extends ElementoMultimediale {

	int volume;
	String punto = "!";
	
	public Audio(String titolo, int durata) {
		super(titolo, durata);
		this.volume=1;
	}
	
	public void alzaVolume(){
		if(this.volume == 5) {
			System.out.println("Volume al massimo");
		}else {
			this.volume += 1;
			this.punto += "!";
		}
	}
	
	public int abbassaVolume(){
		switch(this.volume) {
			case 0:
				System.out.println("Volume al minimo");
				break;
			case 1:
				this.volume-=1;
				this.punto="";
				break;
			case 2:
				this.volume-=1;
				this.punto="!";
				break;
			case 3:
				this.volume-=1;
				this.punto="!!";
				break;
			case 4:
				this.volume-=1;
				this.punto="!!!";
				break;
			case 5:
				this.volume-=1;
				this.punto="!!!!";
				break;
		}
		return this.volume;
	}
	
	public void play() {
		for(int i = 0;i<this.getDurata();i++) {
			System.out.println(this.getTitolo()+" "+this.punto);			
		}
	}

	@Override
	protected void show() {
		
	}
	public String toString(){
		return super.toString()+" di tipologia audio della durata di: "+this.getDurata() + "min";
	}
}

