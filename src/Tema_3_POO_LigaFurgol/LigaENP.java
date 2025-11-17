package Tema_3_POO_LigaFurgol;

public class LigaENP {
	//Atributos
	private EquipoFutbolENP equipo1,equipo2,equipo3,equipo4;
	//Métodos

	public LigaENP(EquipoFutbolENP equipo1, EquipoFutbolENP equipo2, EquipoFutbolENP equipo3, EquipoFutbolENP equipo4) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.equipo3 = equipo3;
		this.equipo4 = equipo4;
	}

	public EquipoFutbolENP getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(EquipoFutbolENP equipo1) {
		this.equipo1 = equipo1;
	}

	public EquipoFutbolENP getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(EquipoFutbolENP equipo2) {
		this.equipo2 = equipo2;
	}

	public EquipoFutbolENP getEquipo3() {
		return equipo3;
	}

	public void setEquipo3(EquipoFutbolENP equipo3) {
		this.equipo3 = equipo3;
	}

	public EquipoFutbolENP getEquipo4() {
		return equipo4;
	}

	public void setEquipo4(EquipoFutbolENP equipo4) {
		this.equipo4 = equipo4;
	}
	
	  public void simularPartido(EquipoFutbolENP e1, EquipoFutbolENP e2) {
	        int golesE1 = (int)(Math.random() * 6);
	        int golesE2 = (int)(Math.random() * 6);

	        System.out.println("\nPartido: " + e1.getNombreEquipo() + " vs " + e2.getNombreEquipo());
	        System.out.println("Resultado: " + golesE1 + " - " + golesE2);

	        
	        //Para sacar el Zamora de alguno de los equipos
	        /* Cada portero tiene un atributo golesRecibidos.
	         * Si el equipo 1 mete golesE2, esos goles se suman a su portero.
	         * Si el equipo 2 mete golesE1, se suman a su portero.
	         * */
	        e1.getPorteroTitulas().setGolesRecibidos(e1.getPorteroTitulas().getGolesRecibidos() + golesE2);
	        e2.getPorteroTitulas().setGolesRecibidos(e2.getPorteroTitulas().getGolesRecibidos() + golesE1);
	        //Para sacar al pichichi
	        /* Cada equipo tiene un delantero centro
	         * con un contador de golesAnotados.
	         * Si el equipo 1 marca golesE1, esos goles se añaden 
	         * al delantero del equipo 1.
	         * Lo mismo para el equipo 2 con golesE2.
	         * */
	        e1.getDelanteroCentro().setGolesAnotados(e1.getDelanteroCentro().getGolesAnotados() + golesE1);
	        e2.getDelanteroCentro().setGolesAnotados(e2.getDelanteroCentro().getGolesAnotados() + golesE2);
	        
	        
	        /*
	         * Lo siguiente simulan los penaltis cometidos
	         *  y el número de asistencias 
	         * */
	        
	        e1.getCentro1().setNumAsistencias(e1.getCentro1().getNumAsistencias() + (int)(Math.random() * 3));
	        e2.getCentro1().setNumAsistencias(e2.getCentro1().getNumAsistencias() + (int)(Math.random() * 3));

	        e1.getCentral1().setPenaltisCometidos(e1.getCentral1().getPenaltisCometidos() + (int)(Math.random() * 2));
	        e2.getCentral1().setPenaltisCometidos(e2.getCentral1().getPenaltisCometidos() + (int)(Math.random() * 2));
	        
	        
	        
	        
	        //Cada vez que un equipo gana +3 puntos, si empata 1
	        if (golesE1 > golesE2) {
	            e1.setPuntos(e1.getPuntos() + 3);
	            System.out.println("ha ganado: " + e1.getNombreEquipo());
	        } else if (golesE1 < golesE2) {
	            e2.setPuntos(e2.getPuntos() + 3);
	            System.out.println("ha ganado: " + e2.getNombreEquipo());
	        } else {
	            e1.setPuntos(e1.getPuntos() + 1);
	            e2.setPuntos(e2.getPuntos() + 1);
	            System.out.println("Empate");
	        }
	    }

	    public void listarPuntos() {
	        System.out.println("\nPuntos:");
	        System.out.println(equipo1.getNombreEquipo() + ": " + equipo1.getPuntos() + " puntos");
	        System.out.println(equipo2.getNombreEquipo() + ": " + equipo2.getPuntos() + " puntos");
	        System.out.println(equipo3.getNombreEquipo() + ": " + equipo3.getPuntos() + " puntos");
	        System.out.println(equipo4.getNombreEquipo() + ": " + equipo4.getPuntos() + " puntos");
	    }
	    
	    public void mostrarPichichi() {
	        DelanteroENP mejor = equipo1.getDelanteroCentro();
	        EquipoFutbolENP eq = equipo1;

	        if (equipo2.getDelanteroCentro().getGolesAnotados() > mejor.getGolesAnotados()) {
	            mejor = equipo2.getDelanteroCentro();
	            eq = equipo2;
	        }
	        if (equipo3.getDelanteroCentro().getGolesAnotados() > mejor.getGolesAnotados()) {
	            mejor = equipo3.getDelanteroCentro();
	            eq = equipo3;
	        }
	        if (equipo4.getDelanteroCentro().getGolesAnotados() > mejor.getGolesAnotados()) {
	            mejor = equipo4.getDelanteroCentro();
	            eq = equipo4;
	        }

	        System.out.println("\nPichichi: " + mejor.getNombre() + " (" + eq.getNombreEquipo() + ") - " + mejor.getGolesAnotados() + " goles");
	    }
	    
	    
	    public void mostrarZamora() {
	        PorteroENP mejor = equipo1.getPorteroTitulas();
	        EquipoFutbolENP eq = equipo1;

	        if (equipo2.getPorteroTitulas().getGolesRecibidos() < mejor.getGolesRecibidos()) {
	            mejor = equipo2.getPorteroTitulas();
	            eq = equipo2;
	        }
	        if (equipo3.getPorteroTitulas().getGolesRecibidos() < mejor.getGolesRecibidos()) {
	            mejor = equipo3.getPorteroTitulas();
	            eq = equipo3;
	        }
	        if (equipo4.getPorteroTitulas().getGolesRecibidos() < mejor.getGolesRecibidos()) {
	            mejor = equipo4.getPorteroTitulas();
	            eq = equipo4;
	        }

	        System.out.println("Zamora: " + mejor.getNombre() + " (" + eq.getNombreEquipo() + ") - " + mejor.getGolesRecibidos() + " goles recibidos");
	    }
	    public void mostrarClasificacion() {
	        System.out.println("\nClasificación:");

	        int p1 = equipo1.getPuntos();
	        int p2 = equipo2.getPuntos();
	        int p3 = equipo3.getPuntos();
	        int p4 = equipo4.getPuntos();

	        for (int i = 0; i < 4; i++) {
	            if (p1 >= p2 && p1 >= p3 && p1 >= p4) {
	                System.out.println(equipo1.getNombreEquipo() + ": " + p1 + " puntos");
	                p1 = -1;
	            } else if (p2 >= p1 && p2 >= p3 && p2 >= p4) {
	                System.out.println(equipo2.getNombreEquipo() + " : " + p2 + " puntos");
	                p2 = -1;
	            } else if (p3 >= p1 && p3 >= p2 && p3 >= p4) {
	                System.out.println(equipo3.getNombreEquipo() + ": " + p3 + " puntos");
	                p3 = -1;
	            } else {
	                System.out.println(equipo4.getNombreEquipo() + ": " + p4 + " puntos");
	                p4 = -1;
	            }
	        }
	        }
	    }
	    

