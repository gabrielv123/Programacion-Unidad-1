package evaluacion1;

import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n , cifras , cociente;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
		
		cifras = n %10;
		
		System.out.println(cifras+ "  ");
		
		cociente= n /10;
		
		
		while (cociente > 10) {
		
		
		cifras = cociente %10;
		
		System.out.println(cifras+ "  ");
		
		
		cociente = cociente / 10;
		
		}


	}

}
