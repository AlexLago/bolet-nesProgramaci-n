/*
 * Ejercicio 2:
 * Dado el siguiente array, realizar la ordenación e impresión del array resultado. 
 * int[] arrayDesordenado= {121,24,1,258,0,-3,8} 
 * Realizarlo con dos métodos. 
 * 		-Uno para ordenar el array y otro para la impresión. 
 * 		-Deberá realizarse ‘a mano‘ y no mediante ningún método de ordenación como sort. 
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
		int posicionInsertar = 0; //posición de arrayOrdenado donde se insertará.
		int valorMaximo = Integer.MIN_VALUE; //valor que se insertará al final con el elemento mas pequeño entre todos.
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