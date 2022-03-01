package evaluacion1;

import java.util.Scanner;

public class Leerreal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double n;
	
	Scanner teclado;
	teclado = new Scanner(System.in);
	System.out.println("introduce unh valor entero ");
	
	n = teclado.nextDouble();

	System.out.println("el valor de la variable es " +n);
	
	teclado.close();


	

	}

}
