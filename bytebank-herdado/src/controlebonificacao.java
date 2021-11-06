
public class controlebonificacao {
	
	private double soma;

	
	public void registra(funcionario f) {
		double boni = f.getbonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getsoma() {       
		return soma;
	}



}
