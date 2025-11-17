package Tema_3_POO_LigaFurgol;

public class PorteroENP {

	private int edad, golesRecibidos;
	private String nombre;
	
	
	public PorteroENP(int edad, int goles, String nombre) {
		this.edad = edad;
		this.golesRecibidos = goles;
		this.nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void setGolesRecibidos(int goles) {
		golesRecibidos = goles;
	}
	public int getGolesRecibidos() {
		return golesRecibidos;
	}

	@Override
	public String toString() {
		return "PorteroENP [edad=" + edad + ", golesRecibidos=" + golesRecibidos + ", nombre=" + nombre + "]";
	}
}
