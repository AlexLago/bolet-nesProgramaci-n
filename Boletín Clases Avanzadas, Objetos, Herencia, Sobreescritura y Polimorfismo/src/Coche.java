
public class Coche extends Vehiculo{
	private int numeroPlazas;
	
	public Coche(String matricula,String tipo,int velocidadMaxima,int numeroPlazas) {
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(velocidadMaxima);
		this.numeroPlazas = numeroPlazas;
	}//Coche
	
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.printf("Numero de Plaza: %s\n", numeroPlazas);
	}//mostrarDatos
}//class

