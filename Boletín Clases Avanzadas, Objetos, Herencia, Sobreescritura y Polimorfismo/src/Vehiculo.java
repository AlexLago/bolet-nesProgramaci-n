
public class Vehiculo {
	private String matricula;
	private String tipo;
	private int velocidadMaxima;
	private Conductor conductor;
	
	public String getMatricula() {
		return matricula;
	}//getMatricula
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}//setMatricula
	
	public String getTipo() {
		return tipo;
	}//getTipo
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}//setTipo
	
	public Conductor getConductor() {
		return conductor;
	}//getConductor
	
	public void setConductor(Conductor conductor) {
		this.conductor=conductor;
	}//setConductor
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}//getVelocidadMaxima
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}//setVelocidadMaxima
	
	public void mostrarDatos() {
		System.out.printf("Matricula: %d\nTipo: %d\nVelocidad Máxima: %d\nConductor:%s\n", matricula,tipo,velocidadMaxima,conductor);
	}//mostrarDatos
	
	public Vehiculo(String matricula,String tipo,int velocidadMaxima) {
		this.matricula = matricula;
		this.tipo = tipo;
		this.velocidadMaxima = velocidadMaxima;
	}//Vehiculo
	
	public Vehiculo() {
	}//Vehiculo
	
}//vehículo
