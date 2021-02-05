package transporte;

public class Aereo extends Transporte {

	private String metodoVoar;
	private String nome;
	private String combustivel;
	private String alturaVoo;
	private String sistemaSeguranca;
	
	
	

	public Aereo(int capacidade, int velocidadeMax, double peso, double comprimento, double altura, String metodoVoar,
			String nome, String combustivel, String alturaVoo, String sistemaSeguranca) {
		super(capacidade, velocidadeMax, peso, comprimento, altura);
		this.metodoVoar = metodoVoar;
		this.nome = nome;
		this.combustivel = combustivel;
		this.alturaVoo = alturaVoo;
		this.sistemaSeguranca = sistemaSeguranca;
	}


	public String getMetodoVoar() {
		return metodoVoar;
	}


	public void setMetodoVoar(String metodoVoar) {
		this.metodoVoar = metodoVoar;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public String getAlturaVoo() {
		return alturaVoo;
	}


	public void setAlturaVoo(String alturaVoo) {
		this.alturaVoo = alturaVoo;
	}


	public String getSistemaSeguranca() {
		return sistemaSeguranca;
	}


	public void setSistemaSeguranca(String sistemaSeguranca) {
		this.sistemaSeguranca = sistemaSeguranca;
	}
	
	public void voar() {
		System.out.println("voar");
	}
	
	public void pousar() {
		System.out.println("pousando");
	}
	
	public void acelerar() {
		System.out.println("acelerar");
	}
	
	public void frear() {
		System.out.println("freando");
	}
	
	public void transportar() {
		System.out.println("Trasnportando");
	}
	

}
