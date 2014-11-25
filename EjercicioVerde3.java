import java.util.*;

/**
 * @author khru
 *
 */
public class EjercicioVerde3 
{
	public static void main(String[] args) 
	{
		
		char vec[] = {'*','c','d'};
		char vec1[] = {'*', 'c','d'};
		comparaVectorChar(vec,vec1);
	}
	static void comparaVectorChar(char vec[], char vec1[])
	{
		boolean iguales = Arrays.equals(vec, vec1);
		if(iguales == false)
		{
			System.out.println("No son iguales");
		}
		else
		{
			System.out.println("son iguales");
		}
	}
}
