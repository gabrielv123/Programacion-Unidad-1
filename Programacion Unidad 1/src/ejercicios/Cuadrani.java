package evaluacion1;

import java.util.Scanner;

public class Cuadrani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n , f1 , c , n2, cont;

		System.out.println("Introduce un numero");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();

		n2=0;
		cont=0;

		for (f1 = n; f1 >0; f1--){

		for (c=1 ;c <=n; c++) {

		n2= c + cont;
		
		if(c>=f1)  {
			System.out.print(" " + c);
		}
		
		else {
			
		


		System.out.print(" 0");
		}
		}


		System.out.println("");
		cont++;

		}



		}
		}