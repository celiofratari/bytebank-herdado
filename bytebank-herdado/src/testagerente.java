
public class TestaGerente {

	public static void main(String[] args) {
	    Gerente G1 = new Gerente();
	    G1.setNome("celio");
	    G1.setCPF("070757036-09");
	    G1.setSalario(5000.0);
	    G1.setSenha(12345);
	    
	    System.out.println(G1.getNome());
	    System.out.println(G1.getCPF());
	    System.out.println(G1.getSalario());
	    
	    boolean Autenticou = G1.Autentica(12345);
	    
	    System.out.println(Autenticou);
	    
	    System.out.println(G1.getBonificacao());

	}

}
