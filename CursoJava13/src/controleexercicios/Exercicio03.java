package controleexercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		

	
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.print("Voc� deseja entrar no programa? s/n: ");
	String resp = entrada.next();
	
	
/*principal:*/ while(!resp.equalsIgnoreCase("sair"))
{
	if (resp.equalsIgnoreCase("s"))
	{
		System.out.print("Digite a nota da NP1: ");
		double np1 = entrada.nextDouble();
		
		System.out.print("Digite a nota da NP2: ");
		double np2 = entrada.nextDouble();
		
		double media = (np1 + np2)/2;
		
		if(media >= 7)
		{
			System.out.printf("Sua m�dia foi %.2f",media);
			System.out.println("\nAprovado");
		}
		else if (media >=4 && media < 7)
		{
			System.out.printf("Sua m�dia foi %.2f",media);
			System.out.println("\nRecupera��o");
		}
		else
		{
			System.out.printf("Sua m�dia foi %.2f",media);
			System.out.println("\nReprovado");
		}
		
	}
	else if (resp.equalsIgnoreCase("n"))
		{
		System.out.println("Certo, voc� digitou n, caso decida entrar mais tarde, reinicie o programa!");
		break;
		}
	else 
		{
		System.out.println("Comando n�o encontrado! Programa finalizado! ");
		 break;
		}
	
	while (!resp.equalsIgnoreCase("s"))
	{
		System.out.print("Deseja continuar s/n: ");
		resp = entrada.next();
		
		if (resp.equalsIgnoreCase("s"))
			continue;
		else if (resp.equalsIgnoreCase("n"))
			{
			System.out.println("Programa Finalizado!");
			break;
			}
		else 
			System.out.println("Comando n�o encontrado!\n Voc� deve digitar s ou n: ");
	}
}
	entrada.close();
	
	}

}
