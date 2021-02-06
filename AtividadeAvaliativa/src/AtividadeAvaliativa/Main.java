package AtividadeAvaliativa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
		
		 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		AuxilioEmergencial a= new AuxilioEmergencial();
			
		String sair = null;
		
		while(sair=="N"||sair =="n") {
			System.out.println("Digite seu nome completo:");
			String nome= teclado.next();
			System.out.println("Digite sua data de nascimento:");
			String dataNasc = teclado.next();
			System.out.println("Informe sua Idade");
			int idade = teclado.nextInt();
			System.out.println("Digite sua situção entre: 1-EMPREGADO,2-DESEMPREGADO,3-EMPREGADOR");
			int opcao = teclado.nextInt();
			Categoria categoria = null;
			if(opcao==1) {
				categoria=categoria.EMPREGADO;
			}else if(opcao==2) {
				categoria=categoria.DESEMPREGADO;
			}else {
				categoria=categoria.EMPREGADOR;
			}
			System.out.println("Informe seu Estado");
			String estado = teclado.next().toUpperCase();
		
			Beneficiados p1=new Beneficiados(nome,idade,dataNasc,categoria,estado);
			a.addBeneficiados(p1);
			System.out.println("Deseja Continuar S para Sim ou N para Nao");
			 sair = teclado.nextLine();
			};
			

	
	}
	
	

}
