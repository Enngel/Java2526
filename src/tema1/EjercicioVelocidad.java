package tema1;

import java.util.Scanner;

public class EjercicioVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scEntrada = new Scanner(System.in);
		int iVelocidad, iVMax, iDistancia;
		System.out.print("Dime la velocidad MAXIMA (km/h): ");
		iVMax = scEntrada.nextInt();
		
		double iVMaxMS = iVMax/3.6;
		
		iVMax = (int)iVMaxMS; 

		System.out.print("Dime la distancia entre cámaras (en M): ");
		iDistancia = scEntrada.nextInt();
		System.out.print("Dime cuanto tardó en segundos: ");
		iVelocidad = scEntrada.nextInt();
		scEntrada.close();
		
				iVelocidad = iDistancia / iVelocidad;
		
		System.out.print(iVelocidad < iVMax ?  "OK" : (iVelocidad <= (iVMax * 1.2) ? "Multa" : 
			(iVelocidad > (iVMax * 1.2) ? "PUNTOS" : "" )));

		
	}

}
