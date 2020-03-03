
public class Ejercicio1 {
	public static void main(String[] args) {
		Vehículo vehiculo = new Vehículo();
		vehiculo.mostrarDatos();
		
		Coche coche = new Coche(null, null, 0, 0);
		
		coche.mostrarDatos();
		
		Camión camion = new Camión(null, null, 0, null);
		
		camion.mostrarDatos();
		
	}//main
}//class
