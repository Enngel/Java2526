package Tema_3_POO_LigaFurgol;

public class DelanteroENP {

	private int edad, golesAnotados;
	private String nombre;
	
	
	public DelanteroENP(int edad, int goles, String nombre) {
		this.edad = edad;
		this.golesAnotados = goles;
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
	public void setGolesAnotados(int nuevosGoles) {
		golesAnotados = nuevosGoles;
	}
	public int getGolesAnotados() {
		return golesAnotados;
	}

	@Override
	public String toString() {
		return "DelanteroENP [edad=" + edad + ", golesAnotados=" + golesAnotados + ", nombre=" + nombre + "]";
	}
	
	
	
}
