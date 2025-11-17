package tema2;

import java.util.Scanner;

public class Ejercicio04Ordenar{

	public static void main(String[] args) {
		
		Scanner scEntrada = new Scanner(System.in);
		int iNum, iNum2;
		
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		System.out.print("Introduce otro número: ");
		iNum2 = scEntrada.nextInt();
		scEntrada.close();
		//Comprobamos si el número es par:
		
		if (iNum > iNum2) {
			System.out.print(iNum +" Es mayor que "+iNum2);
		}
		else if (iNum == iNum2) {
			System.out.print("Son iguales");
		} else {
			System.out.print(iNum2 +" Es mayor que "+iNum);
		}
		
		
		
	}

}
