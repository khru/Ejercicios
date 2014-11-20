import java.util.Scanner;
public class CesarCasa 
{
	//Funión main
	public static void main(String arg[])
	{
		//declaración de variables
		int i,j,k,num;
		String frase1,frase2;
		frase2 = "";
		String min = "abcdefghijklmnopqrstuvwxyz ";
		String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		Scanner s = new Scanner(System.in);
		
		//Pedir entradas por teclado
		System.out.println("Introduce la frase que deseas cifrar");//Pedir lo que quieres cifrar
		frase1 = s.nextLine();
		//Pedir el número de posiciones que se tiene que mover
		System.out.println("Introduce la clave de cifrado(Es un entero):");
		num = s.nextInt();
		//Necesitamos recorrer la frase1
		for(i = 0;i < frase1.length();i++)
		{
			for(j = 0;j < min.length();j++)//Para comparar frase1 con la longitud de min
			{
				if(frase1.charAt(i) == min.charAt(j))//Si el caracter de frase1 es el mismo que en min
				{
					//si la posición del bucle que compara la longitud de min + el numero de cifrado son mayor
					//que la longitud de min
					if(j + num >= min.length())
					{
						//Se le añadira a frase 2 el contador j + num % longitud de min
						//para obtener el resto, esto es así ya que si String que queremos comparar
						//Es mas pequeño que lo que queremos sumarle, sacandole el resto podemos
						//solucionar el problema Ej: j+num = 900 y min.legth = 25 900 % 25 (se saca el cociente y funciona)
						frase2 += min.charAt((j + num) % min.length());
					}
					else
					{
						frase2 += min.charAt(j + num);
					}
				}
				else if(frase1.charAt(i) == may.charAt(j))//Si el caracter de frase1 es el mismo que en min
				{
					//si la posición del bucle que compara la longitud de min + el numero de cifrado son mayor
					//que la longitud de min
					if(j + num >= may.length())
					{
						//Se le añadira a frase 2 el contador j + num % longitud de min
						//para obtener el resto, esto es así ya que si String que queremos comparar
						//Es mas pequeño que lo que queremos sumarle, sacandole el resto podemos
						//solucionar el problema Ej: j+num = 900 y min.legth = 25 900 % 25 (se saca el cociente y funciona)
						frase2 += may.charAt((j + num) % may.length());
					}
					else
					{
						frase2 += may.charAt(j + num);
					}
				}
			}
		}
		System.out.println(frase2);
	}
}
