package evaluacion1;

import java.util.Scanner;

public class MenuString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String usuario , palabraI ,  palabra1 , palabra2 , palabra3 ,  palabra4 ;
		int cantidad;
		 int opcion = 0;

		 Scanner teclado = new Scanner(System.in);

		 System.out.println(" introduce tu usuario: ");
		 usuario= teclado.nextLine();
		 
		 System.out.println(" Hola " + usuario);
		

		 while (opcion==opcion) {
		 System.out.println("que opcion deseas ");
		 System.out.println("----------------------------------------");
		 System.out.println("opcion 1: dar la vuelta a la palabra ");
		 System.out.println("opcion 2: comparar dos palabras ");
		 System.out.println("opcion 3: numero de letras ");
		 System.out.println("opcion 4: repetir palabras ");
		 System.out.println("opcion 5: Repetir palabra (Mayúscula / Minúscula)");
		 System.out.println("opcion 6: Salir del programa :)");
		 opcion = teclado.nextInt();
		 
		 switch (opcion) {


		 case 1: {
			 
			 System.out.println(" introduce una palabra: ");
			 palabraI= teclado.next();
			 
			 StringBuilder builder=new StringBuilder(palabraI);
			 String vuelta=builder.reverse().toString();
			 
			 
			 
			 System.out.println(" la palabra que escribiste alrevez es: " +vuelta);
		
			 
			 
		 break;
		 
		 
		 }

		 case 2: {

			 System.out.println(" introduce la primera palabra: ");
			 palabra1= teclado.next();
			 
			 System.out.println(" introduce la segunda palabra: ");
			 palabra2= teclado.next();
			 
			 if (palabra1.equals(palabra2)) {
				 
				 System.out.println(" Son iguales ");
			 }
		
			 else {
				 System.out.println(" No son iguales ");
			 }
			 
			 break;
		 }
		 
		 case 3: {
			 
			
			 System.out.println(" introduce una palabra: ");
			 palabra3= teclado.next();
			 
			 
			 cantidad = palabra3.length();
			 
			 System.out.println(" el numero de palabras es: " +cantidad);
			
				 
				 if (cantidad>7) {
					 
					 System.out.println("es una palabra grande");
		 }
				 else {
					 
					 System.out.println("es una palabra pequeña");
				 }
				 
				 break;
			 
		 }
		 
		 case 4: {
			 
			 System.out.println(" introduce una palabra palabra: ");
			 palabra4= teclado.next();
			 
			 palabra4= palabra4.toUpperCase();
			 
			 cantidad=0;
			 
			 System.out.println(" cuantas veces la reproduzco: ");
			 cantidad= teclado.nextInt();
			 
			 for (int veces=0; veces < cantidad;veces++) {
				
				 System.out.print(palabra4 +" ");
			 }
			 
			 break;
		 }
		 
		 case 5: {
			 
			 String m;
			 
			 System.out.println("Inserta la palabra que quieras repetir.");
				palabra4 = teclado.next();
				
			 System.out.println("¿Mayuscula o minuscula? (Escribe M o m) ");
				m = teclado.next();
				
				while (!m.equalsIgnoreCase("m")) {
					System.out.println("introduzca M o m: ");
					m = teclado.next();
				}
				
				System.out.println("Cuantas veces la quieres repetir?");
				cantidad = teclado.nextInt();
				
				while (cantidad >= 6) {
					
					System.out.println("No se puede repetir mas de 6 veces");
					System.out.println("Cuantas veces la quieres repetir?");
					cantidad = teclado.nextInt();
				}
				
				String total = null;
				
				if (m.equals("m")) {
					total = palabra4.toLowerCase();	
				} 
				
				else {
					total = palabra4.toUpperCase();
				}
				
				for (int veces = 0;veces < cantidad; veces++) {
					System.out.println(total + " ");
				}
				
			 break;
		 }
				 
			 
		 default:

		 System.out.println("Opcion invalida, introduzca otra");

		 break;

		 case 6: {
			 
			 teclado.close();
				System.out.println("programa cerrado gracias :)");
				System.exit(0);
					 
				

		 }
		 }
		
	}
}
}



		
	