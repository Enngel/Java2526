package Tema_3_POO_LigaFurgol;

public class ObjetoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Objeto  o1= new Objeto("rojo");
		
		Objeto o2 = o1;
		
		
		System.out.println(o2.getColor());
		System.out.println(o1.getColor());
		
		o1.setColor("Verde");
		o2.setColor("Amarillo");
		
		System.out.println("Color final: " + o1.getColor());
		
		
		
	}

}
