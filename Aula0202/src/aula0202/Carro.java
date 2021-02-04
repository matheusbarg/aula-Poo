package aula0202;

public class Carro {

	private String modelo;
	private String marca;
	private int ano;
	private String quilometrosRodados;
	private int velocidade;
	private boolean isMotorLigado;
	private String cor;
	private String tipoMotor;
	private String quantidadePortas;
	private  double preco;
	
	public Carro() {
	
	}
	
	public void ligarCarro () {
		System.out.println("Motor Ligado");
	}
	
	public void desligarCarro() {
		System.out.println("Motor Desligado");
	}
	
	
	public int acelerar() {
		return this.velocidade+1;
	}
	
	public int frear() {
		return this.velocidade-1;
	}
	
	public void ligarFarois() {
		System.out.println("Farois Ligados");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		ano = ano;
	}

	public String getQuilometrosRodados() {
		return quilometrosRodados;
	}

	public void setQuilometrosRodados(String quilometrosRodados) {
		this.quilometrosRodados = quilometrosRodados;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isMotorLigado() {
		return isMotorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.isMotorLigado = motorLigado;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(String quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	


}
