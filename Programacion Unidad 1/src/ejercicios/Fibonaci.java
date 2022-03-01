package evaluacion1;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, f0, f1, fn, i;
		 Scanner teclado = new Scanner(System.in);
	        do{
	            System.out.print("Introduce numero mayor que 1: ");
	        	
				numero = teclado.nextInt();
	        }while(numero<=1);
	        teclado.close();
	        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

	        f0=0;
	        f1=1;
	        System.out.print(f0 + " ");
	        for(i=2;numero>=i;i++){
	            System.out.print(f1 + " ");
	            f1 = f0 + f1;
	            f0 = f1 - f0;
			
			
			
			
		
	}

}
}