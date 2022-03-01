package evaluacion1;

import java.util.Scanner;

public class Calcuiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n, i;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce un numero ");
		
		n = teclado.nextDouble();
		
		if(n<2000) {
			
			i=n*0.07;
				
			System.out.printf("la cantidad es " +n + " es %.2f ", i);
		}
		
		else {
			
			i=n*0.16;
			
			System.out.printf(" la cantidad es " + n + " es %.2f ", i );
		}
		
		teclado.close();

	}

}
