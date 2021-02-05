package transporte;

public class Aquatico extends Transporte {

	private String nome;

	
	
	public Aquatico(int capacidade, int velocidadeMax, double peso, double comprimento, double altura, String nome
			 ) {
		super(capacidade, velocidadeMax, peso, comprimento, altura);
		this.nome = nome;
	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void frear() {
		System.out.println("freando");
	}
	
	public void transportar() {
		System.out.println("Trasnportando");
	}
	
	public void andar() {
		System.out.println("Andando");
	}
	
	public void navegarr() {
		System.out.println("navegando");
	}
	
}