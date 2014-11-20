package programación116;

import java.util.Scanner;

/**
 * @author khru
 *
 */
public class TrianguloVacio 
{
	public static void main(String[] args) 
	{
		Scanner tecldo = new Scanner(System.in);
		String buffer = "";
		int num;
		try
		{
			System.out.println("Introduce un número entero: ");
			num = tecldo.nextInt();
			System.out.println(piramide(num, buffer));
		}
		catch (Exception e)
		{
			System.out.println("Error");
		}
	}
	
	public static String piramide(int num,String buffer)
	{
		buffer = "";
		if(num == 1)
		{
			buffer += "*";
		}
		else{
			for(int i = 1; i <= num;i++)
			{
				for(int j = 1; j <= num-i;j++)
				{
					buffer += " ";
				}
				buffer += "*";
				for(int k = 1; k <= ((2*i)-3);k++)
				{
					buffer += " ";
				}
				if(i > 1)
				{
					buffer += "*";
				}
				buffer += "\n";
				if(i == num-1)
				{
					break;
				}
			}
			for (int i = 1;i <= ((2*num)-1);i+=2)
			{
				buffer += "* ";
			}
		}
		return buffer;
	}
}
