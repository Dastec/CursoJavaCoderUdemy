package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas que serão lançadas: ");
		int array = entrada.nextInt();
		double [] nota = new double[array];
		
		int pos = 1;
		for (int i = 0; i < nota.length; i++ ) {
			System.out.printf("Digite a %dª nota: ",pos);
			nota[i] = entrada.nextDouble();
			pos++;
		}
		double soma = 0;
		for (double notas : nota) {
			soma+=notas;
		}
		
		double media = soma/nota.length;
		
		System.out.printf("A média das notas foi %.2f",media);
		entrada.close();

	}//main
}//classe
