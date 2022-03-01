package evaluacion1;

import java.util.Scanner;

public class Articulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double articulo , descuento , total , codigo;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escriba el precio del articulo");
		articulo = teclado.nextDouble();
		

		
		System.out.println("escribe el codigo del articulo");
		codigo = teclado.nextDouble();
	
		
		teclado.close();
		
		

		
		if(articulo>100) {
				
			descuento= articulo*0.40;
			
			total= articulo - descuento;
			
			System.out.println("el total es" +total);
			
		}

		
		else if(articulo>25 && articulo <= 100) {
				
			descuento= articulo*0.20;
			
			total= articulo - descuento;
			
			
			System.out.println("el total es" +total);
			
		}
		
		else if (articulo>10 && articulo <= 25) {
			
			descuento= articulo*0.10;
			
			total= articulo - descuento;
			
			System.out.println("el total es" +total);
		
		}
		
		else if(articulo<=10) {
			
			System.out.println("el total es" +total);
		
		}
		
		
		
		
		else {
				
			}
		
		
		

	
	}
		
	

	}


