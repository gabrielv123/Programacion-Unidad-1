package evaluacion1;

import java.util.Scanner;

public class Numprimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n , r , p;
		
		boolean esprimo;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
		
		esprimo= true;
		p= 2;
		while (p<n) {
			r= n % p;
			if (r ==0) {
			esprimo = false;
			break;
		
			}
			
			p=p+1;
			
			if (esprimo) {
					
					System.out.println("es primo");
				}
				else {
					System.out.println("no es primo");
				}
			
			}
		}
	}


