import java.time.LocalDate;
//import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Persona {
	String Nombre;
	String Apellidos;
	LocalDate fechaNacimiento;
	int Estatura;
	
	public Persona(String aNombre,String aApellidos,LocalDate afechaNacimiento,int aEstatura) {
		Nombre = aNombre;
		Apellidos = aApellidos;
		fechaNacimiento = afechaNacimiento;
		Estatura = aEstatura; 
	}//Persona
	
	public void mostrarDatos() {
		System.out.println("Su nombre es: "+Nombre);
		System.out.println("Sus apellidos son: "+Apellidos);
		System.out.println("Nació el: "+fechaNacimiento);
		System.out.printf("Mide: %dcm\n\n",Estatura);
		System.out.printf("Edad: %d años\n\n",obtenerEdad());//Coge el "fechaNacimiento" de la clase Persona y lo usa en obtenerEdad
	}//mostrarDatos
	
	public int obtenerEdad() {
		LocalDate ahora = LocalDate.now();
		//Period periodo = Period.between(fechaNacimiento, ahora);
		
		return (int)ChronoUnit.YEARS.between(fechaNacimiento, ahora);//Coge directamente de la clase persona
	}//obtenerEdad
}//class
