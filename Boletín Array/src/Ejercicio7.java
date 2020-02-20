import java.util.Arrays;
import util.UtilObtencionDatos;
/*Realizar un programa que pida 5 números, los introduzca en un array, pida un nuevo número y nos indique
 * si está en el array.
 * Realizarlo primero sin el uso de los métodos de ordenación y búsqueda de la clase Arrays y luego 
 * mediante estos métodos.
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		int[] valoresArray;
		int numero;
		
		valoresArray = obtenerValoresArray();
		numero = obtenerValorNumero();
		
		//Comentar/Descomentar cada llamada para probarlo
		//if (existeNumeroArray(numero, valoresArray)){
		if(existeNumeroArrayUsandoUtilidades(numero, valoresArray)) {
			System.out.printf("El número %d SI existe en el array %s", numero, Arrays.toString(valoresArray));
		}//if
		else {
			System.out.printf("El número %d NO existe en el array %s", numero, Arrays.toString(valoresArray));
		}//else
	}//main
	
	private static int[] obtenerValoresArray() {
		int[] valores = new int[5];
		for (int i=0;i<5;i++) {
			System.out.printf("Indica el valor %d del array:", i + 1);
			valores[i] = UtilObtencionDatos.obtenerValorEntero();
		}//for
		return valores;
	}//obtenerValoresArray
	
	private static int obtenerValorNumero() {
		System.out.println("Indica el valor a buscar");
		return UtilObtencionDatos.obtenerValorEntero();
	}//obtenerValorNumero
	
	//Busqueda sin usar los métodos de Arrays
	private static boolean existeNumeroArray(int numero, int[] arrayBuscar) {
		boolean resultado = false;
		for (int i=0;i<arrayBuscar.length;i++) {
			if(arrayBuscar[i] == numero) {
				resultado = true;
				break;
			}//if
		}//for
		return resultado;
	}//existeNumeroArray
	
	//Busqueda usando los métodos de Arrays
	private static boolean existeNumeroArrayUsandoUtilidades(int numero, int[] arrayBuscar) {
		//para poder usar la búsqueda binaria primero hay que ordenar el array
		Arrays.sort(arrayBuscar);
		//Ahora ya se puede usar la búsqueda binaria
		return (Arrays.binarySearch(arrayBuscar, numero)>=0);//Si encuentra devuelve la posición. Si no devuelve un valor <0
	}//existeNumeroArrayUsandoUtilidades
}//class
