package Polimorfismo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Cliente c1 = new  Cliente("Matheus",22,"a vista",500);
		Funcionario f1= new Funcionario("Matheus",22,"Boleto",500,true);
		Funcionario f2= new Funcionario("Matheus",22,"Boleto",500,false);
		
		
		System.out.println(c1);
		System.out.println(c1.calculoImposto());
		System.out.println("");

		System.out.println(f1);
		System.out.println(f1.calculoImposto());
		
		System.out.println("");

		System.out.println(f2);
		System.out.println(f2.calculoImposto());

	}

}
