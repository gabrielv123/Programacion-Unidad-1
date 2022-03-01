package evaluacion1;

import java.util.Scanner;

public class Leercaracter {
public static void main(String[] args) {
	
	char C;
	
	Scanner teclado;
	teclado = new Scanner(System.in);
	
	
	System.out.println("introduce string ");
	C = teclado.nextLine().charAt(0);
	System.out.println("el valor de la variable es " +C);
	
	teclado.close();

}
}