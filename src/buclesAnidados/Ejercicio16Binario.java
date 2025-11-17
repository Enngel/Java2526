package buclesAnidados;
import java.util.Scanner;

public class Ejercicio16Binario {
public static void main(String[] args) {
	//Programa que lee un número en decimal
	//Lo convierte a binario
	//Se hace dividiendo entre 2 y se  lee desde el último resto
	
	String sCadena="";
	double dNum,dCociente;
	Scanner scEntrada = new Scanner(System.in);
	
	System.out.print("Introduce un número: ");
	dNum = scEntrada.nextDouble();
	scEntrada.close();
	dCociente=dNum;
	if(dNum == 1 ) {
		System.out.print((int)dNum);
	}else {
		//Pasar el número a binario
		
		//dCociente siempre igual a (int)(dNum/2)
		while(dCociente != 0) {
			sCadena =  ((int)(dCociente%2)) + sCadena;
			dCociente/=2;
		}
		System.out.print(sCadena);
	}
	
	
	
}
}
