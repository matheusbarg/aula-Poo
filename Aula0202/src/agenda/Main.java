package agenda;

public class Main {

	public Main() {
	
	}

	public static void main(String[] args) {
		
		Contato p1 = new Contato(1,"Matheus","321456","bebenbeaenen","teste","1234567","1789532");
		Contato p2 = new Contato(2,"Ana","321456","bebenbeaenen","teste","1234567","1789532");
		Agenda contatos = new Agenda();
		
		contatos.incluir(p1);
		contatos.incluir(p2);
		contatos.excluir(p2);
		System.out.println(contatos.listar());
		contatos.alterar(p1);
		System.out.println(contatos.listar());
		
	}

}
