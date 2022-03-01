package evaluacion1;

import java.util.Scanner;

public class Retesuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sueldo, i;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("sueldo");
		
		sueldo = teclado.nextDouble();
		teclado.close();

		
		if(sueldo<1000) {
			
			i=sueldo*0.10;
				
			System.out.printf("la cantidad es " +sueldo + " es %.2f ", i);
			
		}

		
		else if   (sueldo == 1000) {
			
			i=sueldo*0.12;
			
			System.out.printf(" la cantidad es " + sueldo + " es %.2f ", i );
			
		}
		
		else if(sueldo>1000){
				
				i=sueldo*0.16;
				
				System.out.printf(" la cantidad es " + sueldo + " es %.2f ", i );
				
		}
		else {
					
				}
		
		
	}
	

}
