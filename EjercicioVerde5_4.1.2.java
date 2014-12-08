package Programación412;
/**
 * @author khru
 */
public class EjercicioVerde5 
{
	public static void main(String[] args)
	{
		int vec[] = {1,2,3,4,5,6,7,8,9,0};
		int num = 5;
		int intbuscado;
		intbuscado = buscarInt(vec, num);
		if(intbuscado == -1)
		{
			System.out.println("El número no se encuentra en el Array");
		}
		else
		{
			System.out.println("La primera instancia esta en la posición "+intbuscado);
		}
	}
	/**
	 * @param vec
	 * @param num
	 */
	static int buscarInt(int vec[], int num)
	{
		for(int i = 0;i < vec.length;i++)
		{
			if(vec[i] == num)
			{
				return i;
			}
		}
		return -1;
	}
}
