package evaluacion1;

import java.util.Scanner;

public class Mayormenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int b;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("introduce un numero ");
		n = teclado.nextInt();
		
		System.out.println("introduce un numero ");
		b = teclado.nextInt();
		
		teclado.close();
		
		if(n>b){
				
			System.out.println("el numero n es mayor que b");
		}
		
		else if (n<b){
			
		
			System.out.println("el numero n es menor que b" );
		
		
		}else if (n==b){
			
			System.out.println("los numeros son iguales");
		}
		
		else {
			
		}
	}
	


}