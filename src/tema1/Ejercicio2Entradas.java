package tema1;

/*Para importar librerias la de scanner 
 * es para poder leer, como en pseint, 
 * la clase scanner 
 * pertenece al paquete java.util así que importamos desde ahí*/
import java.util.Scanner;

public class Ejercicio2Entradas {
	
	public static void main(String[] args) {
		//Pide un número y lo muestra;
		
		int iNum;
		System.out.print("Escribe un número del 1 al 10: ");
		//Para leer del flujo/canal de entrada hay que declarar
		//Que usaremos un nuevo Scanner de entrada
		
		Scanner scEntrada = new Scanner(System.in);
		iNum = scEntrada.nextInt();
		//MUY IMPORTANTE cerrar el canal de entrada al terminar
		scEntrada.close();
		//MUY IMPORTANTE cerrar el canal de entrada al terminar
		System.out.println("El número leído es: " + iNum );
	}
}
