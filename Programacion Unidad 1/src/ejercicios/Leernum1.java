package evaluacion1;

import java.util.Scanner;

public class Leernum1 {
	
	public static void main(String[] args) {
	
	int n;
	
	Scanner teclado;
	teclado = new Scanner(System.in);
	System.out.println("introduce unh valor entero ");
	
	n = teclado.nextInt();
	n= n+1;
	
	System.out.println("el valor de la variable es " +n);
	
	teclado.close();

	
	

}
}