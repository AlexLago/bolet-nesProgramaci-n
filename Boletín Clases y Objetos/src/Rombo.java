import java.util.Scanner;

public class Rombo {
	double diagonalMayor;
	double diagonalMenor;
	double area;
	boolean valorCorrecto = false;
	
	Scanner s = new Scanner(System.in);
	
	public void obtenerDatos(){
		System.out.println("Inserte el valor de la diagonal Mayor");
		do {			
			if(s.hasNextDouble()) {
				diagonalMayor = s.nextDouble();
				valorCorrecto = true;				
				if(diagonalMayor>0) {
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
		System.out.println("Inserte el valor de la diagonal Menor");
		do {			
			if(s.hasNextDouble()) {
				diagonalMenor = s.nextDouble();
				valorCorrecto = true;				
				if(diagonalMenor>0) {
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
		area = (diagonalMenor*diagonalMayor)/2;
	}//obtenerArea
	
	public void mostrarDatos() {
		System.out.println("El área del rombo es "+area);
	}
}//Rombo
