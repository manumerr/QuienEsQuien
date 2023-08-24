package Principal;

public class Personaje {

	
	private String nombre, trabajo, sexo, pelo, caracteristica;
	private int edad;
	private Boolean nacimiento, riqueza, vivo, familia;
	
	
	
	
	
	//Constructor de la clase
	public Personaje (String nombre, int edad, String trabajo, String sexo, String pelo, String caracteristica, boolean nacimiento,
			boolean riqueza, boolean vivo, boolean familia) {
		this.nombre = nombre;
		this.edad = edad;
		this.trabajo = trabajo;
		this.sexo = sexo;
		this.pelo = pelo;
		this.caracteristica = caracteristica;
		this.nacimiento = nacimiento;
		this.riqueza = riqueza;
		this.vivo = vivo;
		this.familia = familia;
		
		
	}





	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getTrabajo() {
		return trabajo;
	}


	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getPelo() {
		return pelo;
	}


	public void setPelo(String pelo) {
		this.pelo = pelo;
	}


	public String getCaracteristica() {
		return caracteristica;
	}


	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Boolean getNacimiento() {
		return nacimiento;
	}


	public void setNacimiento(Boolean nacimiento) {
		this.nacimiento = nacimiento;
	}


	public Boolean getRiqueza() {
		return riqueza;
	}


	public void setRiqueza(Boolean riqueza) {
		this.riqueza = riqueza;
	}


	public Boolean getVivo() {
		return vivo;
	}


	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}


	public Boolean getFamilia() {
		return familia;
	}


	public void setFamilia(Boolean familia) {
		this.familia = familia;
	}
	
	
	
	
}

