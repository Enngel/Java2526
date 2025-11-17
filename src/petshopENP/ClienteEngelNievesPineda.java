package petshopENP;

public class ClienteEngelNievesPineda {
	
	private PerroEngelNievesPineda perro;
	private String nombre,direccion;
	
	//Hola
	//Adios
	
	public ClienteEngelNievesPineda( String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}



	public void comprarPerro(PerroEngelNievesPineda perro) {
		this.perro = perro;
	}



	@Override
	public String toString() {
		return "\nClienteENP [perro=" + perro + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
}
