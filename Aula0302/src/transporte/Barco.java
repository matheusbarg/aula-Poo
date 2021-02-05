package transporte;

public class Barco extends Aquatico {

	private int quantidadeMotor;
	private String tipoMotor;
	private String Placa;
	private String NomePiloto;
	private String combustivel;
	
	
	public Barco(int capacidade, int velocidadeMax, double peso, double comprimento, double altura, String nome,
			int quantidadeMotor, String tipoMotor, String placa, String nomePiloto, String combustivel) {
		super(capacidade, velocidadeMax, peso, comprimento, altura, nome);
		this.quantidadeMotor = quantidadeMotor;
		this.tipoMotor = tipoMotor;
		Placa = placa;
		NomePiloto = nomePiloto;
		this.combustivel = combustivel;
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
	
	public void navegar() {
		System.out.println("navegando");
	}
	

}
