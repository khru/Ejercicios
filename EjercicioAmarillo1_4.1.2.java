package programación421;

import java.util.Scanner;

/**
 * @author Emmanuel Valverde Ramos
 */
public class EjercicioAmarillo1 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int vec[] = new int [10];
		try
		{
			for(int i  = 0;i < vec.length;i++)
			{
				System.out.println("Introduce el valor que quieres que tenga la siguiente posición en el array: ");
				vec[i] = teclado.nextInt();
			}
			for (int i = 0;i < vec.length;i++)
			{
				System.out.println("El valor de la posición "+i+" es: "+vec[i]);
			}
		}
		catch(Exception Entero)
		{
			System.out.println("El parametro introducido no es correcto");
		}
		
		teclado.close();
	}

}
