package tema2;

import java.util.Scanner;

public class t2SalarioEngel{

	public static void main(String[] args) {
		
		Scanner scEntrada = new Scanner(System.in);
		int iHoras,iPrecioHoras,iHorasExtra; 
		
		/* dPrimerImpuesto para los primeros 400
		 * dSegundoImpuesto para cuando es más de 900 de salario
		 * */
		
		double dSalarioB = 0 , dImpuestos = 0, dSalarioN = 0, 
				dPrimerImpuesto = 0 , dPrecioHorasExtra, dSegundoImpuesto;
		
		System.out.print("Horas trabajadas esta semana: ");
		iHoras = scEntrada.nextInt();	
		System.out.print("Precio hora tarifa normal: ");
		iPrecioHoras = scEntrada.nextInt();
		scEntrada.close();
		
		//Calcula según se hayan trabajado más de 35h o no.
		if(iHoras <=35) {
			dSalarioB = (iHoras * iPrecioHoras);
		} else if (iHoras >35) {
			iHorasExtra = (iHoras - 35);
			dPrecioHorasExtra = iPrecioHoras * 1.5;
			dSalarioB = (iHoras * iPrecioHoras) + (iHorasExtra * dPrecioHorasExtra);
			
		}
		//Calcula el impuesto de los primeros 400, pero si pasa ese umbral se omite
		//(No me da tiempo a hacer el if de + de 900 de salario )
		if (dSalarioB > 500 && dSalarioB <= 900) {
			
			dImpuestos = ((dSalarioB - 500)*0.25);
			dSalarioN = dSalarioB - dImpuestos;
		}
		
			System.out.print("El salario bruto es: " + dSalarioB 
					+ " Los impuestos son: " + dImpuestos + 
					" El salario neto es: " + dSalarioN);
		scEntrada.close();}
}
	
	
	
	
	
		
		
		
	


