package programación116;

/**
 * @author khru
 *
 */
public class FactorialRecursivo
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(factorial(6));
	}
	//Decalrción de metodos externos
	public static int factorial(int num)
	{
		if (num == 1)
		{
			return 1;
		}
		else
		{
			return num * factorial(num-1);
		}
	}

}
