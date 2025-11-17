package petshopENP;

public class PerroEngelNievesPineda {

	private String nombre,raza;
	private int edad;
	
	public PerroEngelNievesPineda(String nombre, String raza, int edad){
		this.edad = edad;
		this.nombre = nombre;
		this.raza = raza;
	}
	
	//Muestra por consola "Guau!"
	public void hacerRuido() {
		System.out.println("Guau!");
	}

	@Override
	public String toString() {
		return "PerroENP [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}
	
	
}
