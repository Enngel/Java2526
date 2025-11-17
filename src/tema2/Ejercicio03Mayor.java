package tema2;

import java.util.Scanner;

public class Ejercicio03Mayor{

	public static void main(String[] args) {
		//Pedimos tres números y ordenamos de mayor a menor
		//Usar el &&
		Scanner scEntrada = new Scanner(System.in);
		int iNum, iNum2, iNum3;
		int iMayor = 0, iMenor = 0, iMedio = 0;
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		System.out.print("Introduce otro número: ");
		iNum2 = scEntrada.nextInt();
		System.out.print("Introduce otro número: ");
		iNum3 = scEntrada.nextInt();
		
		scEntrada.close();
		
		//Comprobamos que numero es mayor
	if(iNum > iNum2 && iNum2 > iNum3) {
	iMayor= iNum;
	iMedio=iNum2;
	iMenor = iNum3;
	
	} else if (iNum2 > iNum && iNum > iNum3) {
		iMayor= iNum2;
		iMedio=iNum;
		iMenor = iNum3;
		
	}else if (iNum2 > iNum && iNum > iNum3) {
		iMayor= iNum2;
		iMedio=iNum;
		iMenor = iNum3;
	}
	
	if(iNum == iNum2 && iNum2 == iNum3) {
			System.out.print("Son iguales");
		}
		
	
	System.out.print(iMayor +  " > " + iMedio + " > " + iMenor);
	
		
		
		
	}

}
