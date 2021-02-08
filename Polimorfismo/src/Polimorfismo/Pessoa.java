package Polimorfismo;

public class Pessoa {
	
	public String nome;
	public int idade;
	public String formaPagamento;
	public double valorCompra;
	
	public Pessoa(String nome, int idade, String formaPagamento, double valorCompra) {
		this.nome = nome;
		this.idade = idade;
		this.formaPagamento = formaPagamento;
		this.valorCompra = valorCompra;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public double getValorCompra() {
		return valorCompra;
	}
	
	
	

	

}
