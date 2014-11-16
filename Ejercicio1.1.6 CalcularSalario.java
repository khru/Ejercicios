/**
 * 
 */
package programación116;

import java.util.Scanner;

/**
 * @author khru
 *
 */
public class CalcularSalario 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int horas, sueldo;
		String salir = "";
		do
		{
			System.out.println("Introduce el número de horas trabajadas esta semana:");
			horas = teclado.nextInt();
			sueldo = CalcularSalario(horas);
			System.out.println(sueldo);
			System.out.println("Quieres continuar(S/N): ");
			salir = new Scanner(System.in).nextLine().toUpperCase();
		}while(!salir.equals("N"));
	}
	public static int CalcularSalario(int horas)
	{
		int TOTALHORAS = 35, SALARIO = 15, SALARIOEXTRA = 22, sueldo = 0, tiempo;
		if(horas <= 0)
		{
			error();	
		}
		else if(horas > TOTALHORAS)
		{
			tiempo = horas - TOTALHORAS;
			sueldo = (tiempo * SALARIOEXTRA) + (TOTALHORAS * SALARIO);
		}
		else
		{
			sueldo = horas * SALARIO;
		}
		return sueldo;
	}
	public static void error()
	{
		System.out.println("No puede trabajar 0 horas o menos y querer cobrar");
	}
}
