package tema2;
import java.util.Scanner;
public class ContadorDeNumeros {

	public static void main(String[] args) {
		// Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
		Scanner scEntrada = new Scanner(System.in);
		double dNum;
		int contador=0;
		do {
			System.out.print("Introduce un número: ");
			dNum = scEntrada.nextDouble();
			contador++;
		}while(dNum>=0);
		System.out.print("El total de números introducidos es: " + (contador-1));
	}

}
