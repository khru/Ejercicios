package programación116;
import java.util.Scanner;
/**
 * @author khru
 */
public class Triangulo 
{
	public static void triangulo()
	{ //metodo triangulo 
		String buffer=""; 
		int cantidad;
		Scanner teclado = new Scanner(System.in);
		cantidad = teclado.nextInt();
		int aux = cantidad;  
		for (int i = 0; i <= cantidad; i++) 
		{ 
			buffer = blanco(aux) + asterisco(i);
			System.out.println(buffer);
			aux --;
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
	public static void main(String[] arg)
	{ 
		triangulo(); 
	}
	public static void error()
	{
		System.out.println("Parametro introducido erroneo");
	}
}
