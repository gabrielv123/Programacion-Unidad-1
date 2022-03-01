package evaluacion1;

import java.util.Scanner;

public class Buscanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n , contador;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
		contador =0;
		
		while (n!=14) {
		
			System.out.println("escribe un numero ");
			n = teclado.nextInt();
			
		contador=contador+1;
			
			
			
		}
		System.out.println("por fin " + contador+ " intento ");
		
	}

}
