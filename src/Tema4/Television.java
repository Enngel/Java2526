package Tema4;

public class Television extends Electrodomestico {

	
    private final static int RESOLUCION_BASE=30;
    
    private int iResolucion;
    public Television() {
     this(RESOLUCION_BASE);
     
    }

    public Television (int paramResolucion) {
    	super(MARCA_BASE,MODELO_BASE,PRECIO_BASE,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
    	this.iResolucion = paramResolucion;
    	
    }
   

    @Override
    public double consumoAnual() {
        double consumo = super.consumoAnual();
        if (this.iResolucion > 50) {
            consumo += 30;
        }
        return consumo;
    }

    public int getResolucion() {
        return iResolucion;
    }

    public void setResolucion(int resolucion) {
        this.iResolucion = resolucion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Resolución=" + iResolucion + " pulgadas";
    }
}
