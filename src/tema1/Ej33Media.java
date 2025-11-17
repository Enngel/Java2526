package tema1;
import java.util.Scanner;

public class Ej33Media {

	public static void main(String[] args) {
		
		
		double dNum1;
		double dNum2;
		

		System.out.println("Dime dos notas y te hago la media");
		System.out.print("Primera nota: ");
		Scanner scScanner = new Scanner(System.in);
		dNum1 = scScanner.nextDouble();
		System.out.print("Segunda nota: ");
		dNum2 = scScanner.nextDouble();
		scScanner.close();
		
		double media = (dNum1 + dNum2)/2;
		System.out.print("Tú media es: " + media);
	
	
	}

}
