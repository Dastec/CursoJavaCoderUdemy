package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1+n2) / 2;
		System.out.println(media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) ->  ((n1 + n2) / 2) >= 7 ? "Aprovado": "Reprovado";		
		
		System.out.println(resultado.apply(9.8, 5.7));
		
		Function<Double, String> conceito = notaFinal -> notaFinal >= 7 ? "Media "+notaFinal+" Aprovado" : "Media "+notaFinal+" Reprovado";
		System.out.println(media.andThen(conceito).apply(5.8, 5.7));
		System.out.println(media.andThen(conceito).apply(7.8, 7.7));
	}
}
