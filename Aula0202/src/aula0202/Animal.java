package aula0202;

public class Animal {

	private String nome;
	private String reino;
	private int quantidadePernas;
	private String nomeCientifico;
	private double altura;
	private double peso;
	private double velocidadeMaxima;
	private String reproducao; 
	private int idade;
	private String nacionalidade;
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public void andar() {
		System.out.println(nome+" está andando");
	}
	
	public void comer() {
		System.out.println(nome+" está comendo");
	}
	
	public void dormir() {
		System.out.println(nome+" está dormindo");
	}
	
	public void acordar() {
		System.out.println(nome+" está acordando");
	}
	
	public void movimentar() {
		System.out.println(nome+" está movimentando");
	}
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getReino() {
		return reino;
	}


	public void setReino(String reino) {
		this.reino = reino;
	}


	public int getQuantidadePernas() {
		return quantidadePernas;
	}


	public void setQuantidadePernas(int quantidadePernas) {
		this.quantidadePernas = quantidadePernas;
	}


	public String getNomeCientifico() {
		return nomeCientifico;
	}


	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}


	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}


	public String getReproducao() {
		return reproducao;
	}


	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	
}
