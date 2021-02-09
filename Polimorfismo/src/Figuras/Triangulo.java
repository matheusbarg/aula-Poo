package Figuras;

public class Triangulo extends Figuras {

	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(String nome,double ladoA,double ladoB,double ladoC) {
		super( nome);
		this.ladoA=ladoA;
		this.ladoB=ladoB;
		this.ladoC=ladoC;
	}

	@Override
	public double getArea() {
		
		return (ladoA*ladoB)/2;
	}

	@Override
	public double getPerimetro() {
		return ladoA+ladoB+ladoC;
	}

	

}
