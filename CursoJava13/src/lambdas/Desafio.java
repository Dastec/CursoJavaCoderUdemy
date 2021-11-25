package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		DecimalFormat df = new DecimalFormat("0.00");
		
		Function<Produto, Double> precoComDesconto = produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco + (preco * 0.085) : preco;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		Function<Double, String> arredondar = valor -> df.format(valor);
		
		UnaryOperator<String> formatar = valorString -> "R$"+valorString.replace(".", ",");
		
		String precoTotal = precoComDesconto
				.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
		
		System.out.println("o Valor total é "+precoTotal);
		
		
	}
}
