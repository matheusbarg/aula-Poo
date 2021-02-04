package aula0202;

public class Conta {

	private String titular;
	private int numero;
	private	 String nomeBanco;
	private double saldo;
	private String agencia;
	private int digito;
	private int validade;
	private double financiamento;
		
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}


	public double sacar( double valor) {
		return saldo-valor;
	}
	
	public double depositar( double valor) {
		return saldo+valor;
	}
	
	public void transferir(double valor, String conta) {
		System.out.println("trasnsferencia com sucessor para conta "+conta+"com o valor de "+valor );
	}
	
	public void gerarFinanciamento(double valor,String mes) {
		System.out.println("Financiamento de "+valor+" com pagamento de"+mes);
	}
	 
	public double aumentarLimite(double valor) {
		return  this.limite+valor;
	}
	
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getNumeroConta() {
		return numero;
	}


	public void setNumeroConta(int numeroConta) {
		this.numero = numeroConta;
	}


	public double getLimiteConta() {
		return limite;
	}


	public void setLimiteConta(double limiteConta) {
		this.limite = limiteConta;
	}


	public String getNomeBanco() {
		return nomeBanco;
	}


	public void setNomeBanco(String nomeBanco) {
		nomeBanco = nomeBanco;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public int getDigitoConta() {
		return digito;
	}


	public void setDigitoConta(int digitoConta) {
		this.digito = digitoConta;
	}


	public int getValidadeConta() {
		return validade;
	}


	public void setValidadeConta(int validadeConta) {
		this.validade = validadeConta;
	}


	public double getFinanciamentoConta() {
		return financiamento;
	}


	public void setFinanciamentoConta(double financiamentoConta) {
		this.financiamento = financiamentoConta;
	}


	public int getCodigoConta() {
		return codigoConta;
	}


	public void setCodigoConta(int codigoConta) {
		this.codigoConta = codigoConta;
	}
	
	
	
	
}
