
public class Veh�culo {
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
		System.out.printf("Matricula: %d\nTipo: %d\nVelocidad M�xima: %d\nConductor:%s\n", matricula,tipo,velocidadMaxima,conductor);
	}//mostrarDatos
	
}//veh�culo
