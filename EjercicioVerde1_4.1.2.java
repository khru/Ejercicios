package Programación412;
/**
 * @author khru
 */
public class EjercicioVerde1 
{
	public static void main(String[] args) 
	{
		int vec[] = {1,2,3,4,5,6,7,8,9,0,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12};
		//int vec[] = null; COMPROBAiÓN null
		int num = 12;
		buscarRepetido(vec,num);
	}
	
	static void buscarRepetido(int vec[], int num)
	{
		int cont = 0;
		if(vec == null)
		{
			
		}
		else
		{
			for(int i = 0;i < vec.length; i++)
			{
				if(vec[i] == num)
				{
					cont++;
				}
			}
		}
		System.out.println("El numero "+ num + " Se repite "+ cont);
	}
}
