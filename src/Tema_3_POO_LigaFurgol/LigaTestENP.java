package Tema_3_POO_LigaFurgol;

import java.time.LocalDate;

public class LigaTestENP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entrenadores
        EntrenadorENP ent1 = new EntrenadorENP("Ortega", 50, 10, 2);
        EntrenadorENP ent2 = new EntrenadorENP("Echevarría", 45, 8, 1);
        EntrenadorENP ent3 = new EntrenadorENP("Herrera", 48, 12, 3);
        EntrenadorENP ent4 = new EntrenadorENP("Castro", 52, 14, 4);

        // Porteros
        PorteroENP p1 = new PorteroENP(20, 0, "Pablo");
        PorteroENP p2 = new PorteroENP(21, 0, "Unai");
        PorteroENP p3 = new PorteroENP(22, 0, "Santiago");
        PorteroENP p4 = new PorteroENP(23, 0, "Rubén");

        // Defensas
        DefensaENP d1 = new DefensaENP("Pedro", 19, 0);
        DefensaENP d2 = new DefensaENP("Luis", 21, 0);
        DefensaENP d3 = new DefensaENP("Ander", 25, 0);
        DefensaENP d4 = new DefensaENP("Mikel", 27, 0);
        DefensaENP d5 = new DefensaENP("Mario", 23, 0);
        DefensaENP d6 = new DefensaENP("Raúl", 24, 0);
        DefensaENP d7 = new DefensaENP("Iván", 26, 0);
        DefensaENP d8 = new DefensaENP("Gonzalo", 25, 0);
        DefensaENP i1 = new DefensaENP("Mario", 20, 0);
        DefensaENP i2 = new DefensaENP("Raúl", 22, 0);
        DefensaENP i3 = new DefensaENP("Asier", 27, 0);
        DefensaENP i4 = new DefensaENP("Eneko", 26, 0);
        DefensaENP i5 = new DefensaENP("Carlos", 26, 0);
        DefensaENP i6 = new DefensaENP("Jorge", 24, 0);
        DefensaENP i7 = new DefensaENP("Mario", 27, 0);
        DefensaENP i8 = new DefensaENP("Gonzalo", 25, 0);

        // Centrocampistas
        CentroCampistaENP c1 = new CentroCampistaENP("José", 23, 0);
        CentroCampistaENP c2 = new CentroCampistaENP("Álvaro", 22, 0);
        CentroCampistaENP c3 = new CentroCampistaENP("Iván", 24, 0);
        CentroCampistaENP c4 = new CentroCampistaENP("David", 26, 0);
        CentroCampistaENP c5 = new CentroCampistaENP("Marcos", 25, 0);
        CentroCampistaENP c6 = new CentroCampistaENP("Jorge", 27, 0);
        CentroCampistaENP c7 = new CentroCampistaENP("Raúl", 28, 0);
        CentroCampistaENP c8 = new CentroCampistaENP("Luis", 29, 0);
        CentroCampistaENP c9 = new CentroCampistaENP("Ángel", 30, 0);
        CentroCampistaENP c10 = new CentroCampistaENP("Manu", 28, 0);
        CentroCampistaENP c11 = new CentroCampistaENP("Sergio", 24, 0);
        CentroCampistaENP c12 = new CentroCampistaENP("Dani", 22, 0);

        // Delanteros
        DelanteroENP e1 = new DelanteroENP(24, 0, "Hugo");
        DelanteroENP e2 = new DelanteroENP(25, 0, "Iker");
        DelanteroENP e3 = new DelanteroENP(26, 0, "Óscar");
        DelanteroENP e4 = new DelanteroENP(27, 0, "Alejandro");
        DelanteroENP e5 = new DelanteroENP(23, 0, "Carlos");
        DelanteroENP e6 = new DelanteroENP(28, 0, "Antonio");
        DelanteroENP e7 = new DelanteroENP(29, 0, "Pablo");
        DelanteroENP e8 = new DelanteroENP(30, 0, "Diego");
        DelanteroENP e9 = new DelanteroENP(22, 0, "David");
        DelanteroENP e10 = new DelanteroENP(24, 0, "Beñat");
        DelanteroENP e11 = new DelanteroENP(25, 0, "Raúl");
        DelanteroENP e12 = new DelanteroENP(27, 0, "Luis");

        // Equipos
        EquipoFutbolENP equipo1 = new EquipoFutbolENP("Atlético del Sur", "Sevilla", "Estadio Guadalquivir",
                LocalDate.of(1975, 3, 14), ent1, p1, d1, d2, d5, d6, c1, c2, c3, e1, e2, e3, 0);

		EquipoFutbolENP equipo2 = new EquipoFutbolENP("Real Norte FC", "Bilbao", "San Mames Norte",
                LocalDate.of(1962, 9, 3), ent2, p2, d3, d4, i3, i4, c4, c5, c6, e4, e5, e6, 0);

        EquipoFutbolENP equipo3 = new EquipoFutbolENP("Costa Este CF", "Valencia", "Estadio Mediterráneo",
                LocalDate.of(1983, 5, 22), ent3, p3, d5, d6, i5, i6, c7, c8, c9, e7, e8, e9, 0);

        EquipoFutbolENP equipo4 = new EquipoFutbolENP("Montaña Central CF", "León", "Nuevo Reino Arena",
                LocalDate.of(1958, 2, 18), ent4, p4, d7, d8, i7, i8, c10, c11, c12, e10, e11, e12, 0);

        // Liga
        LigaENP liga = new LigaENP(equipo1, equipo2, equipo3, equipo4);

        // Simulación
        liga.simularPartido(equipo1, equipo2);
        liga.simularPartido(equipo3, equipo4);
        liga.simularPartido(equipo1, equipo3);
        liga.simularPartido(equipo2, equipo4);

        // Resultados finales
        liga.mostrarClasificacion(); //De más puntos a menos
        liga.mostrarPichichi();
        liga.mostrarZamora();
    }
}

