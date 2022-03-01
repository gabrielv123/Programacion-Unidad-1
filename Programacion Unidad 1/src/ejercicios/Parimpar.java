package evaluacion1;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce un numero ");
		
		n = teclado.nextInt();
		
		if(n%2==0) {
				
			System.out.println("el numero es par  ");
		}
		
		else {
			
			System.out.println(" el numero es impar " );
		}
		
		teclado.close();

	}

}
