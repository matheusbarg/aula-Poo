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
	private boolean aposentado;
	private int desempregado;
	private int tempoBeneficio;

	public Beneficiados(String nomeCompleto, int idade, String dataNasc, Categoria categoria, String estado,
			boolean aposentado, int desempregado) {
		if (idade < 18) {
			System.err.print("Voce nao tem direito ao beneficio por nao ter 18 anos" + "\n");
		} else {
			this.idade = idade;
		}
		this.nomeCompleto = nomeCompleto;
		this.dataNasc = dataNasc;
		this.categoria = categoria;
		this.estado = estado;
		if (aposentado == true) {
			this.aposentado = aposentado;
			aposentado();
			tempoBeneficio = 6;
		} else {
			this.aposentado = aposentado;
		}
		if (categoria == categoria.DESEMPREGADO) {
			{
				valorBeneficio = 1500;
			}
		} else if (categoria == categoria.EMPREGADO) {
			valorBeneficio = 1000;
		}
		if (desempregado < 6) {
			this.desempregado = desempregado;
			reducao6meses();
		} else {
			this.desempregado = desempregado;
		}
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getTempoBeneficio() {
		return this.tempoBeneficio = 2;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public double getValorBeneficio() {
		return valorBeneficio * 2;
	}

	public String getEstado() {
		return estado.toUpperCase().trim();
	}

	public double moraSaoPaulo() {
		return valorBeneficio = (this.valorBeneficio * (10 / 100)) + this.valorBeneficio;
	}

	public double moraPara() {
		return (this.valorBeneficio * (9 / 100)) + this.valorBeneficio;
	}

	public double reducao6meses() {
		return this.valorBeneficio - (this.valorBeneficio * (10 / 100));
	}

	public double aposentado() {
		return this.valorBeneficio * 6;
	}

	@Override
	public String toString() {

		return "nome: " + this.nomeCompleto + "\n" + "Data Nascimento: " + this.dataNasc + "\n" + "Categoria: "
				+ this.categoria + "\n" + "Idade: " + this.idade + "\n" + "Estado: " + this.estado + "\n"
				+ "Valor Beneficio R$: " + this.valorBeneficio + "\n" +   "Tempo Beneficio: " + getTempoBeneficio()
				+ "Regras:" + "\n" + "O benefício de pessoas que moram em São Paulo terá acréscimo de 10%;" + "\n"
				+ "O benefício só será concedido para maiores de 18 anos;" + "\n"
				+ "O benefício de pessoas que moram no Pará terá acréscimo de 9%;" + "\n"
				+ "O Se estiver desempregado há menos de 6 meses terá uma redução de 10%;" + "\n"
				+ "O benefício será de 6 meses para aposentados ?";

	}
}
