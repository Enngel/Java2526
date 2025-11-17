package EjerciciosOCTUBRE;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExaT2EngelNieves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scEntrada = new Scanner(System.in);
		int iEleccion=0;
		
		//Imprime el menú por pantalla
		imprimirMenu();
	
		//Mientras el usuario no ingrese "3", el programa seguirá
		do {
			//Evalua la eleccion del usuario
			try {
			iEleccion=scEntrada.nextInt();
			}catch(InputMismatchException ime) {
				System.out.println("Entrada errónea. ");
				scEntrada.next();
			}
			evaluarEleccion(iEleccion);
	
			if(iEleccion == 3) {
				System.out.println("Saliendo del programa...");
				System.out.println("Programa del alumno Engel Nieves Pineda finalizado.");
			}else {
				System.out.println(); 
				System.out.println();
				imprimirMenu();
			}
			
		}while(iEleccion !=3);
		
		
		scEntrada.close();
		
		
	}
	private static void evaluarEleccion(int eleccion) {
	
		switch(eleccion) {
			//Escribre los pares del 2 al 20
		case 1:
			System.out.println("Ha seleccionado la opción 1");
			for(int j = 1; j <21 ; j++) {
				if(j%2 == 0) {
					System.out.print(j + " ");
				}
				
			}
			break;
			//Escribe impares del 21 al 1
		case 2:
			System.out.println("Ha seleccionado la opción 2");
			int i = 21;
			while( i >= 1 ) {
				if(i % 2 != 0) {
					System.out.print(i + " ");
				}
			i--;
			}
			break;
		}
	}
	//Funcion uqe escribe el menú por pantalla
	public static void imprimirMenu() {
	System.out.println("1.Opción 1. Usando el bucle for pinta los "
			+ "números pares del 2 al 20");	
	System.out.println("2.Opción 2. Usando while pinta los impares del 21 al 1 en orden"
			+ " decreciente.");
	System.out.println("3.Salir");
	System.out.print("Ingrese su opción: ");
	}
}
