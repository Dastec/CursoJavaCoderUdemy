package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double num;
		double num1;
		double num2;
		double resultado;
		
		double den = Math.pow(10, 3);
		
		num1 = 6*(3+2);
		num1 = (Math.pow(num1, 2))/(3*2);
		
		num2 = ((1-5)*(2-7))/2;
		num2 = Math.pow(num2, 2);
		
		num = num1 - num2;
		num = Math.pow(num, 3);
		
		resultado = num/den;
		
		System.out.println(resultado);
		
	}

}
