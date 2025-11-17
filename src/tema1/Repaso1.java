package tema1;

import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scEntrada = new Scanner(System.in);
		int x = scEntrada.nextInt();
		scEntrada.close();
		System.out.println(x >= 10 ? "Hola":"Adios");
	}

}
