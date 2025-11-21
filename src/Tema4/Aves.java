package Tema4;

public class Aves extends Mascotas{
//Solo constructor y ToString
	
	private boolean pico;
	private boolean vuela;
	/**
	 * @param nombre
	 * @param anioNacimiento
	 * @param pico
	 * @param vuela
	 */
	public Aves(String nombre, int anioNacimiento, boolean pico, boolean vuela) {
		super(nombre, anioNacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}
	@Override
	public String toString() {
		return "Aves [pico=" + pico + ", vuela=" + vuela + ", getNombre()=" + getNombre() + ", getAnioNacimiento()="
				+ getAnioNacimiento() + ", toString()=" + super.toString() + ", getEdad()=" + getEdad() + "]";
	}
	
	
	
}
