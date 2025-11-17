package Tema_3_POO;

public class PersonaEngelNievesPineda {

	private String nombre;
	private byte edad;
	private double estatura=0;
	
	/**
	 * Constructor
	 */
	public PersonaEngelNievesPineda(String nombre,byte edad, double estatura) {
		this.nombre = nombre;
		this.edad=edad;
		this.estatura=estatura;
		
	}
	public  void crecer(double incremento) {
		estatura += incremento;
	}
	public void cumplirAnios() {
		edad+=1;
	}
	public byte getEdad() {
		return edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void Saludar() {
		System.out.println("Hola. mi nombre es " + nombre);
		System.out.println("Encantado de conocerte");
		
	}
	public void setEdad(byte nuevaEdad) {
		edad=nuevaEdad;
	}
	public  void setEstatura(double nuevaEstatura) {
		estatura = nuevaEstatura;
	}
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	//Método toString
	//Usé de referencia: https://codegym.cc/es/groups/posts/es.986.mtodo-java-tostring
	//Estatura en float porque si lo dejo en double salen muchos decimales
	@Override
	   public String toString() {
	       return "Persona [" + "Nombre="+nombre+" "+"edad="+edad+" "
	       		+ ""+"estatura="+(float)estatura+"]";
	   }

}
