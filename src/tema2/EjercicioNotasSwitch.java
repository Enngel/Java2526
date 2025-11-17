package tema2;
import java.util.Scanner;
public class EjercicioNotasSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNotas;
		Scanner scEntrada = new Scanner(System.in);
		System.out.print("Introduce la nota: ");
		iNotas = scEntrada.nextInt();
		scEntrada.close();
		
		switch (iNotas) {
		case  1 , 2 ,3 ,4 -> System.out.print("Suspenso");
		case 5 -> System.out.print("Suficiente");
		case 6 -> System.out.print("Bien");
		case 7, 8 -> System.out.print("Notable");
		case 9, 10 -> System.out.print("Sobresaliente");
		default -> System.out.print("El valor introducido es inválido.");
		}
	}

}
