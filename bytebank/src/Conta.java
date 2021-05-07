public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int total = 0;
	
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}
	
	void deposito(double valor) {
		saldo += valor;
	}
	public boolean saque(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;			
		}
		return false;
	}
	public boolean transferencia(double valor, Conta destino) {
		if(saldo >= valor) {
			saldo -= valor;
			destino.deposito(valor);
			return true;
		}
		return false;
	}
	public double getSaldo() {
		return saldo;
	}	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Conta.total = total;
	}
}