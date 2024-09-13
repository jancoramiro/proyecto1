package herramientas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad;
		cantidad=4;
		int edad=18;
		edad=20;
		//System.out.println(edad);
		//System.out.println(cantidad);
		int [] numeros=new int[4];
		try {
			numeros[2]=10;
			numeros[4]=23;
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Ocurrio un error de desbordamiento de la indice en el arreglo");
			System.out.println(e);
			//numeros[3]=23;			
		}
		System.out.println("La ejecucion sigue");
		System.out.println(numeros[0]);
	}

}
