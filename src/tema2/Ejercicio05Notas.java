package tema2;

import java.util.Scanner;

public class Ejercicio05Notas{

	public static void main(String[] args) {
		
		Scanner scEntrada = new Scanner(System.in);
		int iNum, iNum2;
		
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		
/*Pide una nota númerica (0-10) y muestra la nota del boletín
 * */
	if(iNum < 5) {
		System.out.print("Suspenso");
	}else if (iNum <6) {
		System.out.print("Aprobado");
	}
	else if (iNum < 7) {
		System.out.print("Bien");
	}else if(iNum < 9) {
		System.out.print("Notable");
	}else if (iNum >= 9 && iNum <11) {
		System.out.print("Sobresaliente");
	}else {
		System.out.print("Alguno de los datos introducidos es erróneo...");
	}
	
	/* 
	 * */
	
	
	}
		
		
		
	}


