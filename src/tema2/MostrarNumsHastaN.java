package tema2;
import java.util.Scanner;

public class MostrarNumsHastaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		Scanner scEntrada = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		iNum = scEntrada.nextInt();
		System.out.println("Números del 0 al " + iNum + ":");
		for(int i = 0 ; i <= iNum ; i++) {
			System.out.println(i);
			for(int j = 0 ; j < i; j++) {
				System.out.print("--");
			}
		}
	}

}
