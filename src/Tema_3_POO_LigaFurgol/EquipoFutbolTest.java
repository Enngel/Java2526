package Tema_3_POO_LigaFurgol;

import java.time.LocalDate;

public class EquipoFutbolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EquipoFutbolENP equipo1 = new EquipoFutbolENP(
		            "Atlético del Sur",
		            "Sevilla",
		            "Estadio Guadalquivir",
		            LocalDate.of(1975, 3, 14),
		            new EntrenadorENP("Manuel Ortega", 52, 12, 3),      // nombre, edad, Experiencia, títulos
		            new PorteroENP(20, 8, "Pablo"),                      // edad, golesRecibidos, nombre
		            new DefensaENP("Pedro", 19, 5),                      // nombre, edad, Penaltis
		            new DefensaENP("Luis", 21, 7),
		            new DefensaENP("Mario", 20, 6),
		            new DefensaENP("Raúl", 22, 8),
		            new CentroCampistaENP("José", 23, 5),
		            new CentroCampistaENP("Álvaro", 24, 7),
		            new CentroCampistaENP("Iván", 25, 9),
		            new DelanteroENP(24, 10, "Sergio"),                  // edad, goles, nombre
		            new DelanteroENP(23, 8, "David"),
		            new DelanteroENP(26, 12, "Hugo"),
		            34
		        );
		 
		 
		 EquipoFutbolENP equipo2 = new EquipoFutbolENP(
		            "Real Norte FC",
		            "Bilbao",
		            "San Mames Norte",
		            LocalDate.of(1962, 9, 3),
		            new EntrenadorENP("Iñaki Echevarría", 49, 15, 2),
		            new PorteroENP(25, 10, "Unai"),
		            new DefensaENP("Ander", 28, 6),
		            new DefensaENP("Mikel", 31, 7),
		            new DefensaENP("Asier", 27, 5),
		            new DefensaENP("Eneko", 26, 6),
		            new CentroCampistaENP("Aitor", 25, 8),
		            new CentroCampistaENP("Gaizka", 24, 10),
		            new CentroCampistaENP("Jon", 26, 6),
		            new DelanteroENP(22, 11, "Iker"),
		            new DelanteroENP(23, 9, "Beñat"),
		            new DelanteroENP(27, 13, "Oier"),
		            41
		        );
		 
		 EquipoFutbolENP equipo3 = new EquipoFutbolENP(
		            "Costa Este CF",
		            "Valencia",
		            "Estadio Mediterráneo",
		            LocalDate.of(1983, 5, 22),
		            new EntrenadorENP("Raúl Herrera", 45, 9, 1),
		            new PorteroENP(18, 12, "Santiago"),
		            new DefensaENP("Adrián", 25, 5),
		            new DefensaENP("Pablo", 28, 6),
		            new DefensaENP("Carlos", 26, 4),
		            new DefensaENP("Jorge", 24, 7),
		            new CentroCampistaENP("Marcos", 22, 9),
		            new CentroCampistaENP("Daniel", 23, 6),
		            new CentroCampistaENP("Alberto", 24, 5),
		            new DelanteroENP(25, 8, "Óscar"),
		            new DelanteroENP(26, 9, "Diego"),
		            new DelanteroENP(28, 11, "Antonio"),
		            28
		        );
		
		 
		 EquipoFutbolENP equipo4 = new EquipoFutbolENP(
		            "Montaña Central CF",
		            "León",
		            "Nuevo Reino Arena",
		            LocalDate.of(1958, 2, 18),
		            new EntrenadorENP("Javier Castro", 56, 20, 5),
		            new PorteroENP(22, 9, "Rubén"),
		            new DefensaENP("Sergio", 29, 8),
		            new DefensaENP("Héctor", 30, 7),
		            new DefensaENP("Mario", 27, 6),
		            new DefensaENP("Gonzalo", 25, 9),
		            new CentroCampistaENP("David", 28, 10),
		            new CentroCampistaENP("Luis", 29, 8),
		            new CentroCampistaENP("Jorge", 27, 7),
		            new DelanteroENP(24, 10, "Iván"),
		            new DelanteroENP(25, 12, "Raúl"),
		            new DelanteroENP(26, 14, "Alejandro"),
		            37
		        );
		
		 
		 System.out.println(equipo1.toString());
		 System.out.println(equipo2.toString());
		 System.out.println(equipo3.toString());
			System.out.println(equipo4.toString());
		
	}

}
