package buclesAnidados;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NumeroFactorial {

	public static void main(String[] args) {
		// Programa que pida un número y calcule su factorial. 
		// por ejemplo: el factorial de 10 es:  10*9*8*7*6*5*4*3*2*1
		
		int iNum=0;
		Scanner scEntrada = new Scanner(System.in);

		//uso el do para prevenir que el número introducido sea negativo, una letra o un número con decimales
		try {
		
			do {
				System.out.print("Introduce un número positivo ENTERO: ");
		
				iNum = scEntrada.nextInt();
		
			}while(iNum<0);
		
		}catch(InputMismatchException ime) {
			System.out.println("Debe ser un número entero.");	

		}
		
		
        
        
        
		scEntrada.close();
		//Muestra el factorial
		//Codigo basado en el del siguiente artículo de StackOverflow
		//Enlace:
		//https://stackoverflow.com/questions/16098046/how-do-i-print-a-double-value-without-scientific-notation-using-java
		
		//Option2, use decimalFormat.
		  DecimalFormat df = new DecimalFormat("#");
		  df.setMaximumFractionDigits(8);
		  System.out.println("\nEl resultado de la multiplicacion es: " +df.format(dFactorial(iNum)));
		
	}

	//Funcion donde se calcula el factorial
	public static double dFactorial (int iNum) {
		double iFactorial=0;
		//Muestra los números que forman el factorial
		if(iNum>0) {
		iFactorial=1;
		System.out.println("Su factorial está formado por: ");
		for(int i = iNum; i>0; i--) {
		System.out.print("("+i +")");	
		iFactorial *= i;
		}
		}
		return iFactorial;
	}
	
	}
	

