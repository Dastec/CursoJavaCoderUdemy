package fundamentos.exerciciosmoduloum;

import java.util.Scanner;

public class Equacao2Grau {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		int c;
		double delta;
		double x1;
		double x2;
		
		
		System.out.print("Digite o valor de 'a': ");
		a = entrada.nextInt();
		
		System.out.print("Digite o valor de 'b': ");
		b = entrada.nextInt();
		
		System.out.print("Digite o valor de 'c': ");
		c = entrada.nextInt();
		
		delta = (Math.pow(b, 2))-(4*a*c);
		
		System.out.printf("Delta = %.2f",delta);
		delta = Math.sqrt(delta);
		
		x1= (-b+delta)/(2*a);
		x2= (-b-delta)/(2*a);
		
		System.out.printf("\nx1 = " + x1);
		System.out.printf("\nx2 = " + x2);
		
		
		
		entrada.close();
		
		
	}

}
