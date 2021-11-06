
public class testagerente {

	public static void main(String[] args) {
	    gerente g1 = new gerente();
	    g1.setNome("celio");
	    g1.setCpf("070757036-09");
	    g1.setSalario(5000.0);
	    g1.setSenha(12345);
	    
	    System.out.println(g1.getNome());
	    System.out.println(g1.getCpf());
	    System.out.println(g1.getSalario());
	    
	    boolean autenticou = g1.autentica(12345);
	    
	    System.out.println(autenticou);
	    
	    System.out.println(g1.getbonificacao());

	}

}
