package Tema4;

import java.time.Year;

public class Perro extends Mascotas {
	
	private String raza;
	private boolean tienePulgas;
	
	/**
	 * @param nombre
	 * @param anioNacimiento
	 * @param raza
	 * @param tienePulgas
	 */
	public Perro(String nombre, int anioNacimiento, String raza, boolean tienePulgas) {
		
		super(nombre, anioNacimiento); //Es como poner new Mascotas(nombre,anioNacimiento)
		
		this.raza = raza;
		this.tienePulgas = tienePulgas;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tienePulgas=" + tienePulgas + ", getNombre()=" + getNombre()
				+ ", getAnioNacimiento()=" + getAnioNacimiento() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public void tienePulgas() {
		/*
		if (this.tienePulgas = false) {
			System.out.println("No tiene");
					}else System.out.println("Tiene pulgas.");
	*/
		String mensaje = "El perro ";
		mensaje += tienePulgas ? "SI" : "NO";
		mensaje += " tiene pulgas ";
		System.out.print(mensaje);
	}
	public double calcularVacuna() {
		/*Se calcula el precio según la edad
		 * Si es <= 5 años precio base 20$ y 0,3$ por edad
		 * Entre 6 y 10: precio base 15 y 0,2 por edad
		 * 11 o más: precio base 12$ y 0,1$ por edad
		 **/
		double precio;
		int edad = this.getEdad();
		
		if (edad <= 5) {
			precio = 20 + (0.3 * edad);
		}else if(edad <=10 && edad > 5) {
			precio = 15 + (0.2 * edad);
		}else {
			precio = 12 + (0.1 * edad);
		}
		return precio;
		
	}
	
}
