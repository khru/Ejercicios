import java.util.Scanner;

public class RomboBuffer 
{
	public static void main(String[] args) 
	{
		String buffer=" ";// variable principal
		int cantidad = 0;
		System.out.println("Introduce la cantidad de lineas que quieres");
		cantidad = new Scanner(System.in).nextInt();
		int aux = cantidad;
		if(cantidad % 2 == 1)
		{
			//cantidad /= 2;
			//int aux = cantidad;
			for (int i = 1; i <= aux; i++) //numero de veces que se tiene que repeticiones
			{
				
				aux --;
				buffer = blanco(aux);
				buffer += asterisco(i);
				System.out.println(buffer);
				buffer = " "; 
			}
			for(int i = aux; i >= 1; i--)
			{
				buffer = blanco(aux+1) + asterisco(i);
				System.out.println(buffer);
				buffer = " ";
				aux ++;
			}
		}
		else
		{
			System.out.println("No es un número impar");
		}
		
	}
	public static String blanco(int aux)
	{
		String buffer = "";
		for (int j = aux; j>=0; j--) 
		{ 
			buffer = buffer + " "; 
		}
		aux --;
		return buffer; 
	}
	public static String asterisco(int i)
	{
		String buffer = "";
		for(int j=1; j<=i*2-1;j++) 
		{ 
			buffer += "*"; 
		} 
		return buffer;
	}
}
