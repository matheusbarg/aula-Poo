package transporte;

public class Automovel extends Terrestre {

	private String placa;
	private	int quilometroRodados;
	private	int quantidadePortas;
	private int combustivel;
	private int tipoMotor;
	
	
	public Automovel(int capacidade, int velocidadeMax, double peso, double comprimento, double altura, String nome,
			int quantidadeRodas, String placa, int quilometroRodados, int quantidadePortas, int combustivel,
			int tipoMotor) {
		super(capacidade, velocidadeMax, peso, comprimento, altura, nome, quantidadeRodas);
		this.placa = placa;
		this.quilometroRodados = quilometroRodados;
		this.quantidadePortas = quantidadePortas;
		this.combustivel = combustivel;
		this.tipoMotor = tipoMotor;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getQuilometroRodados() {
		return quilometroRodados;
	}


	public void setQuilometroRodados(int quilometroRodados) {
		this.quilometroRodados = quilometroRodados;
	}


	public int getQuantidadePortas() {
		return quantidadePortas;
	}


	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}


	public int getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}


	public int getTipoMotor() {
		return tipoMotor;
	}


	public void setTipoMotor(int tipoMotor) {
		this.tipoMotor = tipoMotor;
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
