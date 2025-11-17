package Tema_3_POO_LigaFurgol;

public class CentroCampistaENP {
	private String nombre;
	private int edad,numAsistencias;
	
	
	/*
	 * Constructor
	 * */
	public CentroCampistaENP(String nombre,int edad, int numAsistencias) {
		this.nombre = nombre;
		this.edad = edad;
		this.numAsistencias = numAsistencias;	
	}
	
	/*
	 * Métodos
	 * 
	 * */
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public int getNumAsistencias() {
		return numAsistencias;
	}
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	public void setNumAsistencias(int nuevoNumAsistencias) {
		numAsistencias = nuevoNumAsistencias;
		
	}
	//To String (Copiar de otra clase)
	@Override
	   public String toString() {
	       return "CentroCampista [" + "Nombre="+nombre+" "+"edad="+edad+" "
	       		+ ""+"Asistencias="+numAsistencias+"]";
	   }


}
