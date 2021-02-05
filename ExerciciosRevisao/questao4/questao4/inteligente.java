package questao4;

public class inteligente extends SalaAula {

	private boolean computadorAluno;
	
	public inteligente(int capacidade, String id,String titulo) {
		super(capacidade,id,titulo);
	}

	public boolean isComputadorAluno() {
		return computadorAluno;
	}

	public void setComputadorAluno(boolean computadorAluno) {
		this.computadorAluno = computadorAluno;
	}
	
	
}
