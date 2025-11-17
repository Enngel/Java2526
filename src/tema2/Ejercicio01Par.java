package tema2;

import java.util.Scanner;

public class Ejercicio01Par{

	public static void main(String[] args) {
		
		Scanner scEntrada = new Scanner(System.in);
		int iNum;
		
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		scEntrada.close();

		//Comprobamos si el número es par:
		
		if (iNum%2 !=0) {
			System.out.print("No es par");
		}
		else {
			System.out.print("Es par");
		}
		
	}

}
