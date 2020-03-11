
public class Camion extends Vehiculo {
	private int altura;
	private Remolque remolque;
	
	//public Camion(String matricula,String tipo,int velocidadMaxima,Remolque remolque) {
		//setMatricula(matricula);
		//setTipo(tipo);
		//setVelocidadMaxima(velocidadMaxima);
		//this.remolque = remolque;
	//}//Camión
	
	public Camion(String matricula, String tipo,int velocidadMaxima,int altura) {
		super(matricula, tipo, velocidadMaxima);
		this.altura = altura;
	}//
	
	public Remolque getRemolque() {
		return remolque;
	}//getRemolque
	
	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}//setRemolque
	
	//public void mostrarDatos() {
		//super.mostrarDatos();
		//System.out.printf("Altura: %d\nRemolque: %s\n", altura,remolque);
	//}//mostrarDatos
	 public void mostrarDatos() {
		 System.out.printf("Matricula: %s\nTipo: %s\nVelocidad Máxima: %d\nAltura: %d\n",getMatricula(),getTipo(),getVelocidadMaxima(),altura);
	 }
}//class
