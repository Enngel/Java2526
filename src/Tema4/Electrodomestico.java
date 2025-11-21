package Tema4;

public class Electrodomestico {

	private String marca,modelo,color;
	private double precio,potencia,horasDiarias,precioEnergia;
	private int diasSemanales;
	//Constructor por defecto con marca,modelo,precio,color,potencia,uso diario,uso semanal,precio energia
	// 3 veces semana = 52*3
	
	//Constructor por defecto
	public Electrodomestico() {
		this.marca = "Bosch";
		this.modelo = "7200";
		this.precio = 400;
		this.color = "Gris";
		this.potencia = 2300;
		this.horasDiarias = 1;
		this.diasSemanales = 52*3; //Hay 52 semanas en un año
		this.precioEnergia = 0.40397;
	}
	//Constructor con marca, modelo y precio
	public Electrodomestico(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
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
	public Electrodomestico(String marca, String modelo, String color, double precio, double potencia,
			double horasDiarias, double precioEnergia, int diasSemanales) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.potencia = potencia;
		this.horasDiarias = horasDiarias;
		this.precioEnergia = precioEnergia;
		this.diasSemanales = diasSemanales * 52; //Hay 52 semanas en un año
	}
	
	public double consumoAnual() {
		//Potencia * horas de uso al año
		double consumo;
		
		
		//Horas de uso al año
		double horasAnuales = this.diasSemanales * this.horasDiarias;
		
		//La potencia está en W así que paso a kW
		consumo = horasAnuales * (this.potencia/1000) * this.precioEnergia;
		
		return consumo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}
	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	/**
	 * @return the horasDiarias
	 */
	public double getHorasDiarias() {
		return horasDiarias;
	}
	/**
	 * @param horasDiarias the horasDiarias to set
	 */
	public void setHorasDiarias(double horasDiarias) {
		this.horasDiarias = horasDiarias;
	}
	/**
	 * @return the precioEnergia
	 */
	public double getPrecioEnergia() {
		return precioEnergia;
	}
	/**
	 * @param precioEnergia the precioEnergia to set
	 */
	public void setPrecioEnergia(double precioEnergia) {
		this.precioEnergia = precioEnergia;
	}
	/**
	 * @return the diasSemanales
	 */
	public int getDiasSemanales() {
		return diasSemanales;
	}
	/**
	 * @param diasSemanales the diasSemanales to set
	 */
	public void setDiasSemanales(int diasSemanales) {
		this.diasSemanales = diasSemanales;
	}
	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio
				+ ", potencia=" + potencia + ", horasDiarias=" + horasDiarias + ", precioEnergia=" + precioEnergia
				+ ", diasSemanales=" + diasSemanales + "]";
	}
	
	
	
	
	
}
