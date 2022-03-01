package evaluacion1;

import java.util.Scanner;

public class Numprimoimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n , r , p;
		
		boolean esprimo;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
		r = n%2;
		if (r == 0) {
		esprimo= true;
		}
		
		else {
			esprimo=true;
			p=3;
			while (p<n) {
			esprimo=false;
			break;
		}
		p=p+3;
		}
			
			
			if (esprimo) {
					
					System.out.println("es primo");
				}
				else {
					System.out.println("no es primo");
				}
			
			}
		}
	


