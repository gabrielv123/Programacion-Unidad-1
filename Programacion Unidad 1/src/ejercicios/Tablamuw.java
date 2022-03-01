package evaluacion1;

import java.util.Scanner;


public class Tablamuw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
		while (n>=0) {
			
			
	
		
		for (int r=1 , p=1; p <=10 && p >=0; r= n*p ){
			
			p=p+1;
			
			System.out.println(n + " x " + p + " = " + r);
		}
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
			
		}
		
		System.out.println("no ");
		teclado.close();
	}
	}


