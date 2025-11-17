package petshopENP;

public class TiendaEngelNievesPineda {

	private String nombre,direccion;
	private ClienteEngelNievesPineda cliente;
	
	
	public void agregarCliente(ClienteEngelNievesPineda cliente) {
		this.cliente = cliente;
	}


	public TiendaEngelNievesPineda(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		
	}


	@Override
	public String toString() {
		return "\nTiendaENP [nombre=" + nombre + ", direccion=" + direccion + ", cliente=" + cliente + "]";
	}
	
	
	
	
}
