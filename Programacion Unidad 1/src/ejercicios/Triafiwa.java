package evaluacion1;

import java.util.Scanner;

public class Triafiwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n , f , f2 ,  columna;
		
		n=5;
		
		f2 = n;
		f = 1;
		
		
		while (f <= f2) {
			columna=1;
			while (columna<=f) {
				System.out.print(f);
				System.out.print("\t");
				
				columna++;
			}
			
			System.out.print("\n");
			f++;
			
			
			
		}

	}

}
