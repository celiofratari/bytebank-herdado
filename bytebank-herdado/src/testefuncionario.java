
public class TesteFuncionario {

	public static void main(String[] args) {
		
	    Funcionario Nico = new Funcionario();
	    Nico.setNome("nico");
	    Nico.setCPF("070757036-09");
	    Nico.setSalario(2590.00);
	    
	    System.out.println(Nico.getNome());
	    System.out.println(Nico.getCPF());
	    System.out.println(Nico.getBonificacao());
	    
    }
}
