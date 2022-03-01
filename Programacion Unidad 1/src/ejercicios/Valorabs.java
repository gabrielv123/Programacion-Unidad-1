package evaluacion1;

import java.util.Scanner;

public class Valorabs {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int r;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce unh valor entero ");
		
		n = teclado.nextInt();
		
		if(n>=0) {
			
			r=n;
			
			
			System.out.println("su valor absoluto es  " +n);
		}
		
		else {
			r =-n;
			
			System.out.println("su valor absoluto es  " +r);
		}
		
		teclado.close();

	}

}
