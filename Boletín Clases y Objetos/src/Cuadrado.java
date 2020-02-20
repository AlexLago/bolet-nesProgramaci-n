import java.util.Scanner;

public class Cuadrado {
	double lado1;
	double lado2;
	double area;
	boolean valorCorrecto = false;
	
	Scanner s = new Scanner(System.in);
	
	public void obtenerDatos(){
		System.out.println("Inserte el lado vertical");
		do {			
			if(s.hasNextDouble()) {
				lado1 = s.nextDouble();
				valorCorrecto = true;				
				if(lado1>0) {
					valorCorrecto = true;
				}//if
				else {
					valorCorrecto = false;
				}//else
			}//if
			else {
				s.next();
				valorCorrecto = false;
			}//else
		}while(!valorCorrecto);
		System.out.println("Inserte el lado horizontal");
		do {			
			if(s.hasNextDouble()) {
				lado2 = s.nextDouble();
				valorCorrecto = true;				
				if(lado2>0) {
					valorCorrecto = true;
				}//if
				else {
					valorCorrecto = false;
				}//else
			}//if
			else {
				s.next();
				valorCorrecto = false;
			}//else
		}while(!valorCorrecto);
	}//obtenerDatos
	
	public void obtenerArea() {
		area = lado1*lado2;
	}//obtenerArea
	
	public void mostrarDatos() {
		System.out.println("El área del cuadrado es "+area);
	}
}//Cuadrado
