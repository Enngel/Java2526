package Tema_3_POO;

public class PersonaTestEngelNievesPineda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaEngelNievesPineda Engel = new PersonaEngelNievesPineda("Engel", (byte) 20, 1.60);
		System.out.println("Datos del alumnoDAW=" + Engel+"\n");
		//Vemos el saludo de Engel
		Engel.Saludar();
		//Engel cumple Años
		Engel.cumplirAnios();
		//Y ha crecido
		Engel.crecer(0.05);
		//Volvemos a ver los datos de Engel
		System.out.println("\nDatos del alumnoDAW=" + Engel+"\n");
		//Han pasado dos años
		Engel.setEdad( (byte)21);
		//Y ha crecido un poco más
		Engel.setEstatura(1.65);
		//Y ahora nos piden guardar también el apellido
		Engel.setNombre("Engel Nieves");
		//Mostramos los nuevos datos
		System.out.println("Datos con cambios");
		System.out.println("Nombre:"+Engel.getNombre());
		System.out.println("Edad:"+Engel.getEdad());
		System.out.println("Estatura:"+Engel.getEstatura());
	}

}
