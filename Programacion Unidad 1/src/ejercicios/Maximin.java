package evaluacion1;

import java.util.Scanner;

public class Maximin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n , max , min;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
	
		if (n >=0) {
		max = n;
		min = n;
	
		while  ( n >= 0) {
			
			if ( n > max) {
				max = n;
				
			}
			
			if ((n <min) && (n >= 0)) {
				min = n;
			}
			System.out.println("escribe un numero ");
			n = teclado.nextInt();
		}
		System.out.println(+max+ "  " +min);
		
		}
	
		
		
		}
}
		
	
		
	
		
			
	

