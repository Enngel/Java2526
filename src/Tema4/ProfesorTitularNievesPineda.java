package Tema4;

public class ProfesorTitularNievesPineda extends ProfesorNievesPineda{
	private int AniosAntiguedad;

	/**
	 * @param paramDNI
	 * @param paramNombre
	 * @param paramApellidos
	 * @param paramEdad
	 * @param aniosAntiguedad
	 */
	public ProfesorTitularNievesPineda(String paramDNI, String paramNombre, String paramApellidos, int paramEdad,
			int aniosAntiguedad) {
		super(paramDNI, paramNombre, paramApellidos, paramEdad);
		AniosAntiguedad = aniosAntiguedad;
	}
	
	public float importeNomina(float paramSueldoBase, float paramComplementos) {
		
		return paramSueldoBase+paramComplementos-(this.AniosAntiguedad*10);
	}
	
	
}
