package controleexercicios;

import java.util.Scanner;

public class ExercicioSwitch {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String resp="";
		System.out.println("Digite um dia especial par'a voc� e reponderei porque: ");
		int dia = entrada.nextInt();
		
		switch(dia)
		{
		case 03:
			resp = "Nesse dia voc� nasceu linda!";
			break;
		case 10:
			resp = "Nesse dia voc� se casou com seu amado! Dia 10/06/2017";
			break;
		case 12:
			resp = "Nesse dia seu irm�o Gleyson nasceu!";
			break;
		case 20:
			resp = "Nesse dia seu amado Daniel nasceu!\nE voc�s se casaram no civil!";
			break;
		case 21:
			resp = "Que belo dia em, inicio do seu namoro com seu amado!";
			break;
		case 24:
			resp = "Nesse dia seu irm�o Francisco nasceu";
			break;
		case 27:
			resp = "Nesse dia sua m�e nasceu!";
			break;
		default:
			resp = "Desculpa, mas nao tenho lembran�a dessa data!";
			
		}
		System.out.println(resp);
		
		entrada.close();
	}

}
