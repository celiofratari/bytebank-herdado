
public class Gerente extends Funcionario {
  
    private int Senha;
    
    public void setSenha(int Senha) {
		this.Senha = Senha;
	}
    
    public boolean Autentica(int Senha) {
    	if(this.Senha == Senha) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public double getBonificacao() {   
	    return super.getBonificacao() + super.getSalario(); 
    }
    

}
