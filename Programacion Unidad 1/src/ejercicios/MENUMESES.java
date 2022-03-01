package evaluacion1;

import java.util.Scanner;

public class MENUMESES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		System.out.println("menu");
		
		System.out.println("-------------");
		System.out.println("mes 1");
		System.out.println("mes 2");
		System.out.println("mes 3");
		System.out.println("mes 4");
		System.out.println("mes 5");
		System.out.println("mes 6");
		System.out.println("mes 7");
		System.out.println("mes 8");
		System.out.println("mes 9");
		System.out.println("mes 10");
		System.out.println("mes 11");
		System.out.println("mes 12");
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce el mes");
		
		n = teclado.nextInt();
		
		switch(n) {
		
		case 1:
			
			System.out.println("enero");
			
			break;
		
		case 2:
			
			System.out.println("febrero ");
			
			break;
			
		case 3:
		
			System.out.println("marzo");
			
			break;
		
		case 4:
		
			System.out.println("abril");
			
			break;
		
		case 5:
		
			System.out.println("mayo");
			
			break;
		
		case 6:
		
			System.out.println("junio");
			
			break;
			
		case 7:
			
			System.out.println("julio");
			
			break;
		
		case 8:
		
			System.out.println("agosto");
			
			break;
			
		case 9:
			
			System.out.println("septiembre");
			
			break;
			
		case 10:
			
			System.out.println("octubre");
			
			break;
			
		case 11:
			
			System.out.println("noviembre");
			
			break;
			
		case 12:
			
			System.out.println("diciembre");
			
			break;
			
		
		
		default:
			
			System.out.println("introduce un mes del año");
			
		
		}

	}
	}



