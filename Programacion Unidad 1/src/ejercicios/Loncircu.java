package evaluacion1;

import java.util.Scanner;

public class Loncircu {
	
	public static void main(String[] args) {
		
		double n , r;
		
		r= Math.PI;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce unh valor entero ");
		
		n = teclado.nextDouble();
		
		n= r*n;
		
		System.out.println("el valor de la variable es "+n );
		
		teclado.close();

}
}