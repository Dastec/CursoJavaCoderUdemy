package controleexercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano para saber se ele � Bissexto ou n�o!");
		int ano = entrada.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 ||ano % 400 == 0 && ano % 100 == 0)
		{
			System.out.printf("%d � um ano Bissexto!", ano);
		}
		else
		{
			System.out.printf("%d n�o � um ano Bissexto!", ano);
		}
		
		entrada.close();
	}

}
