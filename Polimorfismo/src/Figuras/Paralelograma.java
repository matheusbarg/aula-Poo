package Figuras;

public class Paralelograma extends Figuras{

	private double ladoA;

	private double ladoB;
	
	public Paralelograma(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA=ladoA;
		this.ladoB=ladoB;
	}

	@Override
	public final double getArea() {
		return ladoA*ladoB;
	}

	@Override
	public final double getPerimetro() {
		return (2* ladoA)+(2*ladoB) ;
	}
	
	final double getLadoA() {
		return ladoA;
	}
	
	 final double getLadoB() {
		return ladoB;
	}
	

	

}
