package controleexercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano para saber se ele é Bissexto ou não!");
		int ano = entrada.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 ||ano % 400 == 0 && ano % 100 == 0)
		{
			System.out.printf("%d é um ano Bissexto!", ano);
		}
		else
		{
			System.out.printf("%d não é um ano Bissexto!", ano);
		}
		
		entrada.close();
	}

}
