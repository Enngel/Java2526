package tema1;

import java.util.Scanner;

public class Ejercicio34CirculoCircumferencia {

	public static void main(String[] args) {
		double dRadio;
		System.out.print("Dime el rádio de tu círculo: ");
		Scanner scScanner = new Scanner(System.in);
		dRadio = scScanner.nextDouble();
		scScanner.close();
		System.out.print("El área es: " + ((Math.PI)*(dRadio*dRadio))  
				+ " y la longitud es: " + (2*Math.PI*dRadio)  );
		
		
	}

}
