package Figuras;

public final class Retangulo extends Paralelograma {

	public Retangulo(String nome,double ladoA,double ladoB) {
		super(nome,ladoA,ladoB);
	}
	
	
	public double getLadoMaior() {
		if(getLadoA()>getLadoB()) {
			return getLadoA();
		}
			return getLadoB();
		
	}
	

	public double getLadoMenor() {
		if(getLadoA()<getLadoB()) {
			return getLadoA();
		}
			return getLadoB();
		
	}
}
