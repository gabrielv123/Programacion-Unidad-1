package evaluacion1;

import java.util.Scanner;

public class Leerstringcompuesto {
	
	public static void main(String[] args) {

	
	String s;

	Scanner teclado;
	
	teclado = new Scanner(System.in);
	System.out.println("introduce unh valor entero ");
	
	s = teclado.nextLine();
	
	System.out.println("el valor de la variable es " +s);
	
	teclado.close();
}
}