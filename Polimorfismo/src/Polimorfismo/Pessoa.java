package Polimorfismo;

public class Pessoa {
	
	public String nome;
	public int idade;
	public String formaPagamento;
	public float valorCompra;
	
	public Pessoa(String nome, int idade, String formaPagamento, float valorCompra) {
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

	public float getValorCompra() {
		return valorCompra;
	}
	
	
	

	

}
