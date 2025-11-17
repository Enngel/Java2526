package tema1;
import java.util.Scanner;

public class ControlVelocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce la velocidad máxima permitida (km/h): ");
        double velMaxKmh = sc.nextDouble();

        System.out.print("Introduce el tiempo en recorrer el tramo (segundos): ");
        double tiempoS = sc.nextDouble();

        // Comprobación de errores
        if (tiempoS <= 0) {
            System.out.println("Error: El tiempo debe ser positivo");
        } else {
            // Pasar km/h a m/s
            double velMaxMs = velMaxKmh / 3.6;

            // Pedir la distancia en metros
            System.out.print("Introduce la distancia recorrida (metros): ");
            double distancia = sc.nextDouble();

            // Calcular la velocidad real
            double velRealMs = distancia / tiempoS;

            // 20% más de la velocidad máxima
            double exceso20Ms = velMaxMs * 1.2;

            // Mostrar resultado
            if (velRealMs <= velMaxMs) {
                System.out.println("OK");
            } else if (velRealMs < exceso20Ms) {
                System.out.println("Multa");
            } else {
                System.out.println("PUNTOS");
            }
        }

        sc.close();
    }
}
