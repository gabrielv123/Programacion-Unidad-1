package evaluacion1;

import java.util.Scanner;

public class Megabyte {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		double n , Mbytes , kbytes , bytes;
		

		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero ");
		n = teclado.nextInt();
		
		Mbytes = n /(1024*1024);
		
		kbytes= (n - (Mbytes * 1024 * 1024))/1024;
		
		bytes=n - (Mbytes * 1024 * 1024) - (kbytes * 1024) ;
		
		
		
		
		
		System.out.println( + Mbytes + " " + kbytes +  " " +bytes +" ");
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
