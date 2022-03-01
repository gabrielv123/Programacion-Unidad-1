package evaluacion1;

import java.util.Scanner;

public class Pitagora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z , x , y ;
		
		for (z=1; z<50;z++) {
			for (x=1; x<z;x++) {
				for (y=1; y<z;y++) {
					if (Math.pow(z ,2)==Math.pow(x, 2)+ Math.pow(y, 2)) {
						
						System.out.println(+z+ "  " +x+ "  " +y+ "  ");
						
					}
				}
			}
		}

	}

}
