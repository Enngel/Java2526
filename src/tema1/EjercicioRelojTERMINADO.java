package tema1;
import java.util.*;
public class EjercicioRelojTERMINADO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa que pida las horas
		 * (Formato 2 dígitos enteros) y los minutos(Formato
		 * 2 dígitos enteros) y muestre la hora real
		 * Si en el reloj veo las 8:05 me debe decir las 3:55
		 * Si en el reloj veo las 10:09 me debe decir las 01:51*/

	Scanner scEntrada = new Scanner(System.in);
	int iHoras, iMinutos;
	System.out.print("Dime la hora: ");
	iHoras = scEntrada.nextInt();
	System.out.print("Dime os minutos: ");
	iMinutos = scEntrada.nextInt();
	scEntrada.close();
	
	iHoras = (11 - iHoras);
	
	iMinutos = iMinutos == 0 ? iMinutos :(60 - iMinutos);
		
	System.out.print((iHoras < 10 ? "0"+iHoras : iHoras) + ":" + (iMinutos < 10 ? "0"+iMinutos : iMinutos) );
	}

}
