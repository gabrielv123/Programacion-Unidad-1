package evaluacion1;

import java.util.Scanner;

public class EXPENDEDOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo;
		
		double precio = 0.0;
		
		int e2, e1, c50, c20, c10, c5 , c2 , c1;
		int opcion ;
		
		int cambio;
		
		int producto;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("introduce tu dinero");
		
		saldo= teclado.nextDouble();
		
		System.out.println("menu");
		
		System.out.println("-------------");
		System.out.println(" 1- agua: 0.36 ");
		System.out.println(" 2- cafe: 0.43 ");
		System.out.println(" 3- refresco: 1.11 ");
		
		System.out.println("introduce una opcion");
		opcion= teclado.nextInt();
		
		teclado.close();
		
		
		if (opcion >=1 && opcion <=3){
		
		switch(opcion){
		
		case 1:
			
			precio = 0.4300;
			
			break;
			
		case 2: 
			
			precio = 1.1100;
		
			break;
			
		case 3:
			
			precio= 0.3600;
			
			break;
		}
		
			if(saldo >= precio) {
				System.out.println("su producto. gracias");
				saldo =(saldo - precio);
			}
			
			else {
				System.out.println("saldo insuficiente");
			}
			}
		
		
			else {
				System.out.println("opcion incorrecta");
			}
	
		if (saldo > 0.0) {
			
			cambio=(int)Math.round(saldo*100);
			
			e2= cambio /200;
			cambio = cambio - (e2 * 200);
					
			e1= cambio /100;
			cambio = cambio - (e1 * 100);
					
			c50= cambio /50;
			cambio = cambio - (c50 * 50);
					
			c20= cambio /20;
			cambio = cambio - (c20 * 20);
			
			c10= cambio /10;
			cambio = cambio - (c10 * 10);
					
			c5= cambio /5;
			cambio = cambio - (c5 * 5);
			
			c2= cambio /2;
			cambio = cambio - (c2 * 2);
			
			c1= cambio /1;
			cambio = cambio - (c1 * 1);
			
		
		
		System.out.println(+e2);
		System.out.println(+e1);
		System.out.println(+c50);
		System.out.println(+c20);
		System.out.println(+c10);
		System.out.println(+c5);
		System.out.println(+c2);
		System.out.println(+c1);
		System.out.println();
		
		}
		
	}
		
}		
		
	


		
			
			
		
		
	
	


