package evaluacion1;

import java.util.Scanner;

public class Estructurasrepetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String usuario , contraseña , alumno;
		 double notas , notas55 , notas15 , notas30 , examen1 , examen2 , examen3 , ultimoexamen, trabajo;
		 int opcion = 0;

		 Scanner teclado = new Scanner(System.in);

		 System.out.println(" introduce tu usuario: ");
		 usuario= teclado.nextLine();

		 System.out.println(" introduce tu contraseña: ");
		 contraseña= teclado.nextLine();

		 while (contraseña.contains("e") || contraseña.contains("E")){
		 System.out.println(" error introduce una contraseña que no tenga e o E");
		 contraseña= teclado.nextLine();
		 }


		 while (opcion==opcion) {
		 System.out.println("que opcion deseas ");
		 System.out.println("opcion 1: introduce notas ");
		 System.out.println("opcion 2: salir del programa :) ");
		 opcion = teclado.nextInt();
		


		 switch (opcion) {


		 case 1: {
			 
		 System.out.println(" introduce el alumno: ");
		alumno= teclado.next();


		 System.out.println(" introduce las notas del primer examen: ");
		 examen1= teclado.nextInt();

		 while (examen1<0 || examen1>10){

		 System.out.println(" error introduce una nota positiva o menor a 10: ");
		 examen1= teclado.nextDouble();
		 }


		 System.out.println(" introduce las notas del segundo examen: ");
		 examen2= teclado.nextDouble();

		 while (examen2<0 || examen2>10){

		 System.out.println(" error introduce una nota positiva o menor a 10: ");
		 examen2= teclado.nextDouble();
		 }



		 System.out.println(" introduce las notas del tercer examen: ");
		 examen3= teclado.nextDouble();

		 while (examen3<0 || examen3>10){

		 System.out.println(" error introduce una nota positiva o menor a 10: ");
		 examen3= teclado.nextDouble();
		 }



		 System.out.println(" introduce las notas del ultimo examen: ");
		 ultimoexamen= teclado.nextDouble();

		 while (ultimoexamen<0 || ultimoexamen>10){

		 System.out.println(" error introduce una nota positiva o menor a 10: ");
		 ultimoexamen= teclado.nextDouble();

		 }

		 System.out.println(" introduce las notas del trabajo: ");
		 trabajo= teclado.nextDouble();

		 while (trabajo<0 || trabajo>10){

		 System.out.println(" error introduce una nota positiva o menor a 10: ");
		 trabajo= teclado.nextDouble();
		 }



		 notas55=((examen1+examen2+examen3)/3);
		 double promedio55 = notas55*0.55;

		 notas30=(ultimoexamen);
		 double promedio30 = notas30*0.30;

		 notas15=(trabajo);
		 double promedio15 = notas15*0.15;


		 notas=promedio55+promedio30+promedio15;
		 
		 double n;
			
			n = ( notas % 10 ) * 10;
			n = Math.round(n);
			
			notas = ( notas - (notas % 10) ) + (n / 10);
			
			



		 if (notas==0 || notas <4.9) {
		 System.out.println(" las notas del alumno " +alumno+ " es suspenso " +notas);
		 }

		 else if (notas==5 || notas <5.9) {
		 System.out.println(" las notas del alumno " +alumno+ " es suficiente " +notas);
		 }

		 else if (notas==6 || notas <6.9) {
		 System.out.println(" las notas del alumno " +alumno+ " es bien " +notas);
		 }

		 else if (notas==7 || notas <8.9) {
		 System.out.println(" las notas del alumno " +alumno+ " es notable " +notas);
		 }

		 else if (notas>=9 || notas ==10) {
		 System.out.println(" las notas del alumno " +alumno+ " es sobresaliente " +notas);
		 }
		 
	
		 break;
		 }

		 case 2: {

		 System.out.println("programa cerrado gracias :)");
		 System.exit(0);
		 }

		 default:

		 System.out.println("Opcion invalida, introduzca otra");

		 break;


		 }
		 }
		teclado.close();
	}

}


