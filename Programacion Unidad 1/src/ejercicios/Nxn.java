package evaluacion1;

import java.util.Scanner;

public class Nxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce un numero ");
		
		n = teclado.nextInt();
		
		teclado.close();
		
		n=n*n;
		
		if(n>100) {
			
			n=n-100;
				
			System.out.println(+n);
		}
		
		else {
			
			n=100-n;
			
			System.out.println(" lo que falta es " + n );
		}
		
		

	}

}
