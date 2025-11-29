package Tema4;
import java.util.Calendar; //Esto en vez de local date?
import java.time.LocalDate; 

public class ProfesorInterinoNievesPineda extends ProfesorNievesPineda{
	private Calendar fechaInicioInterinidad;

	/**
	 * @param paramDNI
	 * @param paramNombre
	 * @param paramApellidos
	 * @param paramEdad
	 * @param fechaini
	 */
	public ProfesorInterinoNievesPineda(String paramDNI, String paramNombre, String paramApellidos, int paramEdad,
			Calendar fechaini) {
		super(paramDNI, paramNombre, paramApellidos, paramEdad);
		this.fechaInicioInterinidad = fechaini;
	}
	/*La deduccion del interiono son 100 fijos*/
	public float importeNomina(float paramSueldoBase, float paramComplementos) {
		
		return paramSueldoBase+paramComplementos-100;
	}
	@Override
	public String toString() {
		return "ProfesorInterinoNievesPineda [fechaInicioInterinidad=" + fechaInicioInterinidad + ", nomina=" + nomina
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
