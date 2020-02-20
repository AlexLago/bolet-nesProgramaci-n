/*
 * Ejercicio 2:
 * Dado el siguiente array, realizar la ordenaci�n e impresi�n del array resultado. 
 * int[] arrayDesordenado= {121,24,1,258,0,-3,8} 
 * Realizarlo con dos m�todos. 
 * 		-Uno para ordenar el array y otro para la impresi�n. 
 * 		-Deber� realizarse �a mano� y no mediante ning�n m�todo de ordenaci�n como sort. 
 */
import java.util.Arrays;
import java.util.BitSet;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] arrayDesordenado = {121,24,1,258,-3,-3,8};
		imprimirArray(ordenarArrayPares(arrayDesordenado));//Con esto pedira que el resultado de "ordenarArrayPares" con el 
		//producto "arrayDesordenado" lo envie a "imprimirArray"
		Arrays.sort(arrayDesordenado);//Arrays.sort(x) lo que hace es ordenar alfabeticamente y/o numericamente "x"
		imprimirArray(arrayDesordenado);
	}//main
	
	public static int[] ordenarArray(int[] arrayDesordenado) { //DUDA COMO FUNCIONA
		//int[] arrayDesordenado = {121,24,1,258,-3,-3,8};
		int[] arrayOrdenado = new int[arrayDesordenado.length];//El .lenght nos devuelve el numero de elementos en el array
		int posicionInsertar = 0; //posici�n de arrayOrdenado donde se insertar�.
		int valorMaximo = Integer.MIN_VALUE; //valor que se insertar� al final con el elemento mas peque�o entre todos.
		int posValorMaximo = 0;//Inicia la variable
		
		for(int i=0;i<arrayDesordenado.length;i++) {
			valorMaximo = Integer.MIN_VALUE;
			posValorMaximo = -1;
			
			for(int j=0;j<arrayDesordenado.length;j++) {
				if(valorMaximo<arrayDesordenado[j]){
					valorMaximo=arrayDesordenado[j];
					posValorMaximo=j;
				}//if
			}//for
			arrayOrdenado[posicionInsertar]=valorMaximo;
			posicionInsertar++;
			arrayDesordenado[posValorMaximo]=Integer.MIN_VALUE;
		}//for
		return arrayOrdenado;
	}//ordenarArray
	
	public static int[] ordenarArrayPares(int[] arrayDesordenado) {
		//int[] arrayDesordenado= {121,24,1,258,0,-3,8}
		
		for(int i=0;i<arrayDesordenado.length;i++) {
			for(int j=i+1;j<arrayDesordenado.length;j++) {
				if(arrayDesordenado[i]<arrayDesordenado[j]) {
					int aux=arrayDesordenado[j];
					arrayDesordenado[j]=arrayDesordenado[i];
					arrayDesordenado[i]=aux;
				}//if
			}//for
		}//for
		return arrayDesordenado;
 	}//ordenarArrayPares
	
	public static void imprimirArray(int[] array) {
		System.out.println("El array ordenado es \n");
		for(int c:array) {
			System.out.println(" "+c);
		}//for
	}//imprimirArray
	}//class