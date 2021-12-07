
public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente G1 = new Gerente(); 
		G1.setNome("celio");
		G1.setSalario(500);
		
		Funcionario f = new funcionario();
		f.setSalario(500);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(500);
		
	    Disigner d = new Disigner();
		d.setSalario(500);
		
		ControleBonificacao Controle = new ControleBonificacao();
		Controle.Registra(G1);
		Controle.Registra(f);
		Controle.Registra(ev);
		Controle.Registra(d);
		
		System.out.println(Controle.getSoma());

	}

}
