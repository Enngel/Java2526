package tema2;

import java.util.Scanner;
public class EjercicioCiclistasAndrea2 {

	public static void main(String[] args) {
		// VUELTA CICLISTA
		//1- Pedir numeros hasta que introduzca 0. Bucle while
		//Planteo bucle, con ese bucle hago calculos
		 //Primero mete 1, lo guardo en variable, y lo multiplico *2- 
		  // Mete numero nuevo, en función del otro numero --> Convendría nueva variable con la suma, que guarde los km sumados yu vuelva a multiplicar 
		  //Luego la suma de todos.
		//Dentro bucle, introducen num, meto otro, y así por dos.
		
		Scanner scEntrada = new Scanner (System.in); //Abro Scanner
		
		
		System.out.print("Introduce km recorridos (0 para terminar): ");
		int primerkm = scEntrada.nextInt();  //Primera variable
		
		int idavuelta = 0;//Esto tiene que ser el 2X
		
		
		int iKm = 1; //Para que esté inicializado y no sea 0
		
		
		//CONTROL DE ERRORES: No negativo (if), no letras (excepcion), no más de 30 (id dentro bucle)
		
		while (primerkm !=0 && iKm != 0) { //A ESTO HAY QUE DARLE UNA VUELTA
			
			
			System.out.print("Introduce km recorridos (0 para terminar): ");
			iKm = scEntrada.nextInt(); 
			
			
			//DARLE UNA VUELTA EN CASA!!! SE PIERDE INFORMACIÓN!!
			if (iKm != 0) {
				//Recuerda que while es un tipo de bucle
		
			   nuevoskm = primerkm + iKm; //Aqui a los km les sumo los añadidos 
			   //primerkm= iKm;
			   
			   
			   //???
			   idavuelta = primerkm*2 + nuevoskm*2; //3STA CUENTA APLICARIA SOLO SI FUESEN DOS DATOS en este caso pierden datos!
			   primerkm= nuevoskm; 
			   
			}
			
		}
		     scEntrada.close(); //Cierro Scanner
			//Puedo multiplicar la primera ya fuera del bucle e imprimirla?
			System.out.println ("Distancia total (ida y vuelta): " + idavuelta);
		

	}

}