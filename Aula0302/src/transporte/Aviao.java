package transporte;

public class Aviao extends Aereo {

	private int quantidadeMotor;
	private String tipoMotor;
	private String Placa;
	private String NomePiloto;
	private String combustivel;
	
	
	public Aviao(int capacidade, int velocidadeMax, double peso, double comprimento, double altura, String metodoVoar,
			String nome, String combustivel, String alturaVoo, String sistemaSeguranca, int quantidadeMotor,
			String tipoMotor, String placa, String nomePiloto, String combustivel2) {
		super(capacidade, velocidadeMax, peso, comprimento, altura, metodoVoar, nome, combustivel, alturaVoo,
				sistemaSeguranca);
		this.quantidadeMotor = quantidadeMotor;
		this.tipoMotor = tipoMotor;
		Placa = placa;
		NomePiloto = nomePiloto;
		combustivel = combustivel2;
	}


	public int getQuantidadeMotor() {
		return quantidadeMotor;
	}


	public void setQuantidadeMotor(int quantidadeMotor) {
		this.quantidadeMotor = quantidadeMotor;
	}


	public String getTipoMotor() {
		return tipoMotor;
	}


	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}


	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String placa) {
		Placa = placa;
	}


	public String getNomePiloto() {
		return NomePiloto;
	}


	public void setNomePiloto(String nomePiloto) {
		NomePiloto = nomePiloto;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
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
