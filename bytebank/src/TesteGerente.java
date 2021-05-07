
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Master");
		gerente.setCpf("123456789-00");
		gerente.setSalario(5000);
		gerente.setSenha(123456);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		System.out.println(gerente.autentica(123456));
	}
}
