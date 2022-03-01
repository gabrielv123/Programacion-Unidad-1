package evaluacion1;

import java.util.Scanner;

public class Primo100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r;
		
		for (r=0; r<=100; r++) {
		
			int contador=0;
			
			for(int n=1;n<=r;n++){
				if(r%n==0){
				contador++;
				}
			}
			if(contador==2){
				System.out.println(r);
			}
		}
		

	}
		}
		


