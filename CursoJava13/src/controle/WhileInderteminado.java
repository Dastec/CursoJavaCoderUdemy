package controle;

import java.util.Scanner;

public class WhileInderteminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite algo pra ser guardado: ");
		String resp = entrada.nextLine();
		
		while(!resp.equalsIgnoreCase("sair"))
		{
			System.out.println(resp);
		
			System.out.print("digite algo pra ser guardado: ");
			resp = entrada.nextLine();
		}
		System.out.println("Fim");
		entrada.close();
	}

}
