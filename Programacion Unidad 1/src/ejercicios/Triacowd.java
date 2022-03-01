package evaluacion1;

import java.util.Scanner;

public class Triacowd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n , f1 , c , n2, cont;

		System.out.println("Introduce un numero");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();

		f1=1;
		n2=0;
		cont=0;
		c=n;

		while (f1<=n) {
			c=n;

				while (c>=f1) {

		

					n2= c - cont;
					
					c--;
			
			
					System.out.print(" " + n2);
			
			
					}
			
				System.out.println("");
				cont++;
				f1++;
			
				}
			
			
			
			}
			
		}