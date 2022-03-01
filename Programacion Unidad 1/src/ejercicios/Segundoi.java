package evaluacion1;

import java.util.Scanner;

public class Segundoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora;
		int minuto;
		int segundo;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("introduce la hora ");
		hora = teclado.nextInt();
		
		System.out.println("introduce los minutos ");
		minuto = teclado.nextInt();
		
		System.out.println("introduce los segundo ");
		segundo = teclado.nextInt();
		
		teclado.close();
		
		if(segundo>59){
				
		segundo=0;
		minuto= minuto+1;
		
		System.out.println(" la hora es " +hora + " H " +minuto+ " M " +segundo );
		}
		
		else if (minuto>59){
			
			minuto=0;
			hora= hora +1;
			
		
			System.out.println(" la hora es " +hora + " H " +minuto+ " M " +segundo );
		}
		
		else if (hora==24){
			
			hora=0;
			
			System.out.println(" la hora es " +hora + " H " +minuto+ " M " +segundo );
		}
		
		
		else {
			
			System.out.println(" la hora es " +hora + " H " +minuto+ " M " +segundo );
			
		}
	}
	}

