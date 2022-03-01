package evaluacion1;

import java.util.Scanner;

public class Triacowa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n , f1 , c , n2, cont;

		System.out.println("Introduce un numero");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();

		n2=0;
		cont=0;
		f1=n;
		c=1;

		while (f1>=0) {
			c=1;

		while (c<=n) {

		n2=c+cont;

		if (c <=f1){



		System.out.print(" " + n2);
		}
		c++;
		}


		System.out.println("");
		cont++;
		f1--;

		}

		}
		}
