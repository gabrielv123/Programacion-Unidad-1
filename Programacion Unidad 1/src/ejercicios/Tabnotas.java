package evaluacion1;

import java.util.Scanner;

public class Tabnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double notas;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("escriba las notas del alumno");
		
		notas = teclado.nextDouble();
		teclado.close();

		
		if(notas>=0 && notas < 3) {
				
			System.out.printf("MD");
			
		}

		
		else if(notas>=3 && notas < 5) {
				
			System.out.printf("ins" );
			
		}
		
		else if(notas>=5 && notas < 6) {
			
			System.out.printf("suf" );
				
		}
		
		else if(notas>=6 && notas < 9) {
			
		System.out.printf("not" );
		}
		
		else if(notas>=9 && notas <= 10) {
			
			System.out.printf("sobre" );
		}
		
		else {
				
			}
		

			}
		}
	


