package Tema4;

public class Loro extends Aves{
	
	private String origen;

	/**
	 * @param nombre
	 * @param anioNacimiento
	 * @param pico
	 * @param vuela
	 * @param origen
	 */
	public Loro(String nombre, int anioNacimiento, boolean pico, boolean vuela, String origen) {
		super(nombre, anioNacimiento, pico, vuela);
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Loro [origen=" + origen + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getAnioNacimiento()=" + getAnioNacimiento() + ", getEdad()=" + getEdad() + "]";
	}
	
	
	
}
