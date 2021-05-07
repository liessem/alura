
public class NumerosFatoriais {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numeroFatorial = 0;
		int contador = 0;
		int numeroFatorialFinal = 0;
		
		int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " +fatorial);
        }
        
        for (int numero = 1; numero <= 10; numero++) {		  
        	contador = numero - 1; 
        	while(contador != 0) {   
    			numeroFatorial = numero * (numero - contador); 
    			contador = contador - 1;
    			numeroFatorialFinal += numeroFatorial;
    			System.out.println(numeroFatorialFinal);
			}
        	System.out.println("Fatorial de " + numero + " = " + numeroFatorialFinal);
        	numeroFatorial = 0;
        	numeroFatorialFinal = 0;
        }
	}
}