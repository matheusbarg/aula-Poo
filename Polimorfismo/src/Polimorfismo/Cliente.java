package Polimorfismo;

public class Cliente extends Pessoa {
	
	
	public Cliente(String nome, int idade, String formaPagamento, float valorCompra) {
		super(nome, idade, formaPagamento, valorCompra);
		// TODO Auto-generated constructor stub
	}
	
	
	public float calculoImposto() {
		return (float) ((this.valorCompra*0.03)+(this.valorCompra));
	}
	
	
	public float desconto() {
		return (this.valorCompra-(this.calculoImposto()*5/100));
	}

	@Override
	public String toString() {
		
		return "Nome: "+getNome()+" Valor Compra "+this.valorCompra+ " Desconto: " +(valorCompra-desconto())+" Imposto: "+(calculoImposto()-getValorCompra())+
				" Valor total: "+desconto();
	}
	
	

}
