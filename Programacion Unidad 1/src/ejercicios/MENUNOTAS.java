package evaluacion1;

import java.util.Scanner;

public class MENUNOTAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double notas;
		int notae;
		
		System.out.println("menu");
		
		System.out.println("-------------");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("introduce la nota ");
		
		notas = teclado.nextInt();
		
		notae= (int)notas;
		
	
		switch(notae) {
		
		case 0:
		case 1:
		case 2:
		
			System.out.println("md");
			
			break;
			
		case 3:
		case 4:
		
			System.out.println("ins");
			
			break;
		
		case 5:
			
			System.out.println("suf");
			
			break;
		
		case 6:
		
			System.out.println("bien");
			
			break;
			
		case 7:
		case 8:
		
			System.out.println("not");
			
			break;
			
		case 9:
		case 10:
			
			System.out.println("sobre");
			
			break;
		
		default:
			
			System.out.println("introduce una nota bien");
			
		
		}

	}
	}



