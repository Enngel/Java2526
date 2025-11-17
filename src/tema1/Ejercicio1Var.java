package tema1;

public class Ejercicio1Var {

	public static void main(String[] args) {
		/* Comentario 
		 * en 
		 * bloque
		   */
		
		//Comentario en linea
		
	
		String nombre = "Manuel";
		System.out.println("Te llamas: " + nombre +"." );
		
	//Formas de declarar variables
		int x=5, y=6, z=8;
		System.out.println(+x+y+z);
		 x=y=z=50;
		 System.out.println(x);
		
		 /*Variables las constantes que non variables inalterables (Cómo la gravedad)
		  * Son solo de lectura
		  * van en MAYÚSCULAS
		  * NO SE PUEDEN MODIFICAR
		  * van con un "final" antes
		  */
		 final float GRAVEDAD = 9.8f;
		 final byte MAYORIA_EDAD = 18;
		 final double PI = 3.1415;
	
	}

}
