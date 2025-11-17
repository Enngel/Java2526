package tema2;
import java.util.Scanner;
public class MediaNumeros {

	public static void main(String[] args) {
		// Pedir números hasta que se introduzca uno negativo, y calcular la media.
		Scanner scEntrada = new Scanner(System.in);
		double dNum;
		double dSum=0,dMedia=0;
		int iTotal=0;
		do {
			System.out.print("Introduce un número: ");
			dNum= scEntrada.nextDouble();
			if(dNum>=0) {
			iTotal++;
			dSum+=dNum;
			dMedia=dSum/iTotal;
			}
		}while(dNum>=0);
System.out.println("La media de los números introducidos es: " + dMedia + "\nEl total de numeros introducidos fue: " + iTotal);
	}

}
