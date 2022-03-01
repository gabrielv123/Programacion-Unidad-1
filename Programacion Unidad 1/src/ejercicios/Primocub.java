package evaluacion1;

import java.util.Scanner;

public class Primocub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n , cubo , p = 0 , r;

		boolean esprimo = false;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
		while (n>=0) {
			if ((n%2)==0) {
				
				cubo= n*n*n;
				
				System.out.println("el valor del cubo es " + cubo);
			}
		
			else {
				esprimo = true;
				p=3;
			}
		
		while (p<n) {
			r= n % p;
			if (r ==0) {
			esprimo = false;
			break;
		
			}
			p=p+1;
		}
			
			if (esprimo == true) {
					
					System.out.println("es primo");
				}
				else {
					System.out.println("no es primo");
				}
			System.out.println("introdu<ca un valor entero");
			n = teclado.nextInt();
	}
	}
	
	}
	
		
	

	

