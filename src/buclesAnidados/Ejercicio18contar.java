package buclesAnidados;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio18contar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa que genera 100 números aleatorias
		 * y muestra:
		 * 	1- Cuantos pares hay
		 *  2- Cuantos primos hay
		 *  --versión 2.0 (opcional)
		 *  generarlo un número n de veces y calcular la probabilidad
		 *  
		 * */
		
		int iNum,iSumPares=0,iSumPrimos=0,iCantidadDeNumeros=0, iCantidadVueltas=0;
		double dProbabilidadPrimos=0,dProbabilidadPares=0;
		Scanner scEntrada = new Scanner(System.in);
		boolean entradaValida=false;
		//esto do/while con un try catch para que no se metan letras.
		//Soy el mejor programando ya lo sé
		//10/10
		do {
		try {
			do {
				System.out.println("Introduce las vueltas que dará el bucle, ");
				System.out.println("Cada vuelta es igual a 100 números");
				System.out.print("Nº de vueltas: ");
				iCantidadVueltas= scEntrada.nextInt();
				
				entradaValida=true;
				
			}while(iCantidadVueltas<=0 && !entradaValida);
		}catch(InputMismatchException ime){
			System.out.print("Introduce un número válido: ");
			scEntrada.next();
			
		}
		
		}while(!entradaValida);
		
		scEntrada.close();
		
		for(int j = 0; j<iCantidadVueltas;j++) {
		for (int i = 0; i<100;i++) {
			iNum =((int)(Math.random()*100001));
			System.out.print("<" + iNum + ">");
			//Cantidad total de números
			iCantidadDeNumeros++;
			
			if(esPrimo(iNum)) {
				//Cantidad de primos cada 100 numeros
			iSumPrimos++;	
			}
			if(iNum%2==0) {
				//Cantidad de pares cada 100 numeros
				iSumPares++;
			}
			
		}
		dProbabilidadPrimos= (iSumPrimos * 100.0) / iCantidadDeNumeros;
		dProbabilidadPares=(iSumPares * 100.0) / iCantidadDeNumeros;
		}
		System.out.println("\nCantidad de primos: " + iSumPrimos);
		System.out.println("Cantidad de pares: " + iSumPares);
		System.out.println("Total de números: " + iCantidadDeNumeros);
		System.out.println("La probabilidad de que sea primo es: " + dProbabilidadPrimos + "% (APROXIMADAMENTE)");
		System.out.println("La probabilidad de que sea par es: " + dProbabilidadPares + "% (APROXIMADAMENTE)");
	}
	public static boolean esPrimo(int iNum) {
		boolean isPrimo=true;
		int i = 2;
		while(i<Math.sqrt(iNum) && isPrimo){
			if(iNum % i ==0) {
				isPrimo = false;
			}
			i++;
		}
		return isPrimo;
	}
}
