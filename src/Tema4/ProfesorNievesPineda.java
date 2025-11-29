package Tema4;

import java.util.Objects;

public class ProfesorNievesPineda {
	private String dniProfesor,nombre,apellidos;
	protected float nomina;
	private int edad;
	private enum asignaturas{BBDD,MARCAS,PROGRAMACION,ENTORNOS,INTERFACES};//No he mirado como se usa, lo omitiré
		
	public ProfesorNievesPineda(String paramDNI,String paramNombre,String paramApellidos,int paramEdad/*enum paramAsignaturas*/){
		this.dniProfesor = paramDNI;
		this.nombre = paramNombre;
		this.apellidos = paramApellidos;
		this.edad = paramEdad;
		
	}


	public float importeNomina(float paramSueldoBase, float paramComplementos, float paramDeducciones) {
		return paramSueldoBase+paramComplementos-paramDeducciones;
	}
	/*Cambiar a que solo compare Nomina*/
	public boolean equals(ProfesorNievesPineda obj) {
		if (this.importeNomina(nomina, nomina, nomina) == obj.importeNomina(nomina, nomina, nomina))
			return true;
		else return false;
	}
	@Override
	public String toString() {
		return "ProfesorNievesPineda [dniProfesor=" + dniProfesor + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + ", nomina=" + nomina + "]";
	}

	
}
