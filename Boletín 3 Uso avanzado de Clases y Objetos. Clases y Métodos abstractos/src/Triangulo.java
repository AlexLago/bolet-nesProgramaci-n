
public class Triangulo implements Figura {
	private int base;
	private int altura;
	
	public int getBase(){
		return base;
	}//getBase
	
	public void setBase(int base) {
		this.base = base;
	}//setBase
	
	public int getAltura() {
		return altura;
	}//getAltura
	
	public void setAltura(int altura) {
		this.altura = altura;
	}//setAltura
	
	public Triangulo(int base,int altura) {
		setBase(base);
		setAltura(altura);
	}//Triangulo
}//Triangulo
