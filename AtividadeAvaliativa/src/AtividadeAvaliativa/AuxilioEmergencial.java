package AtividadeAvaliativa;

import java.util.ArrayList;

public class AuxilioEmergencial {
	
	private ArrayList<Beneficiados> beneficiados=new ArrayList<>();
	
	public AuxilioEmergencial() {
		
	}

	public void addBeneficiados(Beneficiados b) {
		beneficiados.add(b);
	}
	
	public ArrayList<Beneficiados> listarBeneficiados(){
			return beneficiados;
		}
	
}
