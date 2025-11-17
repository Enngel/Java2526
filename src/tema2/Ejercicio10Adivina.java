package tema2;

import java.util.Random;
import java.util.Scanner;
public class Ejercicio10Adivina {

	public static void main(String[] args) {
		// 1 - Inicializacion
		Random random = new Random();
		Scanner scEntrada = new Scanner(System.in);
		int iNum;
		//Genera un nº aleatorio entre 1 y 100
		final int NUMERO_SECRETO = random.nextInt(100) + 1;
		System.out.println("El número secreto es(Para testear): " + NUMERO_SECRETO);
		//Pide nº
		
		do {
		System.out.print("Introduce un nº del 1 al 100: ");
		iNum = scEntrada.nextInt();
		//CONTROLES
		
		if(iNum < NUMERO_SECRETO) {
			System.out.println("El número secreto es mayor");
		}else if(iNum>NUMERO_SECRETO) {
			System.out.println("El número secreto es menor");
		} // ???
		else if(iNum == NUMERO_SECRETO) {
			System.out.print("¡Adivinaste!");
		}
		
		System.out.print("Vuelvelo a intentar: ");
		
		}while (iNum < 1 || iNum > 100 && iNum != NUMERO_SECRETO); //FINAL DO-WHILE
			
	scEntrada.close();
		
		
	
	}

}
