package evaluacion1;

import java.util.Scanner;

public class Rangosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 , n2 , suma , p;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n1 = teclado.nextInt();
		
		System.out.println("escribe un numero ");
		n2 = teclado.nextInt();
		
		suma = 0;
		p= n1;
		
		while (p<=n2) {
			suma =suma + p;
			p = p +1;
		}
		System.out.println("suma = " +suma);
	}



		
	}


