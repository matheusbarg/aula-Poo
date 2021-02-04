package agenda;

public class Contato {
	
	private int codigo;
	private String nome;
	private String telefone;
	private String email;
	private String empresa;
	private String telefoneResidencial;
	private String telefoneCelular;

	

	
	public Contato(int codigo,String nome, String telefone, String email, String empresa, String telefoneResidencial,String telefoneCelular) {	
		this.codigo=codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.empresa = empresa;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneCelular = telefoneCelular;
	}

	
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}


	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	@Override
	public String toString() {
		
		return  codigo+":"+nome+":"+telefone+":"+email+":"+empresa+":"+telefoneResidencial+":"+ telefoneCelular;
	
				
	}

}
