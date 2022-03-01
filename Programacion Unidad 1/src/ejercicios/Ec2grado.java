package evaluacion1;

import java.util.Scanner;

public class Ec2grado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		double a , b , c , d , x1 , x2;
		
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("escribe el valor de a ");
		
		
		a = teclado.nextDouble();
		
		System.out.println("escribe el valor de b ");
		b = teclado.nextDouble();
		
		System.out.println("escribe el valor de c ");
		c = teclado.nextDouble();
		
		
		
		teclado.close();
	
		d= ((b*b)- (4*a*c));

		if(d<0) {
			
			System.out.printf("raices compleja" + d);
		}
		
		else if (d==0)  {
				
			x2= x1= (-b/2*a);
			
			Math.sqrt(d);
			
			System.out.printf(" x1 = "+ x1 + " x2= " +x2);
			}
		else {
			x1 = (-b + Math.sqrt(d))/(2*a);
			x2 = (-b - Math.sqrt(d))/(2*a);	
			
			System.out.printf(" x1 =" + x1 + " x2= " +x2);
		}

}
}
