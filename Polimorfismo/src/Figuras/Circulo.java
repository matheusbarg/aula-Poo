package Figuras;

public class Circulo extends Figuras {

	private double raio;
	
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}



	@Override
	public double getArea() {
		return (Math.PI*Math.pow(this.raio, 2));
	}



	@Override
	public double getPerimetro() {
		
		return (2*Math.PI*this.raio);
	}
}
