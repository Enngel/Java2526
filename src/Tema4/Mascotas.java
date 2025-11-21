package Tema4;

import java.time.Year;

public class Mascotas {

	
	private String nombre;
	private int anioNacimiento;
	
	/**
	 * @param nombre
	 * @param anioNacimiento
	 */
	public Mascotas(String nombre, int anioNacimiento) {
		super();
		this.nombre = nombre;
		this.anioNacimiento = anioNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", anioNacimiento=" + anioNacimiento + "]";
	}
	public void habla(String paramMensaje) {
		if(this instanceof Perro)
			paramMensaje = "Soy un perro y digo: " + paramMensaje;
		else if (this instanceof Loro)
			paramMensaje = "Soy un loro y digo: " + paramMensaje;
		System.out.print(paramMensaje);
	}
	public int getEdad() {

		return	((Year.now().getValue()) - this.getAnioNacimiento());
	}	

}
