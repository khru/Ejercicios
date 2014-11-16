import java.util.Scanner;

/**
 * @author khru
 *
 */
public class Tabla
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Introduce que tabla deseas visualizar del 1 al 15: ");
		num = teclado.nextInt();
		if((num <= 0) || (num > 15) )
		{
			error();
		}
		else 
		{
			tabla(num);
		}
		
	}
	public static void tabla(int num)
	{
		int multiplicar = 0;
		for(int i = 1;i <= num;i++)
		{
			System.out.println();
			System.out.println("Tabla del "+i);
			for (int j = 1;j < 10;j++)
			{
				multiplicar = i * j;
				System.out.println(i+" * "+j+" = "+ multiplicar);
			}
		}
	}
	public static void error()
	{
		System.out.println("El valor introducido no es valido");
	}

}
