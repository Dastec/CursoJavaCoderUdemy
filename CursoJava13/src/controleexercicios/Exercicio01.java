package controleexercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		if (num >= 0 && num <= 10)
		{
			System.out.println("Numero "+num+" est� dentro de 0 a 10");
			if(num % 2 == 0)
			{
				System.out.println(num+" � Par!");
			}
			else 
			{
				System.out.println(num+" � impar!");
			}
		}
		else
		{
			System.out.println("Numero "+num+" n�o est� entre 0 a 10!");
		}
		
		entrada.close();
	}

}
