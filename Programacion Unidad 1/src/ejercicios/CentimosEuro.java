package evaluacion1;

import java.util.Scanner;

public class CentimosEuro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double e;
		int euros;
		double centimos;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("euro ");
		e = teclado.nextDouble();
		
		euros= (int)e;
		
		centimos=(int)((e - euros)*100);
		 
		System.out.println("euros : " + euros +  " centimos: " + centimos);
		
		teclado.close();
	}

}
