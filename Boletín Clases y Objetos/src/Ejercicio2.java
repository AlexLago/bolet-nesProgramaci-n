/*
 * Realiza un programa que, mediante un men�, nos ofrezca calcular el �rea de las siguientes figuras:
 * 	-Area del tri�ngulo: (base*altura)/2
 * 	-Area del cuadrado: (lado*lado)
 * 	-Area del rect�ngulo: (base*altura)
 * 	-Area del rombo: (diagonalMayor*diagonalMenor)/2
 * 
 * Crea dicho programa siguiendo la estructura de clases de la POO con una clase para cada tipo de objeto representado.
 */
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int opcion = 0;
		boolean valorCorrecto=false;
		boolean permitir=false;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("�Que �rea desea calcular?\n\n--�rea de un tri�ngulo(1)\n--�rea de un cuadrado(2)\n--�rea de un rect�ngulo(3)\n--�rea de un rombo(4)\n--Finalizar(0)\n\n");
			do {			
				if(s.hasNextDouble()) {
					opcion = s.nextInt();
					valorCorrecto = false;				
					if(opcion>=0) {
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
			switch(opcion) {
				case 1:
					Tri�ngulo tri = new Tri�ngulo();
					tri.obtenerDatos();
					tri.obtenerArea();
					tri.mostrarDatos();
					
					break;//case1--Tri�ngulo
				case 2:
					Cuadrado cua = new Cuadrado();
					cua.obtenerDatos();
					cua.obtenerArea();
					cua.mostrarDatos();
					
					break;//case2--Cuadrado
				case 3:
					Rect�ngulo rec = new Rect�ngulo();
					rec.obtenerDatos();
					rec.obtenerArea();
					rec.mostrarDatos();
					
					break;//case3--Rect�ngulo
				case 4:
					Rombo rom = new Rombo();
					rom.obtenerDatos();
					rom.obtenerArea();
					rom.mostrarDatos();
					
					break;//case4--Rombo
				case 0:
					permitir = true;
					
					break;//case0--Cerrar
				default:
					System.out.println("Error, no has seleccionado bien una opci�n");
					
					break;
			}//opcion
		}while(!permitir);
		System.out.println("fuera");
		s.close();
	}//main
}//class
