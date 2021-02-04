package aula0302;

public class Animal {

	private float tamanho;
	private String cor;
	
	
	
	public Animal(float tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}

	

	public void comer() {
		System.out.println("Está comendo");
	}



	public float getTamanho() {
		return tamanho;
	}



	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}

}
