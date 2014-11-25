/**
 * Este paquete es el de la practica de arrays
 */
package programación421;

/**
 * @author khru
 */
public class EjercicioAmarillo2 
{

	public static void main(String[] args) 
	{
		int vec[] = new int[20];
		for(int i = 0;i < vec.length;i++)
		{
			vec[i] = i * 5;
		}
		for(int i = 0;i < vec.length;i++)
		{
			System.out.println("El valor del array en la posición "+i+" es: "+vec[i]);
		}
	}

}
