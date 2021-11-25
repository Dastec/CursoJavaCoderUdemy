package fundamentos.exerciciosmoduloum;

import java.util.Scanner;

public class Potencia {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double num;
		double quadrado;
		double cubo;
		
		System.out.print("Digite um numero: ");
		num = entrada.nextDouble();
		
		quadrado = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		
		System.out.printf("O numero %.2f ao quadrado é %.2f",num,quadrado);
		System.out.printf("\nO numero %.2f ao cubo é %.2f",num,cubo);
		
		entrada.close();
	}

}
