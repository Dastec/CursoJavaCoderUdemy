package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner sal = new Scanner (System.in);
			
			System.out.print("Digite o seu primeiro salario: ");
			String sal1 = sal.nextLine().replace(",", ".");
			double val1 = Double.parseDouble(sal1);
			//System.out.println(val1);
			
			System.out.print("Digite o seu segundo salario: ");
			String sal2 = sal.nextLine().replace(",", ".");
			double val2 = Double.parseDouble(sal2);
			//System.out.println(sal2);
			
			System.out.print("Digite o seu terceiro salario: ");
			String sal3= sal.nextLine().replace(",", ".");
			double val3 = Double.parseDouble(sal3);
			//System.out.println(sal3);
			double media = (val1+val2+val3)/3;
					
			System.out.printf(
					"A m�dia dos tr�s salarios foi de R$%f.2"
					,media);
			
		sal.close();
		
	}

}
