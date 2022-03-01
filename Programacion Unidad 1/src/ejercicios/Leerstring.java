package evaluacion1;

import java.util.Scanner;

public class Leerstring {
	
	public static void main(String[] args) {
	
	String s;
	Scanner teclado;
	teclado = new Scanner(System.in);
	
	
	System.out.println("introduce string ");
	s = teclado.next();
	System.out.println("el valor de la variable es " +s);
	
	teclado.close();
	

}
}