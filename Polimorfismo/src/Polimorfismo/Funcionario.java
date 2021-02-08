package Polimorfismo;

public class Funcionario extends Pessoa {

	public boolean gerente;
	
	public Funcionario(String nome, int idade, String formaPagamento, float valorCompra,boolean gerente) {
		super(nome, idade, formaPagamento, valorCompra);
		this.gerente=gerente;
	}

	
	
	public float calculoImposto() {
		return (float) ((this.valorCompra*0.11))+this.getValorCompra();
	}
	
	
	public float desconto() {
		if(gerente==true) {
			return this.valorCompra=this.valorCompra-(this.calculoImposto()*28/100);
		}else {
			return this.valorCompra=this.valorCompra-(this.calculoImposto()*25/100);
		}
	}
	
	@Override
	public String toString() {
		
		return "Nome: "+getNome()+" Valor Compra "+this.valorCompra+ " Desconto: " +(valorCompra-desconto())+" Imposto: "+(calculoImposto()-getValorCompra())+
				" Valor total: "+desconto();
	}
	
	

}
