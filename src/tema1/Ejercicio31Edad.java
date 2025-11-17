package tema1;

import java.util.Scanner;

public class Ejercicio31Edad {

	public static void main(String[] args) {
/*Pide la edad al usuario y muestra la edad al año siguiente*/
		int iEdad;
		System.out.print("Dime tu edad: ");
		Scanner scEdad = new Scanner(System.in);
		
		iEdad = scEdad.nextInt();
		
		scEdad.close();
		
		iEdad++;
	
		System.out.print("El año que viene tendrás: " + iEdad);
	}

}
