package evaluacion1;

import java.util.Scanner;

public class Cuadranu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un numero");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		teclado.close();
		int z = 0;
		int cont = 0;
		for (int pos = n; pos > 0;pos--) {
			
			
			for (int posi = 1; posi <= n; posi++) {
				
				z = posi + cont;
				if (posi <= pos) {
					System.out.print(" " + z);
				} else {
					System.out.print(" 0");
				}
				
				
			}
			System.out.println("");
			cont++;
		}
	}


	}