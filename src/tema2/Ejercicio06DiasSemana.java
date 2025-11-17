package tema2;

import java.util.Scanner;

public class Ejercicio06DiasSemana{

	public static void main(String[] args) {
		
		Scanner scEntrada = new Scanner(System.in);
		int iNum, iNum2;
		
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		
/*Pide una nota númerica (0-10) y muestra la nota del boletín
 * */
	if (iNum == 1) {
		System.out.print("Es Lunes");
	}else if (iNum == 2) {
		System.out.print("Es Martes");

	}else if (iNum == 3) {
		System.out.print("Es Miércoles");

	}else if (iNum == 4) {
		System.out.print("Es Jueves");

	}else if (iNum == 5) {
		System.out.print("Es Viernes");

	}else if (iNum == 6) {
		System.out.print("Es Sábado");

	}else if (iNum == 7) {
		System.out.print("Es Domingo");

	}else if (iNum <1 || iNum >7) {
		System.out.print("El valor introducido es erróneo.");
	}
	
	/* 
	 * */
	
	
	}
		
		
		
	}


