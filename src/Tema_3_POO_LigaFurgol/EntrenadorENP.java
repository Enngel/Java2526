package Tema_3_POO_LigaFurgol;

public class EntrenadorENP {
	
	private int edad, aniosDeExperiencia,titulos;
	private String nombre;
	
	
	public EntrenadorENP(String nombre,int edad,int anyosExperiencia,int titulos) 
	{
		this.nombre=nombre;
		this.edad = edad;
		this.aniosDeExperiencia = anyosExperiencia;
		this.titulos=titulos;
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
	public void setAniosExperiencia(int nuevos) {
		aniosDeExperiencia = nuevos;
	}
	public int getAniosExperiencia() {
		return aniosDeExperiencia;
	}
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int nuevos) {
		titulos= nuevos;
	}


	@Override
	public String toString() {
		return "EntrenadorENP [edad=" + edad + ", aniosDeExperiencia=" + aniosDeExperiencia + ", titulos=" + titulos
				+ ", nombre=" + nombre + "]";
	}
	
	
}
