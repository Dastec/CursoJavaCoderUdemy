package controleexercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numerador = 0;
		System.out.print("Digite um n�mero: ");
		int num = entrada.nextInt();
		
		while(num>0)
		{
			numerador+=num;
			System.out.println(numerador);
			System.out.print("Digite um n�mero: ");
			num = entrada.nextInt();
		}
		System.out.println("Fim!");
		
		entrada.close();
	}

}
