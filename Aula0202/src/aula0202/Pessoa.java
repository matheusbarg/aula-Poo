package aula0202;

public class Pessoa {
	
	private String nome;
	private int anoNascimento;
	private String genero;
	private String nacionalidade;
	private String escolaridade;
	private String endereco;
	private double altura;
	private double peso;
	private String naturalidade;
	private String profissao;
	public Pessoa() {
		
		
	}
	
	public void andar() {
		System.out.println(this.nome + " está andando  ");
	}
	
	public void comer() {
		System.out.println(this.nome + " está comendo  ");
	}
	
	public void correr() {
		System.out.println(this.nome + " está correndo  ");
	}
	
	public int calcularIdade() {
		return 2021-this.anoNascimento;
	}
	
	public double calcularImc() {
		return (this.peso/(this.altura*this.altura));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	

}
