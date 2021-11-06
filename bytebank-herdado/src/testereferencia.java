
public class testereferencia {

	public static void main(String[] args) {
		
		gerente g1 = new gerente(); 
		g1.setNome("celio");
		g1.setSalario(500);
		
		funcionario f = new funcionario();
		f.setSalario(500);
		
		editorvideo ev = new editorvideo();
		ev.setSalario(500);
		
	    disigner d = new disigner();
		d.setSalario(500);
		
		controlebonificacao controle = new controlebonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getsoma());

	}

}
