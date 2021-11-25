package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
	
	public final static String grito(String n) {
		return n + "!!! ";
	}
	
	
	public final static int converterBinaryToDec(Integer num) {
		String numstr = num.toString();
		int expoente = 0;
		int soma =0;
		
		for(int i = numstr.length()-1; i >= 0; i-- ) {
			if(numstr.charAt(i) == '1') {
				soma += Math.pow(2, expoente); 
			}
			expoente++;
		}
		return soma;
	}
	
	
}
