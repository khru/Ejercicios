package Programación412;

/**
 * @author khru
 *
 */
public class EjercicioVerde5 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int vec[] = {1,2,3,4,5,6,7,8,9,0};
		int num = 5;
		buscarInt(vec, num);
	}
	/**
	 * 
	 * @param vec
	 * @param num
	 */
	static void buscarInt(int vec[], int num)
	{
		int cont = 0;
		for(int i = 0;(i < vec.length) && (vec[i] != num);i++)
		{
			cont++;
			/*if(vec[i] == num)
			{
				System.out.println(i);
				break;
			}
			System.out.println(i);*/
		}
		System.out.println(cont);
	}

}
