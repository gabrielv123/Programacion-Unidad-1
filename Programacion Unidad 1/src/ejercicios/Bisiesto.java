package evaluacion1;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int año;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("escribe el año");
		
		año = teclado.nextInt();
		teclado.close();

		
		if(año%4==0 && año%100!=0 || año%400==0) {
				
			System.out.printf("es viciesto");
		}
		
		else {
				
			System.out.printf(" no es viciesto");

			}
		
	}}