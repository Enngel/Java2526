package buclesAnidados;

import java.util.Scanner;

public class EjerciciosPrimos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		Scanner scEntrada = new Scanner(System.in);	
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		scEntrada.close();
		esPrimo(iNum);
		System.out.print(iNum +" es --->" + (esPrimo(iNum) ? " PRIMO" : " COMPUESTO"));

	}
	
	
	
	public static boolean esPrimo(int iNum) {
	boolean isPrimo=true;
	int i = 2;
	while(i<Math.sqrt(iNum) && isPrimo){
		if(iNum % i ==0) {
			isPrimo = false;
		}
		i++;
	}
	return isPrimo;
}
}
