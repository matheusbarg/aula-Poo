package questao4;

public class normal extends SalaAula {

	private boolean retroprojetor;
	private boolean tv;
	
	public normal(int capacidade, String id,String titulo) {
		super(capacidade,id,titulo);
	}

	public boolean isRetroprojetor() {
		return retroprojetor;
	}

	public void setRetroprojetor(boolean retroprojetor) {
		this.retroprojetor = retroprojetor;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}
	
	

}
