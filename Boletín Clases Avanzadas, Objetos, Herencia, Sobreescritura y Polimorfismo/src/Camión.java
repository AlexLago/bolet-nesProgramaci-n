
public class Camión extends Vehículo {
	private int altura;
	private Remolque remolque;
	
	public Camión(String matricula,String tipo,int velocidadMaxima,Remolque remolque) {
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(velocidadMaxima);
		this.remolque = remolque;
	}//Camión
	
	public Remolque getRemolque() {
		return remolque;
	}//getRemolque
	
	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}//setRemolque
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.printf("Altura: %d\nRemolque: %s\n", altura,remolque);
	}//mostrarDatos
}//class
