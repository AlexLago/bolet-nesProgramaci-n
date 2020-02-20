import java.util.Arrays;
/*Realiza un programa que permita invertir los elementos de un cierto array de caracteres.
 * Así, por ejemplo, si el array contiene los caracteres de la palabra chocolate, una vez invertido,
 * dicho array contendrá los caracteres etalocohc.
 * El programa visualizara en pantalla el contenido del array tanto antes de invertirlo como después.
 * NOTA: no hace falta pedirle los caracteres al usuario. Directamente creamos el array con los caracteres
 * que queramos (por ejemplo, con los de la palabra chocolate).
 * Intenta hacerlo son utilizar un array adicional. Crea 2 métodos (ademas del main):
 * uno para visualizar un array de caracteres y otro para invertir un array de caracteres.
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		char[] arrayCaract = "Holas".toCharArray();
		
		arrayCaract = reordenarArray(arrayCaract);
		imprimir(arrayCaract);
	}//main
	
	private static char[] reordenarArray(char[] array) {
		int mitad = array.length/2; //DUDA
		for(int i=0;i<mitad;i++) {
			char valorAux;
			valorAux = array[i];
			array[i] = array[array.length-1-i];//DUDA
			array[array.length-1-i] = valorAux;
		}//for
		return array;
	}//reordenarArray
	
	private static void imprimir(char[] array) {
		System.out.println(Arrays.toString(array));
	}//imprimir
}//class
