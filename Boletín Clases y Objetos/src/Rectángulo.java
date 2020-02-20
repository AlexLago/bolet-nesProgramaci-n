import java.util.Scanner;

public class Rectángulo {
	double base;
	double altura;
	double area;
	boolean valorCorrecto = false;
	
	Scanner s = new Scanner(System.in);
	
	public void obtenerDatos(){
		System.out.println("Inserte la base");
		do {			
			if(s.hasNextDouble()) {
				base = s.nextDouble();
				valorCorrecto = true;				
				if(base>0) {
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
		System.out.println("Inserte la altura");
		do {			
			if(s.hasNextDouble()) {
				altura = s.nextDouble();
				valorCorrecto = true;				
				if(altura>0) {
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
		area = base*altura;
	}//obtenerArea
	
	public void mostrarDatos() {
		System.out.println("El área del rectángulo es "+area);
	}
}//Rectángulo
