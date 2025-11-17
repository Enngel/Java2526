package tema2;

public class Ejercicio10While {

	public static void main(String[] args) {

		//Pintar los 10 primeros numeros pares
		int contador = 0;
	
		while (contador <=20) {
			if(contador%2==0) {
				System.out.println(esPar(contador) + "(" + contador + ")");
			}
			contador++;
		}
		
		String sCad = "Hola";
		contador = 1;
		while (contador <= 5) {
			sCad += contador;
			contador++;
		}
		System.out.print("Cadena: " + sCad);
		
		
	}

	
	
	
	
/**
 * 	
 * @param iNum
 * @return
 * @author engel
 */
	public static boolean esPar(int iNum) {
		return iNum%2==0;
	}
}
