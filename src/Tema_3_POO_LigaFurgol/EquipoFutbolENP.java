package Tema_3_POO_LigaFurgol;
import java.util.Scanner;
import java.time.LocalDate;

/*
 * If i were you
 * perhaps you could just
 * i tried what you sggested
 * what do you think i should do
 * Im not sure thats a good idea
 * Why dont you try ---
 * Im not too sure abt that
 * 
 * */



public class EquipoFutbolENP {
	
	private String nombreEquipo,ciudad,nombreCampo;
	private	LocalDate fundacionFecha;
	private EntrenadorENP entrenador;
	private DefensaENP central1,central2,interiorIzq,interiorDcha;
	private CentroCampistaENP centro1,centro2,centro3;
	private DelanteroENP extremoIzq,extremoDcha,centro;
	private PorteroENP portero;
	private int puntos;
	
	
	//Constructor
	public EquipoFutbolENP(String nombreEquipo, String ciudad
			, String nombreCampo
			, LocalDate fechaFundacion, EntrenadorENP entrenador
			, PorteroENP porteroTitular, DefensaENP central1, DefensaENP central2
			, DefensaENP interiorIzq, DefensaENP interiorDcha
			, CentroCampistaENP centrocampista1, CentroCampistaENP centrocampista2
			, CentroCampistaENP centrocampista3, DelanteroENP extremoIzq
			, DelanteroENP extremoDcha
			, DelanteroENP delanteroCentro, int puntos){
		
		//Strings
		this.nombreEquipo = nombreEquipo;
		this.ciudad=ciudad;
		this.nombreCampo = nombreCampo;
		//Entrenador
		this.entrenador = entrenador;
		//Fecha
		this.fundacionFecha = fechaFundacion;
		//Puntos
		this.puntos = puntos;
		//Defensas
		this.central1=central1;
		this.central2 = central2;
		this.interiorIzq = interiorIzq;
		this.interiorDcha = interiorDcha;
		//Delanteros
		this.extremoDcha = extremoDcha;
		this.extremoIzq = extremoIzq;
		this.centro = delanteroCentro;
		//CentroCampistas
		this.centro1 = centrocampista1;
		this.centro2 = centrocampista2;
		this.centro3 = centrocampista3;
		//Portero
		this.portero = porteroTitular;
		
	}//Fin constructor
	
	//Metodos
	

	//Getters Defensas
	public DefensaENP getCentral1() {
		return central1;
	}
	
	public DefensaENP getCentral2() {
		return central2;
	}
	
	public DefensaENP getInteriorDcha() {
		return interiorDcha;
	}
	
	public DefensaENP getInteriorIzq() {
		return interiorIzq;
	}
			//Getters CentroCampistas
	public CentroCampistaENP getCentro1() {
		return centro1;
	}
	public CentroCampistaENP getCentro2() {
		return centro2;
	}
	public CentroCampistaENP getCentro3() {
		return centro3;
	}
			//Getters delanteros
	public DelanteroENP getDelanteroCentro() {
		return centro;
	}
	public DelanteroENP getExtremoDerecha() {
		return extremoDcha;
	}
	public DelanteroENP getExtremoIzq() {
		return extremoIzq;
	}
			//Getter Portero
	public PorteroENP getPorteroTitulas() {
		return portero;
	}
			//Getter Entrenador
	public EntrenadorENP getEntrenador() {
		return entrenador;
	}
	
			//Getters Strings
	public String getCiudad() {
		return ciudad;
	}
	public String getNombreCampo() {
		return nombreCampo;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
			//Getter fecha
	public LocalDate getFechaFundacion() {
		return fundacionFecha;
	}
			//Getter puntos
	public int getPuntos() {
		return puntos;
	}
		//Setters Defensas
	public void setCentral1(DefensaENP central) {
		central1=central;
	}
	
	public void setCentral2(DefensaENP central) {
		central2 = central;
	}
	
	public void setInteriorDcha(DefensaENP dcha) {
		interiorDcha = dcha;
	}
	public void setInteriorIzq(DefensaENP izq) {
		interiorIzq = izq;
	}
	//Setters CentroCampistas
	public void setCentro1(CentroCampistaENP c) {
		centro1 = c;
	}
	public void setCentro2(CentroCampistaENP c) {
		centro2 = c;
	}
	public void setCentro3(CentroCampistaENP c) {
		centro3 = c;
	}
	
	//Setters delanteros
	
	public void setDelanteroCentro(DelanteroENP d) {
		centro=d;
	}
	public void setExtremoDerecha(DelanteroENP d) {
		extremoDcha=d;
	}
	public void setExtremoIzq(DelanteroENP d) {
		extremoIzq=d;
	}
	//Setter Portero
	public void setPorteroTitulas(PorteroENP p) {
	portero = p;
}
	//Setter Entrenador
	public void setEntrenador(EntrenadorENP e) {
		entrenador = e;
	}

	//Setters Strings
	public void setCiudad(String c) {
		ciudad = c;
	}
	public void setNombreCampo(String c) {
		nombreCampo = c;
	}
	public void setNombreEquipo(String c) {
		nombreEquipo = c;
	}
	//Setter fecha
	public void setFechaFundacion(LocalDate l) {
		 fundacionFecha = l;
	}
	public void setPuntos(int i) {
		puntos = i;
	}
	//To string

	@Override
	public String toString() {
		return "EquipoFutbolENP [nombreEquipo=" + nombreEquipo + ", ciudad=" + ciudad + ", nombreCampo=" + nombreCampo
				+ ", fundacionFecha=" + fundacionFecha + ", entrenador=" + entrenador + ", central1=" + central1
				+ ", central2=" + central2 + ", interiorIzq=" + interiorIzq + ", interiorDcha=" + interiorDcha
				+ ", centro1=" + centro1 + ", centro2=" + centro2 + ", centro3=" + centro3 + ", extremoIzq="
				+ extremoIzq + ", extremoDcha=" + extremoDcha + ", centro=" + centro + ", portero=" + portero
				+ ", puntos=" + puntos + "]";
	}
	
}
	
