package buclesAnidados;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Excepciones
		
		try {
	int iNum1,iNum2;
	Scanner scEntrada = new Scanner(System.in);
	System.out.print("Introduce un nº: ");
	iNum1 = scEntrada.nextInt();
	System.out.print("Introduce un nº: ");
	iNum2 = scEntrada.nextInt();
	scEntrada.close();
	int iResultado = iNum1/iNum2;
	System.out.print("El resultado es: " + iResultado);
	//ae1 es el nombre de la variable del error, el error es una clase
	//Cada error de Java tiene sus propias clases y funciones.
		
		} catch(ArithmeticException ae1) {
		System.out.println("No se puede dividir por cero: " + ae1.getMessage());	
			
		//Es lo que sale en rojo
		ae1.printStackTrace();
		
		}catch(InputMismatchException ime) {
			System.out.println("Debe ser entero: " + ime.getMessage());	

		}
		
	}

}
