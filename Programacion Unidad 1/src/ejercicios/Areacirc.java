package evaluacion1;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double n , p;
	p= Math.PI;
	
	Scanner teclado;
	teclado = new Scanner(System.in);
	System.out.println("introduce el radio ");
	
	n = teclado.nextDouble();
	
	n=p*n*n;

	System.out.println("el area del radio" +n);
	
	teclado.close();

}
}