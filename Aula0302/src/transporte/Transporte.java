package transporte;

public class Transporte {

	private int capacidade;
	private int velocidadeMax;
	private double peso;
	private double comprimento;
	private double altura;
	
	

	public Transporte(int capacidade, int velocidadeMax, double peso, double comprimento, double altura) {
		
		this.capacidade = capacidade;
		this.velocidadeMax = velocidadeMax;
		this.peso = peso;
		this.comprimento = comprimento;
		this.altura = altura;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public int getVelocidadeMax() {
		return velocidadeMax;
	}


	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void andar() {
		System.out.println("Andando");
	}
	
	public void carregar() {
		System.out.println("carregando carga");
	}
	
	public void transportar() {
		System.out.println("Transportar");
	}
	
	public void estragar() {
		System.out.println("Estragando");
	}
	
	public void acelerar() {
		System.out.println("Acelerando");
	}
}
