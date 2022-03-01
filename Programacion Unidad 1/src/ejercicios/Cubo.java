package evaluacion1;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double i;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("introduce la cantidad ");
		i = teclado.nextDouble();
		
		i=i*i*i;
		
		System.out.println("el area del cubo es "+i);
		
		teclado.close();
	}

}
