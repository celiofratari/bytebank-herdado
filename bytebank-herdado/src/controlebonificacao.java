
public class ControleBonificacao {
	
	private double Soma;

	
	public void Registra(funcionario f) {
		double Boni = f.getBonificacao();
		this.Soma = this.soma + Boni;
	}
	
	public double getSoma() {       
		return Soma;
	}



}
