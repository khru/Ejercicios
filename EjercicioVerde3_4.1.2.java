package Programación412;
import java.util.*;
/**
 * @author khru
 *
 */
public class EjercicioVerde3 
{
	public static void main(String[] args) 
	{
		int compararvectorchar = 0;
		char vec[] = {'*','c','d'};
		char vec1[] = {'*', 'c','d'};
		if(vec.length != vec1.length)
		{
			System.out.println("La longitud de los vectores es distinta, no se puede calcular");
		}
		else
		{
			compararvectorchar = comparaVectorChar(vec,vec1);
			System.out.println(compararvectorchar);
		}
	}
	/**
	 * 
	 * @param vec
	 * @param vec1
	 */
	static int comparaVectorChar(char vec[], char vec1[])
	{	
		boolean iguales = Arrays.equals(vec, vec1);
			if(iguales == false)
			{
				System.out.println("Los son diferentes");
				for(int i = 0;i < vec.length;i++)
				{
					if((int)vec[i] > (int)vec1[i])
						{
							return 1;
						}
					else if((int)vec[i] < (int)vec1[i])
					{
						return -1;
					}
				}
				return 0;
			}
			else
			{
				System.out.println("Los vectores son iguales");
				return 0;
			}
	}
}
}
