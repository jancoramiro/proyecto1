package herramientas;

public class Animal {
	int cantidadPatas;
	boolean tienePelaje;
	String nombreEspecie;
	String nombrePropietario;
	
	public Animal() {
		cantidadPatas = 4;
	}
	
	public Animal(int cantPatas) {
		cantidadPatas = cantPatas;
	}
	
	public Animal(int cant, String nombreEsp) {
		cantidadPatas = cant;
		nombreEspecie = nombreEsp;
	}
	public Animal(String nEspecie) {
		nombreEspecie = nEspecie;
	}

	
	public Animal(int cantidadPatas, boolean tienePelaje, String nombreEspecie, String nombrePropietario) {
		this.cantidadPatas = cantidadPatas;
		this.tienePelaje = tienePelaje;
		this.nombreEspecie = nombreEspecie;
		this.nombrePropietario = nombrePropietario;
	}

	public int getCantidadPatas() {
		return cantidadPatas;
	}

	public void setCantidadPatas(int cantidadPatas) {
		if(cantidadPatas > 0 && cantidadPatas < 10)
			this.cantidadPatas = cantidadPatas;
		else
			this.cantidadPatas = 4;
	}

	public boolean isTienePelaje() {
		return tienePelaje;
	}

	public void setTienePelaje(boolean tienePelaje) {
		this.tienePelaje = tienePelaje;
	}

	public String getNombreEspecie() {
		return nombreEspecie;
	}

	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}
	

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public void moverse() {
		System.out.println("Con mis " + cantidadPatas + " patitas, me muevo.");
	}
	
	public void comer() {
		System.out.println("Estoy comiendo");
	}
	
	public String toString() {
		String txt = "";
		txt = "Un "+ nombreEspecie + " que cuenta con " + cantidadPatas + " patas.";
		return txt;
	}

}
