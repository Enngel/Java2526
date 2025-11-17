package tema2;

import java.util.Scanner;

public class Ejercicio06DiasSemanaSWITCH{

	public static void main(String[] args) {
		
		Scanner scEntrada = new Scanner(System.in);
		int iNum, iNum2;
		
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		
/*Pide una nota númerica (0-10) y muestra la nota del boletín
 * */
switch(iNum) {
case 1: System.out.print("Lunes"); break;
case 2: System.out.print("Martes"); break;
case 3: System.out.print("Miercoles"); break;
case 4: System.out.print("Jueves"); break;
case 5: System.out.print("Viernes"); break;
case 6: System.out.print("Sábado"); break;
case 7: System.out.print("Domingo"); break;

default: System.out.print(" ? ? ? ");
}
	
	/* 
	 * */
	
	
	}
		
		
		
	}


