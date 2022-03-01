package evaluacion1;

import java.util.Scanner;

public class Leerentero {
	public static void main(String[] args) {

	int p;
	Scanner teclado;
	teclado = new Scanner(System.in);
	System.out.println("introduce unh valor entero ");
	
	p = teclado.nextInt();
	
	System.out.println("el valor de la variable es " +p);
	
	teclado.close();

	
	

}
}
