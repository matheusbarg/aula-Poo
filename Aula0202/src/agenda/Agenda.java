package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	private ArrayList<Contato> contatos = new ArrayList<>();
	
	public Agenda() {
	
	}
	
	public void incluir(Contato c) {
		this.contatos.add(c);
	}
	
	public void excluir(Contato c) {
		this.contatos.remove(c);
	}
	
	public ArrayList<Contato> listar() {
		return contatos;
	}
	
	public void alterar(Contato c) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Deseja Altera o que ?");
		System.out.println("1-Nome"); ;
		System.out.println("2-Telefone");;
		System.out.println("3-Email");;
		System.out.println("4-Empresa");;
		System.out.println("5-Telefone Residencial");;
		System.out.println("6-Telefone Celular");;
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o novo nome: ");
			String nome =teclado.next();
			c.setNome(nome);
			break;
			
		case 2:
			System.out.println("Digite o novo telefone: ");
			String telefone = teclado.next();
			c.setTelefone(telefone);
			break;
			
		case 3:
			System.out.println("Digite o novo email: ");
			String email = teclado.next();
			c.setEmail(email);
			break;
			
		case 4:
			System.out.println("Digite o novo empresa: ");
			String empresa = teclado.next();
			c.setEmpresa(empresa);
			break;
			
		case 5:
			System.out.println("Digite o novo telefoneResidencial: ");
			String telefoneResidencial = teclado.next();
			c.setTelefoneResidencial(telefoneResidencial);
			break;
			
		case 6:
			System.out.println("Digite o novo telefoneCelular: ");
			String telefoneCelular = teclado.next();
			c.setTelefoneCelular(telefoneCelular);
			break;

		
		}
	}
}
