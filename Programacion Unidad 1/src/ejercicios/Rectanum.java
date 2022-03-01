package evaluacion1;

import java.util.Scanner;

public class Rectanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un numero");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		teclado.close();
		
		
		int n2 = 0;
		if (n % 2 == 0) {
			n2 = (n/2) + 1;
		} else {
			n2 = (n/2) + 2; 
		}
		
		
		
		int cont = 0;
		
		for (int f = n; f> 0 && cont < n2 - 1; f--) {
			
			for (int c = 1; c <= n; c++) {
				
			
				
					if (c > cont && c <= (n - cont)) {
						System.out.print(" " + c);
					} else {
							System.out.print(" 0" );
							
						
					} 
				
				
			}
			System.out.println("");
			cont++;
		}
		
		cont = n2 - 1;
		for (int f = 1; f< (n2 +1) ; f++) {
			
			
			for (int c = 1; c <= n ; c++) {
				
			
				
					if (c > cont && c <= (n - cont)) {
						System.out.print(" " + c);
					} else {
							System.out.print(" 0" );
							
						
					} 
				
				
			}
			System.out.println("");
			cont--;
		}
		
		
		
		
		
	}

}