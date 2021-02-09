package Figuras;

public final class Quadrado extends Paralelograma {

	public Quadrado(String nome,double ladoA) {
		super(nome,ladoA,ladoA);
	}
	
	public double getLado() {
		return this.getLadoA();
	}

}
