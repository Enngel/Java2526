package EjerciciosOCTUBRE;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio2NumerosMedias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa que pida 5 números. Mostrar la media de los números positivos, 
		 * la media de los números negativos y la cantidad de ceros.
		 * */
		double dNum=0,dSumN=0,dSumP=0;
		int iContadorP=0,iContadorC=0,iContadorN=0;
		boolean esLetra=true;
		Scanner scEntrada = new Scanner(System.in);	
		
		//Este do/try prueba que no se meta una letra y repite constantemente hasta que se introduce un número
		for(int i = 0; i<5;i++) {
		
			do {
				//Utilizo el try para que en caso de error(de que se introduzca una letra o numero con decimales)
				//vuelva a pedir numero
				try {
					System.out.print("Introduce un número: ");
					dNum = scEntrada.nextDouble();
					esLetra=false;
					if(dNum >0 ) {
						dSumP +=dNum;
						iContadorP++;
					} else if(dNum <0 ) {
						dSumN += dNum;
						iContadorN++;
						
					} else iContadorC++; //Si no se da ninguno de los anteriores es porque es un 0
				}catch(InputMismatchException ime) 
				{
					System.out.print("Debe ser un número, ");
					scEntrada.next();
				
				}//Fin catch
			}while(esLetra);
			esLetra=true;
		}//Fin for
		scEntrada.close();
		
		//Escribe los resultados
		System.out.println("Media de numeros positivos: " + dMedia(dSumP,iContadorP));
		System.out.println("Media de numeros negativos: " + dMediaN(dSumN,iContadorN));
		System.out.println("Cantidad de ceros: " + iContadorC);
	}
		
	//Esta funcion hace las medias de los numeros positivos
	public static double dMedia(double dSumP , int iContadorP) {
		double dMedia;
		if(iContadorP > 0) {
		dMedia = dSumP/iContadorP;
		return dMedia;
		}else return 0;
}
	
	//Esta funcion de los negativos
	public static double dMediaN(double dSumN, int iContadorN) {
		double dMediaN;
		if(iContadorN > 0) {
		dMediaN = dSumN / iContadorN;
		return dMediaN;
		} else return 0;
		
	}
}
