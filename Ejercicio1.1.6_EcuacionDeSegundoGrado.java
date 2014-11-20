package programación116;

import java.util.Scanner;

/**
 * @author khru
 *
 */
public class EcuacionSegundogrado 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int a,b,c;
		try
		{
			System.out.println("Calculo de ecuación de segundo grado");
			System.out.println("Introduce el valor de a");
			a = teclado.nextInt();
			System.out.println("Introduce el valor de b");
			b = teclado.nextInt();
			System.out.println("Introduce el valor de c");
			c = teclado.nextInt();
			ecuacionSegundoGrado(a,b,c);
		}
		catch (Exception e)
		{
			error();
		}
	}
	public static void ecuacionSegundoGrado(int a, int b ,int c)
	{
		 double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
	     double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
		System.out.println(x1);
		System.out.println(x2);
	}
	public static void error()
	{
		System.out.println("El parametro introducido es errone");
	}

}
