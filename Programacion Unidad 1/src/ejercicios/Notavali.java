package evaluacion1;

import java.util.Scanner;

public class Notavali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("escriba cuanto vale el articulo");
		
		nota = teclado.nextDouble();
		teclado.close();

		if (nota>=0 && nota<=10) {
		
		System.out.printf("es una nota valida y es " +nota);
		}
		
		else {
			
			System.out.printf("es una nota valida y es " +nota);
		}
}
}
