package petshopENP;

public class TiendaEngelNievesPinedaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Creación de cada objeto y a la vez asigno un perro o cliente según corresponde:
		
			//Perro
		PerroEngelNievesPineda perro = new PerroEngelNievesPineda("Paco","Doberman",32);
		System.out.println("Perro creado con datos: " + perro);
		perro.hacerRuido(); //Para que muestre por consola "Guau!"
		
			//Cliente
		ClienteEngelNievesPineda cliente = new ClienteEngelNievesPineda("Pepe","Madrid");
		cliente.comprarPerro(perro);
		System.out.println("Cliente creado y perro asignado: " + cliente);
		
			//Tienda
		TiendaEngelNievesPineda tienda = new TiendaEngelNievesPineda("PetShop","Rusia");
		tienda.agregarCliente(cliente);
		System.out.println("Esta es mi tienda de animales: " + tienda);
		
		
		
	}

}
