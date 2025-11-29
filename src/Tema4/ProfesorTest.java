package Tema4;

import java.util.Calendar;

public class ProfesorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo un profesor y pruebo que la funcion nomina funciona
		ProfesorNievesPineda p1 = new ProfesorNievesPineda("12345678P","^Pepe","Gonzales",12);
		System.out.println("Prueba de nomina de profesor(Base): "+p1.importeNomina(3000, 100, 300));
		
		
		//Creo los interinos y pruebo las nominas
		Calendar fecha =Calendar.getInstance();
		fecha.set(2004, 8, 22);
		Calendar fecha2 =Calendar.getInstance();
		fecha2.set(2012, 9, 23);
		
		ProfesorInterinoNievesPineda p2 = new ProfesorInterinoNievesPineda("12345678P","^Pepe","Gonzales",12, fecha);
		ProfesorInterinoNievesPineda p3 = new ProfesorInterinoNievesPineda("12345678P","^Pepe","Gonzales",12,fecha2);
		
		//Imprimo las nominas de los interinos
		System.out.println("Nomina del interino 1: " + p2.importeNomina(500,300));
		System.out.println("Nomina del interino 2: " + p3.importeNomina(600, 400));
		
		//Prueba de profesores titulares
		ProfesorTitularNievesPineda p4 =  new ProfesorTitularNievesPineda("12345678P","^Pepe","Gonzales",12,12);
		ProfesorTitularNievesPineda p5 =  new ProfesorTitularNievesPineda("12345678P","^Pepe","Gonzales",12,15);
		
		System.out.println("Nomina del titular 1: " + p4.importeNomina(400, 400));
		System.out.println("Nomina del titular 2: " + p5.importeNomina(600, 800));
		
		//Muestra por pantalla los toString de Interinos y titulares
		System.out.println(p2);
		System.out.println(p3);
		
		
	}

}
