package evaluacion1;

import java.util.Scanner;

public class Mayor3n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 , n2 , n3;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe n1");
		n1 = teclado.nextInt();
		
		System.out.println("escribe n2");
		n2 = teclado.nextInt();
		
		System.out.println("escribe n3");
		n3 = teclado.nextInt();
		
		
		teclado.close();

		
		if(n1>n2 && n1>n3) {
				
			System.out.printf("el numero mayor "+n1);
		}
			
		else if (n1==n2 && n2>n3 && n1>n3) {
			
			System.out.printf("los numero mayores es  "+n1+ " y " +n2);
		}
		
		
		else if (n2>n1 && n2>n3) {
			
			System.out.printf("el numero mayor es " +n2);
			
		}
		
		else if (n2==n3 && n2>n1 && n3>n1) {
				
		System.out.printf("los numero mayores es  "+n2+ " y " +n3);
				
		}
			
		else if (n3>n1 && n3>n2) {
			
		System.out.printf("el numero mayor es " +n3); 
		
		}

		else if (n1==n3 && n1>n2 && n3>n2) {
			
			System.out.printf("los numero mayores es  "+n1+ " y " +n3);
	}

		else if (n1==n2 && n1==n3)
			
			System.out.printf("los tres numero son iguales ");
			

}}
