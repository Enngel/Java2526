package tema1;

public class Ejercicio40TiposConver {

	public static void main(String[] args) {
		//Tipos básicos
		byte edad = 30;
		char inicial = 'A';
		double altura =1.74;
		boolean esEstudiante = true;
		System.out.println("esEstudiante: "+ esEstudiante);
		System.out.println("edad: " + edad);
		System.out.println("inicial: " + inicial);
		System.out.println("altura: " + altura);
		
		//32 bits double 64 bits
		int iNum = 2;
		System.out.println("iNum: " + iNum);
		double dNum= iNum;
		System.out.println("dNum: " + dNum);
		//paso de double a int
		double dNum2 = 5.28;
		int iNum2 = (int)dNum2;
		System.out.println("iNum2: " + iNum2);
		

	}

}
