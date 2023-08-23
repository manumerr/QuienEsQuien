package Principal;

public class Personaje {

	
	private String nombre, trabajo;
	private int edad;
	
	//Constructor de la clase
	public Personaje (String nombre, int edad, String trabajo) {
		this.nombre = nombre;
		this.edad = edad;
		this.trabajo = trabajo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTrabajo() {
		return trabajo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
	
	
	
	
	
}

