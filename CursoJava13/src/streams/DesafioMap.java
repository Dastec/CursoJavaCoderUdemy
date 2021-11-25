package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, String> conversaoBinaria = num -> Integer.toBinaryString(num)+" ";
		
		UnaryOperator<String> inverterBinario = str -> new StringBuilder(str).reverse().toString();
		
		Function<String, Integer> converterInteiro = str -> Integer.parseInt(str.trim(),2);
		
		
		nums.forEach(print);
		System.out.println();
		nums.stream().map(conversaoBinaria).forEach(println);
		System.out.println();
		nums.stream().map(conversaoBinaria).map(inverterBinario).forEach(println);
		System.out.println();
		nums.stream().map(conversaoBinaria).map(inverterBinario).map(converterInteiro).forEach(println);;
		
		
		
		
		
		
		
		
	
	}

}
