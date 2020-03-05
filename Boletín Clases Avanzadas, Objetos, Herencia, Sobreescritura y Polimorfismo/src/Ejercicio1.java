
public class Ejercicio1 {
	public static void main(String[] args) {
		//Vehículo vehiculo = new Vehículo();
		//vehiculo.mostrarDatos();
		
		Coche coche = new Coche(null, null, 0, 0);
		
		//coche.mostrarDatos();
		Conductor cond= new Conductor("123456y","alex");
		coche.setConductor(cond);
		Camion camion = new Camion(null, null, 0, null);
		//camion.setConductor(cond);
		//camion.mostrarDatos();
		Remolque remolq = new Remolque();
		remolq.matricula="555-asd";
		remolq.longitud= 2;
		camion.setRemolque(remolq);
		//camion.mostrarDatos();
		Ejercicio1 ej= new Ejercicio1();
		
		ej.impresionPoliformismo(camion);
		
		ej.impresionPoliformismo(coche);
		
		Ejercicio1.impresionPoliformismo2(coche);
	}//main
	
	void impresionPoliformismo(Vehiculo vehi) {
		vehi.mostrarDatos();

	}//impresionPoliformismo
	
	
	static void impresionPoliformismo2(Vehiculo vehi) {
		
		if(vehi instanceof Camion) {
			Camion vehCamio=(Camion)vehi;
			System.out.println(vehCamio.getRemolque());
		}//if
		
		
	}//impresionPoliformismo
	
	//if(vehiculo instanceof camion){}//if
	
}//class
