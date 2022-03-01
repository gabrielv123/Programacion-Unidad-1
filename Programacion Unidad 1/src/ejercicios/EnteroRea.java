package evaluacion1;

import java.util.Scanner;

public class EnteroRea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n;
		int panteentera;
		double parterreal;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("n ");
		n = teclado.nextDouble();
		
		panteentera = (int)n;
		
		parterreal = n - panteentera;
		 
		System.out.println("parte entera : " + panteentera + "parte real " +parterreal);
		
		teclado.close();
	}

}
