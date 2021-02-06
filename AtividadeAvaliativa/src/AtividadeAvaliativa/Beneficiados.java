package AtividadeAvaliativa;

import java.util.ArrayList;

public class Beneficiados {

	private String nomeCompleto;
	private String dataNasc;
	private int idade;
	private Categoria categoria;
	private String estado;	
	private double valorTotal;
	private double valorBeneficio;
	private double tempoDesempregado;
	
	
	
	public Beneficiados(String nomeCompleto,int idade, String dataNasc, Categoria categoria, String estado) {
		this.idade=idade;
		this.nomeCompleto = nomeCompleto;
		this.dataNasc = dataNasc;
		this.categoria = categoria;
		this.estado = estado.toUpperCase();
		if(idade>18) {
		this.valorBeneficio=getValorBeneficio();
		}
	}

	
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNasc() {
		return dataNasc;
	}


	public Categoria getCategoria() {
		return categoria;
	}



	public String getEstadoUF() {
		return estado;
	}
	
	
	
	public double getValorBeneficio() {
	
		if(this.categoria==categoria.DESEMPREGADO) {
			return valorBeneficio=1500;
		}
		if(this.categoria==categoria.EMPREGADO) {
			return valorBeneficio=1000;
		}
		
		return 200;
		
	}
	
	
	public double moraSaoPaulo() {
		return (this.valorBeneficio*(10/100))+this.valorBeneficio;
	}
	
	public double moraPara() {
		return (this.valorBeneficio*(9/100))+this.valorBeneficio;
	}
	
	public double reducao6meses() {
		return this.valorBeneficio-(this.valorBeneficio*(6/100));
	}
	
	public double aposentado() {
		return this.valorBeneficio*6;
	}
	
	
	
	@Override
	public String toString() {
		
		return "nome: "+this.nomeCompleto+"\n"+
			   "Data Nascimento: "+this.dataNasc+"\n"+
			   "Categoria: "+this.categoria+"\n"+
			   
			   "Estado: "+this.estado+"\n"+
			   "Valor Beneficio R$: "+this.valorTotal+"\n";
			  
	}
}


	
	
	
	
	

