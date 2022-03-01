package evaluacion1;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double i , c , l ;
		
		int t;
		
		l=5.5;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("introduce la cantidad ");
		c = teclado.nextDouble();
		
		
		
		System.out.println("introduce el tiempo ");
		t = teclado.nextInt();
		
		i=c*l*t/(360*100);
		
		System.out.println("el interes es "+i);
		
		teclado.close();

	}

}
