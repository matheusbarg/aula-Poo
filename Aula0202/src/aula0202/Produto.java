package aula0202;

public class Produto {

	private String descricao;
	private	double valor;
	private int quantidade;
	private String fabricadoPais;
	private double peso;
	private double altura;
	private	String cor;
	private String marca;
	private String modelo;
	private String nome;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	public int vender() {
		return this.quantidade-1;
	}
	
	public int comprar() {
		return this.quantidade+1;
	}
	
	public void anunciar() {
		System.out.println(nome+" anunciado");
	}
	
	public void trocar() {
		System.out.println(nome+" trocado");
	}
	
	public void negociar() {
		System.out.println(nome+" negociado");
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFabricadoPais() {
		return fabricadoPais;
	}

	public void setFabricadoPais(String fabricadoPais) {
		this.fabricadoPais = fabricadoPais;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
