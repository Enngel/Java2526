package tema1;

import java.util.Scanner;

public class Ejercicio44MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int iNum == 1<2 ? 3:4;
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca el primer número: ");
		int iNum1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int iNum2 = sc.nextInt();
		sc.close();
		
		//Decir cuál es mayor
		int iMayor = iNum1<iNum2 ? iNum2:iNum1 ;
		int iMenor = iNum1<iNum2 ? iNum1:iNum2 ;
		System.out.println("El mayor es: " + iMayor);
		System.out.print("El menor es: " + iMenor);
		
	}

}
