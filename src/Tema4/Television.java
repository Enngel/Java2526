package Tema4;

public class Television extends Electrodomestico {

    private int resolucion;

    public Television() {
        super();
        this.resolucion = 20;
    }

    public Television(String marca, String modelo, double precio, String color, double potencia, 
                      double horasDiarias, double precioEnergia, int diasSemanales, int resolucion) {
    	
        super(marca, modelo, color, precio, potencia, horasDiarias, precioEnergia, diasSemanales);
        
        this.resolucion = resolucion;
    }

    @Override
    public double consumoAnual() {
        double consumo = super.consumoAnual();
        if (this.resolucion > 50) {
            consumo += 30;
        }
        return consumo;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Resolución=" + resolucion + " pulgadas";
    }
}
