package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notbook", 4377, 35, 0);
		Produto p2 = new Produto("Tv 50 pol", 3100, 15, 0);
		Produto p3 = new Produto("Smartphone K10", 1200, 10, 30);
		Produto p4 = new Produto("Ps5", 5000, 35, 0);
		Produto p5 = new Produto("Ps4", 3000, 15, 0);
		Produto p6 = new Produto("Tv 43 pol", 2500, 10, 35);
		Produto p7 = new Produto("Tv 32 pol", 1700, 10, 32);
		Produto p8 = new Produto("Desktop", 2700, 10, 15);
		Produto p9 = new Produto("Alexa", 500, 5, 10);
		Produto p10 = new Produto("Conversor Digital", 550, 5, 10);
		Produto p11 = new Produto("Iphone 11", 7000, 35, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
		
		Predicate<Produto> superPromocao = produto -> produto.desconto >= 30;
		Predicate<Produto> freteGratis = produto -> produto.frete == 0;
		
		Function<Produto, String> tela = produto -> "Produto: "+ produto.nome 
				+"\nPreço: R$"+produto.preco
				+"\nDesconto: "+produto.desconto
				+"\nFrete: Gratis"
				+"\n";
		
		/*System.out.println("=====================");
		System.out.println("====Super Desconto====");
		System.out.println("=====================");
		produtos.stream().filter(superPromocao).map(tela).forEach(System.out::println);
		
		System.out.println("=====================");
		System.out.println("====Fretes Gratis====");
		System.out.println("=====================");
		produtos.stream().filter(freteGratis).map(tela).forEach(System.out::println);*/
		
		System.out.println("=======================================");
		System.out.println("====Super Desconto com Frete Gratis====");
		System.out.println("=======================================");
		produtos.stream().filter(freteGratis).filter(superPromocao).map(tela).forEach(System.out::println);
	}
}
