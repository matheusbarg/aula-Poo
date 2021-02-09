package Polimorfismo;

public class Funcionario extends Pessoa {

	
	
	public Funcionario(String nome, int idade, String formaPagamento, float valorCompra) {
		super(nome, idade, formaPagamento, valorCompra);
		
	}

	
	
	public float calculoImposto() {
		return (float) ((this.valorCompra*0.11))+this.getValorCompra();
	}
	
	
	public float desconto() {
			return this.valorCompra=this.valorCompra-(this.calculoImposto()*25/100);
		}
	
	
	@Override
	public String toString() {
		
		return "Nome: "+getNome()+" Valor Compra "+this.valorCompra+ " Desconto: " +(valorCompra-desconto())+" Imposto: "+(calculoImposto()-getValorCompra())+
				" Valor total: "+desconto();
	}
	
	

}
