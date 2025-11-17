package tema2;
import java.util.Scanner;
public class EjercicioRangos {
	public static void main(String[] args) {
	
	int iNum;
	Scanner scEntrada = new Scanner(System.in);
	System.out.print("Introduce la edad, solo entre 0 y 15");
	iNum = scEntrada.nextInt();
	scEntrada.close();
	
	switch (1<= iNum && iNum <=5 ? 0 : (6 <= iNum && iNum <=10 ? 1 : (11<=iNum && iNum<=15 ? 2:3)) ) {
	case 0 -> System.out.print("Tienes entre 0 y 5 años");
	case 1 -> System.out.print("Tienes entre 6 y 10 años");
	case 2 -> System.out.print("Tienes entre 11 y 15 años");
	default -> System.out.print("Fuera de rango");
	}


}

}
