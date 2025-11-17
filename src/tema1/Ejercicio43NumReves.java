package tema1;
import java.util.*;
public class Ejercicio43NumReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * */
		System.out.println("Introduzca un número entre 0 y 99999: ");
		int iNum;
		Scanner scScanner = new Scanner(System.in);
		iNum = scScanner.nextInt();
		scScanner.close();
		
		int iUnidades = iNum%10;
		System.out.print("El número al revés es=  "+ iUnidades);
		iNum = iNum/10;
		iUnidades = iNum%10;
		System.out.print(iUnidades);
		iNum = iNum/10;
		iUnidades = iNum%10;
		System.out.print(iUnidades);
		iNum = iNum/10;
		iUnidades = iNum%10;
		System.out.print(iUnidades);
		iNum = iNum/10;
		iUnidades = iNum%10;
		System.out.print( iUnidades);
		
		
	}

}
