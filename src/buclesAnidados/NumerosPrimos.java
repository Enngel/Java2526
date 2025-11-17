package buclesAnidados;

public class NumerosPrimos {

	public static void main(String[] args) {
		//Generar los primeros 20 primos
		//Sin usar funciones, ni break, ni exit
		boolean esPrimo = true;
		int iContador=0;
		int iNum2=0;
			
		for(int i = 2 ; i<1000;i++) {
			iNum2++;
			if(iNum2 % i == 0) {
				iContador++;
			}
			if(iContador == 20) {
				i=1000;
				System.out.println(iNum2);

			}
		}
		
	}

}
