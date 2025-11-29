package Tema4;

public class Electrodomestico {

	protected static final String MARCA_BASE = "Bosch",MODELO_BASE="7200",COLOR_BASE ="gris";
	protected static final double  PRECIO_BASE = 400, POTENCIA_BASE = 2300, PRECIO_ENERGIA_BASE = 0.40397;
	protected static final int DIAS_BASE = 3, HORAS_BASE = 1;
	
	
	private String sMarca,sModel,sColor;
	private double dPrecioElectrodom;
	protected double dPotencia,dPrecioEnergia;
	protected int iDias,iHoras;
	
	//Constructor por defecto con marca,modelo,precio,color,potencia,uso diario,uso semanal,precio energia
	// 3 veces semana = 52*3 = dias al año que se usa
	
	//Constructor por defecto
	public Electrodomestico() {
		this(MARCA_BASE,MODELO_BASE,PRECIO_BASE,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
	
	}
	//Constructor con marca, modelo y precio
	public Electrodomestico(String paramMarca, String paramModelo, double paramPrecio) {
		this(paramMarca,paramModelo,paramPrecio,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
		
	}
	//Constructor completo
	/**
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param potencia
	 * @param horasDiarias
	 * @param precioEnergia
	 * @param diasAnuales
	 */
	public Electrodomestico(String marca, String modelo, double precio, String color, double potencia,
			int horasDiarias, int diasSemanales, double precioEnergia) {
		super();
		this.sMarca = marca;
		this.sModel = modelo;
		this.sColor = color;
		this.dPrecioElectrodom = precio;
		this.dPotencia = potencia;
		this.iHoras = horasDiarias;
		this.dPrecioEnergia = precioEnergia;
		this.iDias = diasSemanales; //Hay 52 semanas en un año
	}
	
	public double consumoAnual() {
		//La potencia está en W así que paso a kW
		//Pasar de dias semanales a anuales (*52)
		return  ((this.iDias*52)*this.iHoras) * (this.dPotencia/1000) * this.dPrecioEnergia;
	}
		
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return sMarca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.sMarca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return sModel;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.sModel = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return sColor;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.sColor = color;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return dPrecioElectrodom;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.dPrecioElectrodom = precio;
	}
	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return dPotencia;
	}
	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.dPotencia = potencia;
	}
	/**
	 * @return the horasDiarias
	 */
	public double getHorasDiarias() {
		return iHoras;
	}
	/**
	 * @param horasDiarias the horasDiarias to set
	 */
	public void setHorasDiarias(int horasDiarias) {
		this.iHoras = horasDiarias;
	}
	/**
	 * @return the precioEnergia
	 */
	public double getPrecioEnergia() {
		return dPrecioEnergia;
	}
	/**
	 * @param precioEnergia the precioEnergia to set
	 */
	public void setPrecioEnergia(double precioEnergia) {
		this.dPrecioEnergia = precioEnergia;
	}
	/**
	 * @return the diasSemanales
	 */
	public int getDiasSemanales() {
		return iDias;
	}
	/**
	 * @param diasSemanales the diasSemanales to set
	 */
	public void setDiasSemanales(int diasSemanales) {
		this.iDias = diasSemanales;
	}
	@Override
	public String toString() {
		return "Electrodomestico [marca=" + sMarca + ", modelo=" + sModel + ", color=" + sColor + ", precio=" + dPrecioElectrodom
				+ ", potencia=" + dPotencia + ", horasDiarias=" + iHoras + ", precioEnergia=" + dPrecioEnergia
				+ ", diasSemanales=" + iDias + "]";
	}
	
	
	
	
	
}
