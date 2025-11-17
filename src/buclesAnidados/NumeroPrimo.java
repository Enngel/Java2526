package buclesAnidados;
import java.util.Scanner;
public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		boolean esPrimo=true;
		Scanner scEntrada = new Scanner(System.in);
	
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		scEntrada.close();
		for(int i = 2; i<iNum;i++) {
			if(iNum%i ==0) {
				esPrimo = false;
			}
		}
		System.out.print(iNum +" es --->" + (esPrimo ? " PRIMO" : " COMPUESTO"));
	
	}

}
