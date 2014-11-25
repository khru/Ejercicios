/**
 * Este es el paquete de ejecicios 4.1.2
 */
package programación421;
import java.util.Arrays;
/**
 * @author khru
 */
public class EjercicioVerde1 
{

	public static void main(String[] args) 
	{
		int vec[] =  {8,5,6,4};
		int vec1[] = {8,5,6,5};
		boolean b = Arrays.equals(vec, vec1);
		if(b == false)
		{
			System.out.println("No son iguales");
		}
		else
		{
			System.out.println("Son iguales");
		}
	}
}
