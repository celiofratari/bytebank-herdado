
public class gerente extends funcionario {
  
    private int senha;
    
    public void setSenha(int senha) {
		this.senha = senha;
	}
    
    public boolean autentica(int senha) {
    	if(this.senha == senha) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public double getbonificacao() {   
	    return super.getbonificacao() + super.getSalario(); 
    }
    

}
