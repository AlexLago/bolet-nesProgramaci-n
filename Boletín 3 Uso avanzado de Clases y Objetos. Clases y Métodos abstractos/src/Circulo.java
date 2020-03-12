
public class Circulo extends Figura{
	private int radio;
	private int PI;
	
	public int getRadio() {
		return radio;
	}//getRadio
	
	public void setRadio(int radio) {
		this.radio = radio;
	}//setRadio
	
	public int getPI() {
		return PI;
	}//getPI
	
	public void setPI(int PI) {
		this.PI = PI;
	}//setPI
	
	public Circulo(int radio,int PI) {
		setRadio(radio);
		setPI(PI);
	}//Circulo
}//Figura
