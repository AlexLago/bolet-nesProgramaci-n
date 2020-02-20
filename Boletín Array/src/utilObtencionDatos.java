
import java.util.Scanner;

public class UtilObtencionDatos {

	/**
	 * Función que obtiene de consola un valor numérico entero
	 * Si el usuario introduce un valor que no es numérico entero se sigue 
	 * preguntando al usuario
	 * @return El valor numérico entero obtenido del usuario
	 */
	public static int obtenerValorEntero() {
		int valor=0;
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println("Introduce un valor numérico entero: ");
			
			if(sc.hasNextInt())
			{
				valor = sc.nextInt();
				valorCorrecto=true;
			}
			else
			{
				sc.next();
				valorCorrecto = false;
			}
		}
		return valor;
	}//obtenerValorEntero
	
	
	/**
	 * Función que obtiene de consola un valor numérico entero entre dos valores
	 * Se utiliza con menús, para obtener un valor entre los indicados
	 * @param mensajeMenu mensaje del menú que se mostrará
	 * @param numeroMenor menor número a elegir
	 * @param numeroMayor mayor número a elegir
	 * @return valor elegido de entre los posibles
	 */
	public static int obtenerValorMenu(String mensajeMenu,int numeroMenor,int numeroMayor) {
		int valor=0;
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println(mensajeMenu);
			
			if(sc.hasNextInt())
			{
				valor = sc.nextInt();
				if(valor>=numeroMenor && valor<=numeroMayor)
					valorCorrecto=true;
				else
				{
					System.out.println("Debe escogerse un valor entre los indicados en el menú");
					valorCorrecto=false;
				}
			}
			else
			{
				sc.next();
				valorCorrecto = false;
			}
		}
		return valor;
	}//obtenerValorMenu
	
	/**
	 * Función que obtiene de consola un valor numérico entero y positivo
	 * Si el usuario introduce un valor que no es numérico entero positivo se sigue 
	 * preguntando al usuario
	 * @return El valor numérico entero positivo obtenido del usuario
	 */
	public static int obtenerValorEnteroPositivo() {
		int valor=0;
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println("Introduce un valor numérico entero positivo: ");
			
			if(sc.hasNextInt())
			{
				valor = sc.nextInt();
				if(valor>0)
					valorCorrecto=true;
				else
					valorCorrecto=false;
			}
			else
			{
				sc.next();
				valorCorrecto = false;
			}
		}
		return valor;
	}//obtenerValorEnteroPositivo
	
	
	public static String obtenerValorCadena() {
		System.out.println("Introduce un valor: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}//obtenerValorCadena

	public static char obtenerValorCaracter() {
		String valorIntroducido = "";
		boolean valorCorrecto = false;

		Scanner sc = new Scanner(System.in);
		
		while (valorCorrecto == false) {
			System.out.println("Introduce un caracter: ");
			
			valorIntroducido = sc.nextLine();
			if (valorIntroducido.length() == 1)
				valorCorrecto = true;
			else
				valorCorrecto = false;
		}
		return valorIntroducido.charAt(0);
	}//obtenerValorCaracter
}//UtilObtencionDatos