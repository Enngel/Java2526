package buclesAnidados;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioCiclista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Con los datos leídos, es el momento de determinar cuántos kilómetros en total, 
		//incluyendo los de la ida y la vuelta de cada día, ha hecho el equipo.
	
		//Entrada
			//Valores positivos
		//Kilometros recorridos desde el momento que se supera
		//el punto alcanzado el dia anterior hasta que se dan 
		//la vuelta
		//Como max 30 km
		//Los kilometros introducidos se multiplican por 2
		//Cuando se introduzca el 0 se para el programa
		
		double dKM,dKMSuma=0.0,dTotalKM=0.0;
		Scanner scEntrada = new Scanner(System.in);
		
		while(true/*dKM!=0*/) {
		try {
		System.out.print("Introduce km recorridos (0 para terminar): ");
		dKM= scEntrada.nextDouble();
		if(dKM > 30) {
		System.out.println("El valor introducido NO puede ser mayor de 30.");	
		System.out.print("Introduce km recorridos (0 para terminar): ");
		dKM= scEntrada.nextDouble();
		}
		if(dKM==0) {
		System.out.println(""+dTotalKM);
		//Depurar solo ida
		//Estoy haciendo algo en la 3ra que no se hace en las otras 2
		
		}else{
			dKMSuma +=dKM;
			dTotalKM += dKMSuma;
		}
		
		}catch(InputMismatchException ime) {
			System.out.println("El valor introducido no es válido.");
			scEntrada.next();
		}//Fin catch
		System.out.print("Distancia total (ida y vuelta): " + dTotalKM*2+" km");
		}//Fin while
		
		
		
	}

}
