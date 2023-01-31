package esercizio;

public class Rettangolo {
	
	double latoA;
	double latoB;
	double latoC;
	double latoD;

public Rettangolo(double latoA,double latoB){
	this.latoA=latoA;
	this.latoB=latoB;
}
public Rettangolo(double latoA,double latoB,double latoC, double latoD) {
	this.latoA=latoA;
	this.latoB=latoB;
	this.latoC=latoC;
	this.latoD=latoD;
}
public double Perimetro() {
	return (this.latoA*2) + (this.latoB*2);
}
public double Area() {
	return this.latoA*this.latoB;
}


public double SommaPerimetro() {
	return (this.latoA*2) + (this.latoB*2) + (this.latoC*2) + (this.latoD*2);
}
public double SommaArea() {
	return (this.latoA*this.latoB)+(this.latoC*this.latoD);
}

}