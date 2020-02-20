import java.util.Scanner;

public class Tri�ngulo {
	double area;
	double base;
	double altura;
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
	}//obtenerDatosTriangulo
	
	public void obtenerArea() {
		area = (base*altura)/2;
	}//obtenerArea
	
	public void mostrarDatos() {
		System.out.println("El �rea del tri�ngulo es "+area);
	}
}//Tri�ngulo
