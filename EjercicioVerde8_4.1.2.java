package Programación412;
/**
 * @author khru
 */
public class EjercicioVerde8 
{
	public static void main(String[] args) 
	{
		int vec[] = {4,3,1,4,2,5,8};
		int combinacionbuscada[] = {4,2,5,8};
		int cont;
		if(vec.length < combinacionbuscada.length)
		{
			System.out.println("La combinación que usted está buscando no cumple los requisitos para poder ser ejecutada");
		}
		else
		{
			cont = secuenciaInt(vec, combinacionbuscada);
			System.out.println(cont);
		}
	}
	static int secuenciaInt(int vec[], int combinacionbuscada[])
	{
		int cont = 1;
		for(int i = 0;i < vec.length && cont != combinacionbuscada.length;i++)
		{
			if(vec[i] == combinacionbuscada[0])
			{
				for(int j = 1;j < combinacionbuscada.length;j++)
				{
					
					if(vec[i + j] == combinacionbuscada[j] )
					{
						cont++;
					}
				}
			}
		}
		return cont;
		
	}	
}
