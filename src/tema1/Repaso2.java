package tema1;
import java.util.Scanner;
public class Repaso2 {

	public static void main(String[] args) {
		// Escribe un progrma en java que reciba un numero entero y positivo
		// y calcule la suma de todos sus digitos
		
		int x;
		Scanner scEntrada = new Scanner(System.in);
		System.out.println("Escribe un número de MAXIMO 5 dígitos: ");
		x = scEntrada.nextInt();
		scEntrada.close();
		
		double dResto;
		dResto = x%10;
		double dResult = dResto;
		dResto = x%10;
		dResult=+dResto;
		dResto = x%10;
		dResult =+ dResto;
		dResto = x%10;
		dResult =+ dResto;
		dResto = x%10;
		dResult =+ dResto;
		System.out.print("La suma de los dígitos es: " + (int)dResult);
	}

}
