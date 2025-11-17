package buclesAnidados;

public class Ejercicio13Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str1 = "Nombre";
		String str2 = "Nombre";
	
		//ESTA EN OTRO ESPACIO EN MEMORIA
		String str3 = new String("Nombre");
		//////////////////////////////////
		///Cuando es == DA IGUAL EL VALOR
		///
		String str4 = "nombre";
	
		System.out.print(str1.equals(str2));
	}

}
