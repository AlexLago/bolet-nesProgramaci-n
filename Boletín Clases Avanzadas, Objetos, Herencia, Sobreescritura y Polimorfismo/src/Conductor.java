
public class Conductor {
	public String dni;
	public String nombre;
	
	public Conductor(String dni,String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}//Conductor
	
	@Override
	public String toString() {
		String mensaje="\n*DNI: "+dni+"\n*Nombre: "+nombre;
		return mensaje;
	}//toString
}//class
