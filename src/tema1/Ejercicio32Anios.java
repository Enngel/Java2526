package tema1;

import java.util.Scanner;

public class Ejercicio32Anios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Pide el año actual
		//Pide le año de nacimiento
		//Devuelve la edad el año que viene
		
		int iEdad;
		int iAnio;
		
		Scanner scScanner = new Scanner(System.in);
		System.out.print("Dime que año naciste: ");
		iEdad = scScanner.nextInt();
		System.out.print("Dime que año es: ");
		iAnio = scScanner.nextInt();
		scScanner.close();
		System.out.print("El año que viene tendrás: " + ((iAnio-iEdad)+1) );
		
		}

}
