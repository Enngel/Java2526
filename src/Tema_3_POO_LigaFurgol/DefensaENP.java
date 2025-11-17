package Tema_3_POO_LigaFurgol;

public class DefensaENP {
	private String nombre;
	private int edad,penaltisCometidos;
	
	
	/*
	 * Constructor
	 * */
	public DefensaENP(String nombre,int edad, int numPenaltis) {
		this.nombre = nombre;
		this.edad = edad;
		this.penaltisCometidos = numPenaltis;	
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
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public int getPenaltisCometidos() {
		return penaltisCometidos;
	}
	public void setPenaltisCometidos(int num) {
		penaltisCometidos = num;
	}

	@Override
	public String toString() {
		return "DefensaENP [nombre=" + nombre + ", edad=" + edad + ", penaltisCometidos=" + penaltisCometidos + "]";
	}
	
	
}
