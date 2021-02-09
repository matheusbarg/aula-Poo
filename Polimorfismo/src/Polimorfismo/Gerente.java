package Polimorfismo;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, String formaPagamento, float valorCompra) {
		super(nome, idade, formaPagamento, valorCompra );
		
	}

	

	public float calculoImposto() {
		return (float) ((this.valorCompra*0.11))+this.getValorCompra();
	}
	
	
	public float desconto() {
			return this.valorCompra=this.valorCompra-(this.calculoImposto()*28/100);
		
		
	}
}
	


