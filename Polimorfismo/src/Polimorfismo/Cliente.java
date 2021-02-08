package Polimorfismo;

public class Cliente extends Pessoa {
	
	
	public Cliente(String nome, int idade, String formaPagamento, double valorCompra) {
		super(nome, idade, formaPagamento, valorCompra);
		// TODO Auto-generated constructor stub
	}
	
	
	public double calculoImposto() {
		return this.valorCompra=(this.valorCompra*(3/100))+this.valorCompra;
	}
	
	
	public double desconto() {
		return this.valorCompra=this.valorCompra-(this.calculoImposto()*5/100);
	}

	@Override
	public String toString() {
		
		return "Nome: "+getNome()+"Desconto:"+desconto()+"Imposto:"+calculoImposto()+
				"Valor total:"+desconto();
	}
	
	

}
