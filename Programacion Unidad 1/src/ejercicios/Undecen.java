package evaluacion1;

import java.util.Scanner;

public class Undecen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n , decenas , centenas , unidad;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe n1");
		n = teclado.nextInt();
		
		teclado.close();
		
		if (n<=1000 && n>=0);
		
	
		centenas=n;
		decenas=n/10;
		unidad=n/100;
		
		System.out.println(" numero: " +n);
		System.out.println(" unidad: " +unidad);
		System.out.println(" docena: " +decenas);
		System.out.println(" centenas: " +centenas);
		}
	
		
	
	
	}


