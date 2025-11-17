package tema2;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Programa que va pidiendo números por pantalla
 * hasta que se introduzca el 0 y cuando termina
 * dice cual ha sido el mayor de todos
 * */
		
		int iNum,iMayor = Integer.MIN_VALUE;
		Scanner scEntrada = new Scanner(System.in);
	
		do {
			System.out.print("Dame un número: ");
			iNum = scEntrada.nextInt();
			if(iNum > iMayor) {
				iMayor = iNum;
			}
			
		}while(iNum !=0);
	
	scEntrada.close();
	System.out.println("El mayor fue: " + iMayor);
	}

}
