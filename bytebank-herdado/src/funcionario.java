
public class Funcionario {
    private String Nome;
    private String CPF;
    private double Salario;
    
    
    public double getBonificacao() {   
    	return this.Salario * 0.10;
    }
    
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double Salario) {
		this.Salario = Salario;
	}

}
