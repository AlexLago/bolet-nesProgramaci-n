
public class Camión extends Vehículo {
	private int altura;
	private Remolque remolque;
	
	public Camión(String matricula,String tipo,int velocidadMaxima,Remolque remolque) {
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(velocidadMaxima);
		this.remolque = remolque;
	}//Camión
	
	public void mostrarDatos() {
		System.out.printf("Altura: %d\nRemolque: %d\n", altura,remolque);
	}
}//class
