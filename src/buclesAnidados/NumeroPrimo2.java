package buclesAnidados;
import java.util.Scanner;
public class NumeroPrimo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		boolean esPrimo=true;
		int i = 2;
		Scanner scEntrada = new Scanner(System.in);
	
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		scEntrada.close();
		//Usar While en vez de for
		
		while(i<Math.sqrt(iNum) && esPrimo){
			if(iNum % i ==0) {
				esPrimo = false;
			}
			i++;
		}
		System.out.print(iNum +" es --->" + (esPrimo ? " PRIMO" : " COMPUESTO"));
	
	}

}
