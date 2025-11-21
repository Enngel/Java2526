package Tema4;

public class PerroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro = new Perro("David",2005,"Dalmata",false); //	public Perro(String nombre, int anioNacimiento, String raza, boolean tienePulgas)
		
		System.out.println("Edad: " + perro.getEdad());
		
		System.out.println("Precio de vacuna: "+perro.calcularVacuna());

		
	}

}
