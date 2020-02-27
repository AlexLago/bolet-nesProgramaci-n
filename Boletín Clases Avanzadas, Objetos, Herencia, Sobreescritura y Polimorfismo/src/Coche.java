
public class Coche extends Vehículo{
	private int numeroPlazas;
	
	public Coche(String matricula,String tipo,int velocidadMaxima,int numeroPlazas) {
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(velocidadMaxima);
		this.numeroPlazas = numeroPlazas;
	}//Coche
}//class
