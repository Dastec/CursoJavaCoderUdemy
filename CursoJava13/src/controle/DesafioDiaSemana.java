package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva o dia da semana: ");
		String dia = entrada.next();
		dia = dia.toLowerCase();
		
		if (dia.contentEquals("domingo"))
		{
			System.out.println("1");
		}
		else if (dia.contentEquals("segunda"))
		{
			System.out.println("2");
		}
		else if (dia.contentEquals("terça"))
		{
			System.out.println("3");			
		}
		else if (dia.contentEquals("quarta"))
		{
			System.out.println("4");			
		}
		else if (dia.contentEquals("quinta"))
		{
			System.out.println("5");			
		}
		else if (dia.contentEquals("sexta"))
		{
			System.out.println("6");			
		}
		else if (dia.contentEquals("sabado"))
		{
			System.out.println("7");			
		}
		else
		{
			System.out.println("Dia da semana invalido!");
		}
		
		entrada.close();
		
	}

}
