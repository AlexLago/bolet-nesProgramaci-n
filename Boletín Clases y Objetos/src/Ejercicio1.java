import java.time.LocalDate;

/* Apartado 1:
 * Crear la clase "Persona" con los campos necesarios para representar los valores de nombre, apellidos, fecha de nacimiento
 * (ver clase java.util.Date para representarla) y estatura.
 * 
 * Crear tres objetos tipo Persona (en el main) con los siguientes datos:
 * 	-Jose Rodriguez Mata, 15/01/1965, 165cm
 * 	-Mar�a S�nchez G�mez, 26/12/1980, 170cm
 * 	-Alejandro G�mez G�mez, 01/11/2001, 190cm
 * 	-Jose Manuel P�rez, 01/05/2010, 127cm
 * 
 * Apartado 2:
 * Modificar la clase con los m�todos mostrarDatos, que mostrara todos los campos de un objeto instanciado y obtenerEdad que mostrar� la edad
 * actual de la persona instanciada.
 * 
 * Apartado 3:
 * Crear un nuevo constructor para la clase que reciba como par�metros el nombre, apellidos y la edad.
 * 
 * Con este constructor crea dos objetos de tipo persona m�s:
 * 	-Lorena Remeseiro Neira, 12/06/2000, 160cm
 * 	-Patricia Seoane �lvarez, 23/08/1976, 175cm
 * 
 * Apartado 4:
 * Crear un m�todo que recibiendo un array de Personas devuelva los datos de las personas de mayor edad.
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		
		LocalDate fnac= LocalDate.of(1965,1,15);
		Persona p1 = new Persona("Jose","Rodriguez Mata",fnac,165);
		p1.mostrarDatos();
		p1.obtenerEdad();
		
		LocalDate fnac1= LocalDate.of(1980,12,26);
		Persona p2 = new Persona("Mar�a","S�nchez G�mez",fnac1,170);
		p2.mostrarDatos();
		p2.obtenerEdad();
		
		LocalDate fnac2= LocalDate.of(2001,11,01);
		Persona p3 = new Persona("Alejandro","G�mez G�mez",fnac2,190);
		p3.mostrarDatos();
		p3.obtenerEdad();
		
		LocalDate fnac3= LocalDate.of(2010,5,01);
		Persona p4 = new Persona("Jose","Manuel P�rez",fnac3,127);
		p4.mostrarDatos();
		p4.obtenerEdad();
		
		LocalDate fnac4= LocalDate.of(2000,6,12);
		Persona p5 = new Persona("Lorena","Remeseiro Neira",fnac4,160);
		p5.mostrarDatos();
		p5.obtenerEdad();
		
		LocalDate fnac5= LocalDate.of(1976,8,23);
		Persona p6 = new Persona("Patricia","Seoane �lvarez",fnac5,175);
		p6.mostrarDatos();
		p6.obtenerEdad();
		
	}//main
}//class
