/*
public class Programa {
	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }
	}
}*/
//Utilize um la�o do tipo for para imprimir todos os m�ltiplos de 3, entre 1 e 100.

/**
 * @author aurelio.gregorio
 *
 */
public class Programa {
	public static void main(String[] args) {
		for (int numero = 1; numero <= 100; numero++) {
			if(numero % 3 == 0) {
				System.out.println(numero);
			}
		}
	}
	
}