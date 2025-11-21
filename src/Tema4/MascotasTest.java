package Tema4;

public class MascotasTest {

	public static void main(String[] args) {
		//Crea un perro 
		//dime si tiene pulgas
		//Calcula la vacuna
		
		Perro perro = new Perro("David",2005,"Dalmata",false); //	public Perro(String nombre, int anioNacimiento, String raza, boolean tienePulgas)
		
		perro.tienePulgas();		
		
		System.out.println("\nEdad: " + perro.getEdad());
		
		System.out.println("Precio de vacuna: "+perro.calcularVacuna());

		//el perro nos saluda
		perro.habla("Me llamo: " + perro.getNombre());
		//Muestra la info del perro
		System.out.println();
		System.out.println("Info del perro: "+perro);;
		
		
		//Creo al loro
		Loro loro = new Loro("Alvaro",1582,false,false,"Timbuctú"); //	public Loro(String nombre, int anioNacimiento, 
		//boolean pico, boolean vuela, String origen) {
		
		
		//El loro nos saluda
		loro.habla("Me llamo: " + loro.getNombre());
		//Muestra info del loro
		System.out.println();
		System.out.println(loro);
	}

}
