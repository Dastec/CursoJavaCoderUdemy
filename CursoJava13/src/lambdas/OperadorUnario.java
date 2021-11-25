package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {//Recebe um parametro e retorna o mesmo tipo

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0));
		
		System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(0));
		

	}

}