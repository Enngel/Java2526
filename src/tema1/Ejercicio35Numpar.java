package tema1;
import java.util.Scanner;


public class Ejercicio35Numpar {

	public static void main(String[] args) {
/*Pide un numero y dime si es par*/
		double dNum;
		boolean bIsPar;
		
		
		System.out.print("Dime un número: ");
		
		Scanner scScanner = new Scanner(System.in);
		dNum = scScanner.nextDouble();
		scScanner.close();
		
		bIsPar = dNum%2 == 0;
		
		System.out.print("¿Tu número es par? -" + bIsPar);
		
	}

}
