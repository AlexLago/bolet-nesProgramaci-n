
public class Ejercicio1 {
	public static void main(String[] args) {
		//Vehículo vehiculo = new Vehículo();
		//vehiculo.mostrarDatos();
		
		//Coche coche = new Coche(null, null, 0, 0);
		
		//coche.mostrarDatos();
		//Conductor cond= new Conductor("123456H", "Fernando");
	
		Camión camion = new Camión(null, null, 0, null);
		//camion.setConductor(cond);
		//camion.mostrarDatos();
		Remolque remolq = new Remolque();
		remolq.matricula="555-asd";
		remolq.longitud= 2;
		camion.setRemolque(remolq);
		camion.mostrarDatos();
		
	}//main
}//class
