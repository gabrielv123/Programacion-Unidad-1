package evaluacion1;

import java.util.Scanner;

public class Menudias {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	char n;
	
	Scanner teclado;
	teclado = new Scanner(System.in);
	System.out.println("introduce el dia");
	
	n = teclado.nextLine().charAt(0);
	
	switch(n) {
	
	case 'l':
		
		System.out.println("lunes ");
		
		break;
	
	case 'm':
		
		System.out.println("martes ");
		
		break;
		
	case 'x':
	
		System.out.println("miercoles ");
		
		break;
	
	case 'j':
	
		System.out.println("jueves ");
		
		break;
	
	case 'v':
	
		System.out.println("viernes");
		
		break;
	
	case 's':
	
		System.out.println("sabado");
		
		break;
	
	case 'd':
	
		System.out.println("domingo");
		
		break;
	
	default:
		
		System.out.println("introduce un dia de la semana");
		
	
	}

}
}
