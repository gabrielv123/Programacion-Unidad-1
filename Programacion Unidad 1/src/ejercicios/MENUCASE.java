package evaluacion1;

import java.util.Scanner;

public class MENUCASE {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce un numero ");
		
		n = teclado.nextInt();
		
		switch(n) {
		
		case 1:
			
			System.out.println("valor 1 ");
			
			break;
		
		case 2:
		
			System.out.println("valor 2 ");
			
			break;
			
		case 3:
		
			System.out.println("valor 3 ");
			
			break;
		
		case 4:
		
			System.out.println("valor 4 ");
			
			break;
		
		case 5:
		
			System.out.println("valor 5 ");
			
			break;
		
		case 6:
		
			System.out.println("valor 6 ");
			
			break;
		
		case 7:
		
			System.out.println("valor 7 ");
			
			break;
		
		case 8:
		
			System.out.println("valor 8 ");
			
			break;
		
		case 9:
		
			System.out.println("valor 9 ");
			
			break;
		
		default:
			
			System.out.println("introduce un valor de 1-9");
			
		
		}

}
}
