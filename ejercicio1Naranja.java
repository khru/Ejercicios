/**
 * Paquete de ejercicios de programación 4.2.2 de Strings 
 * puntos importantes:
 *  - StringBuilder
 *  	Constructores:
 *  --------------------------------------------------
 *  1-
 *  		StringBuilder() //Crea un StringBuilder vacío.
 *			StringBuilder sb = new StringBuilder ();  
 *	2-
 *			StringBuilder(int n) //Crea un StringBuilder vacío con capacidad para n caracteres. 
 *	3-
 *			StringBuilder(String s); // Crea un StringBuilder y le asigna el contenido del String s.
 *			String s = "ejemplo";
 *			StringBuilder sb = new StringBuilder (s);   
 *	---------------------------------------------------	 
 *  	-> StringBuilder.length() //Devuelve el valor de caracteres máximo
 *  	-> StringBuilder.append("Lo que escribas se añade al final del StringBuilder")
 *  	-> StringBuilder.insert(posicin, char)// Inserta X en la posición indicada. X puede ser de cualquier tipo.
 *  	-> StringBuilder.setCharAt(posicion, c) //Cambia el carácter que se encuentra en la posición indicada, por el carácter c.
 *  	-> StringBuilder.charAt(posicion) // Devuelve el carácter que se encuentra en la posición indicada.
 *  	-> StringBuilder.indexOf('caracter') //devuelve la rimera instancia de la letra
 *  	-> StringBuilder.lastIndexOf(‘caracter’) //Devuelve la última instancia de ese caracter
 *  	-> StringBuilder.substring(n1,n2) // Devuelve la subcadena (String) comprendida entre las posiciones n1 y n2 ambas incluidas. Si no se especifica n2, devuelve desde n1 hasta el final.
 *  	-> StringBuilder.delete(inicio, fin) //Elimina los caracteres desde la posición inicio hasta fin.
 *  	-> StringBuilder.reverse() //Invierte el contenido de la cadena
 *  	-> StringBuilder.toString() //Devuelve el String equivalente.
 *  ============================================================================================
 *  - StringBuffer
 */
package programacion422;

/**
 * @author khru
 * 
 */
public class Ejercicio1Naranja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
