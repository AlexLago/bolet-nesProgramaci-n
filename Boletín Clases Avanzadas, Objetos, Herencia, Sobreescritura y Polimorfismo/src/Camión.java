
public class Cami�n extends Veh�culo {
	private int altura;
	private Remolque remolque;
	
	public Cami�n(String matricula,String tipo,int velocidadMaxima,Remolque remolque) {
		setMatricula(matricula);
		setTipo(tipo);
		setVelocidadMaxima(velocidadMaxima);
		this.remolque = remolque;
	}//Cami�n
	
	public void mostrarDatos() {
		System.out.printf("Altura: %d\nRemolque: %d\n", altura,remolque);
	}
}//class
