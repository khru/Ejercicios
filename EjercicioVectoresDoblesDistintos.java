package Programación412;
/**
 * @author khru
 */
public class EjercicioLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int vec1[][] = {{1,2,3,4},
			       {5,6},
			       {7,8,9}};
		for(int i = 0;i < vec1.length;i++)
		{
			for(int j = 0;j < vec1[i].length;j++)
			{
				System.out.println(vec1[i][j]);
			}
		}
	}
}
