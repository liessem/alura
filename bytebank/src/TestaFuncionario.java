
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Aurelio");
		funcionario.setCpf("123456789-00");
		funcionario.setSalario(1000);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacao());
	}

}
