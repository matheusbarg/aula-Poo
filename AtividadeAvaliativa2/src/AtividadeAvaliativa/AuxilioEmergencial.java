package AtividadeAvaliativa;

import java.util.ArrayList;

public class AuxilioEmergencial {
	
	private ArrayList<Beneficiado> beneficiados=new ArrayList<>();
	
	public AuxilioEmergencial() {
		
	}

	public void addBeneficiados(Beneficiado b) {
		beneficiados.add(b);
	}
	
	public ArrayList<Beneficiado> listarBeneficiados(){
			return beneficiados;
	}
	
	public Beneficiado maiorValor() {
		Beneficiado maiorValor = null;
		for(Beneficiado b :beneficiados) {
				if(maiorValor == null||b.getValorBeneficio()<maiorValor.getValorBeneficio()) {
					maiorValor=b;
				}
		}
		return maiorValor;
	}
	
	public Beneficiado maiorTempo() {
		Beneficiado maiorTempo = null;
		for(Beneficiado b :beneficiados) {
				if(maiorTempo == null||b.getTempoBeneficio()<maiorTempo.getTempoBeneficio()) {
					maiorTempo=b;
				}
		}
		return maiorTempo;
	}
	public int contarElementos() {
		return beneficiados.size();
	}
	
}