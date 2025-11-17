package tema1;
import java.util.Scanner;
public class ParIMpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scEntrada = new Scanner(System.in);
		int iNum;
		boolean isPar;
		
		System.out.print("Dime un número: ");
		
		iNum = scEntrada.nextInt();
		
		scEntrada.close();
		
		isPar = iNum%2 == 0;
		
		System.out.print("\n¿El número es par? -" + isPar);
		System.out.print(isPar == true ? "\nEs par" : "\nEs impar");
	}

}
