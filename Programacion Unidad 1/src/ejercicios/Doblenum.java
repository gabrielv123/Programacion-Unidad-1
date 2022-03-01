package evaluacion1;

import java.util.Scanner;

public class Doblenum {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce unh valor entero ");
		
		n = teclado.nextInt();
		
		System.out.println("el valor de la variable es " +n *2);
		
		teclado.close();
		
	

}
}