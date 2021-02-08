package Polimorfismo;

public class Funcionario extends Pessoa {

	public boolean gerente;
	
	public Funcionario(String nome, int idade, String formaPagamento, double valorCompra,boolean gerente) {
		super(nome, idade, formaPagamento, valorCompra);
		this.gerente=gerente;
	}

	
	
	public double calculoImposto() {
		return this.valorCompra=(this.valorCompra*11/100)+this.valorCompra;
	}
	
	
	public double desconto() {
		if(gerente==true) {
			return this.valorCompra=this.valorCompra-(this.calculoImposto()*28/100);
		}else {
			return this.valorCompra=this.valorCompra-(this.calculoImposto()*25/100);
		}
	}
	
	@Override
	public String toString() {
		
		return "Nome: "+getNome()+"Desconto:"+desconto()+"Imposto:"+calculoImposto()+
				"Valor total:"+desconto();
	}
	

}
