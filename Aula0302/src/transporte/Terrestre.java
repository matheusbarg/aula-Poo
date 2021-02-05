package transporte;

public class Terrestre extends Transporte {

	private String nome;
	private int  quantidadeRodas;
	
	
	public Terrestre(int capacidade, int velocidadeMax, double peso, double comprimento, double altura, String nome,
			int quantidadeRodas) {
		super(capacidade, velocidadeMax, peso, comprimento, altura);
		this.nome = nome;
		this.quantidadeRodas = quantidadeRodas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}


	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
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
	
	public void arrumar() {
		System.out.println("arrumando");
	}
	
}
