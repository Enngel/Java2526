package tema2;
public class BuclesAnidadosTriangulo {

	public static void main(String[] args) {
		
		
	pintarTriangulo();
	pintarPiramide();
	
	/*
	 * Ejemplo de lógica para imprimir una pirámide de asteriscos:
	 *
	 * 1. Bucle externo (filas):
	 *    Un bucle for que recorre desde 1 hasta la altura de la pirámide deseada.
	 *
	 * 2. Bucle interno (espacios):
	 *    Dentro del bucle de filas, un segundo for imprime los espacios iniciales.
	 *    La cantidad de espacios se calcula restando la fila actual de la altura total
	 *    (o una lógica similar) para que los espacios disminuyan en cada fila.
	 *
	 * 3. Bucle interno (caracteres):
	 *    Un tercer for imprime los caracteres (asteriscos) que forman la base de la pirámide.
	 *    La cantidad de caracteres aumenta en cada fila, usualmente como (2 * fila - 1)
	 *    para una pirámide completa.
	 *
	 * 4. Salto de línea:
	 *    Después de imprimir todos los espacios y caracteres de una fila,
	 *    se añade un salto de línea para pasar a la siguiente fila.
	 */

	
	
	
	
	
	
	}

	/*PSEUDOCódigo
	 * 
	 * // Definir la altura de la pirámide
	 * altura = 5
	 * 
	 * // Bucle externo para las filas
	 * para fila de 1 hasta altura:
	 * // Bucle interno para los espacios
	 * para espacio de 1 hasta (altura - fila):
	 * imprimir " "
	 * // Bucle interno para los asteriscos
	 * para asterisco de 1 hasta (2 * fila - 1):
	 * imprimir "*"
	 * // Salto de línea al final de la fila
	 * imprimir salto_de_linea
	 * 
	 * */
	
	private static void pintarTriangulo() {
		// 1- Declaro variable para el número de filas
			int filas = 5;
		// 2- Primer for desde 1 hasta el número de filas
			for (int i = 1; i<=5; i++) {
				
		// 3- Pintar espacios en blanco para alinear el triángulo
				for(int j = filas; j > i ; j--) {
					System.out.print(" ");
					
				}//Fin for espacios
				
		// 4- Pintar los asteriscos
				for(int k = 1; k<=i; k++) {
					System.out.print("*");
				}//Fin del *
		// 5- Pintar un salto de linea
				System.out.println();
			}//Fin for int de filas
	}//Fin pintar triangulo

	private static void pintarPiramide() {
		// 1- Declaro variable para el número de filas
			int filas = 10;
		// 2- Primer for desde 1 hasta el número de filas
			for (int i = 1; i<=10; i++) {
				
		// 3- Pintar espacios en blanco para alinear el triángulo
				for(int j = filas; j > i ; j--) {
					System.out.print(" ");
					
				}//Fin for espacios
				
		// 4- Pintar los asteriscos
				for(int k = 1; k<=(2*i-1); k++) {
					System.out.print("*");
				}//Fin del *
		// 5- Pintar un salto de linea
				System.out.println();
	
			}//Fin for int de filas
	
	}//Fin pintar piramide

	
	
	

}
