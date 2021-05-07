
public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta(001,000001);
		conta.setTitular(new Cliente());
		conta.getTitular().setNome("Aurélio123");
		
			
		Conta conta2 = new Conta(001,000002);
		conta2.setTitular(new Cliente());
		conta2.getTitular().setNome("Usuario 2");
		
		conta.deposito(1000);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getSaldo());
		System.out.println(Conta.getTotal());
		
		System.out.println(conta2.getTitular().getNome());
		System.out.println(conta2.getSaldo());
		System.out.println(Conta.getTotal());
	}
}