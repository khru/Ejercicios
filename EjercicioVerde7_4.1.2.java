package Programación412;
/**
 * @author khru
 */
public class EjercicioVerde7 
{
	public static void main(String[] args) 
	{
		int vec[] = {5,1,2,3,5,1,4,5,6,3,5,4,2,5,5,5};
		int masfrecuente = 0;
		masfrecuente = masFrecuenteInt(vec);
		System.out.println(masfrecuente);	
	}
	/**
	 * @param vec
	 * @return cont
	 */
	static int masFrecuenteInt(int vec[])
	{
		int moda = 0, cont = 0;
		for(int i = 1;i < vec.length ;i++)
		{
			int masfrecuente = 1;
			for(int j = i -1;j < vec.length;j++)
			{
				if (vec[j] == vec[i])
				{
					masfrecuente++;
				}
			}
			if(masfrecuente > moda)
			{
				moda = masfrecuente;
				cont = vec[i];
			}
		}
		System.out.println("El "+cont+" se repite: " + moda);
		return cont;
	}
}
