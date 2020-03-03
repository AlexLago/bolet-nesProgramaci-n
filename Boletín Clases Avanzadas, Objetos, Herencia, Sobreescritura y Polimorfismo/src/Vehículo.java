
public class Vehículo {
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
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}//getVelocidadMaxima
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}//setVelocidadMaxima
	
	public void mostrarDatos() {
		System.out.printf("Matricula: %d\nTipo: %d\nVelocidad Máxima: %d\n", matricula,tipo,velocidadMaxima,conductor);
	}
	
}//vehículo
