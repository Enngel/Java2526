package tema1;
import java.util.*;

public class Ejercicio41Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pide 3 num enteros, da las medias con y sin decimales
		int iNota1,iNota2,iNota3;
		int iMediaSinDecimal;
		Scanner scScanner = new Scanner(System.in);
		System.out.print("Nota primer trimestre: ");
		iNota1 = scScanner.nextInt();
		System.out.print("Nota segundo trimestre: ");
		iNota2 = scScanner.nextInt();
		System.out.print("Nota tercer trimestre: ");
		iNota3 = scScanner.nextInt();
		scScanner.close();
		double dMediaDecimal = (double)(iNota1 + iNota2 + iNota3)/3;
		iMediaSinDecimal = (int)dMediaDecimal;
		System.out.print("Boletín de calificaciones: " + iMediaSinDecimal + " " + " ");
		System.out.print("" + "Expediente académico: " + dMediaDecimal + "");

	}

}
