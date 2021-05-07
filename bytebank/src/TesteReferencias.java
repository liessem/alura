

public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(1000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2000);
		
		Designer dd = new Designer();
		dd.setSalario(3000);
		
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(funcionario);
		controle.registra(ev);
		controle.registra(dd);
		controle.registra(gerente);
		
		System.out.println(funcionario.getBonificacao());
		System.out.println(ev.getBonificacao());
		System.out.println(dd.getBonificacao());
		System.out.println(gerente.getBonificacao());
		System.out.println(controle.getSoma());
	}
}
