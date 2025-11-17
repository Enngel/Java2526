package tema2;
import java.util.Scanner;

public class EjercicioNumCuadrado {

	public static void main(String[] args) {
		// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
		//negativo.
		double dNum;
		Scanner scEntrada = new Scanner(System.in);
		do {
			System.out.print("Introduce un número: ");
			dNum = scEntrada.nextDouble();
			double dCuadrado = (dNum*dNum);
			if(dNum<0) {
				System.out.print("El número introducido es negativo.");
			}else System.out.println("Su cuadrado es: " + dCuadrado);
		}while (dNum>=0);
		
	}

}
