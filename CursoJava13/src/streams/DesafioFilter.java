package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Vendedor v1 = new Vendedor("Biatriz", "F", 3432);
		Vendedor v2 = new Vendedor("Daniel", "M", 5432);
		Vendedor v3 = new Vendedor("Fernanda", "F", 4775);
		Vendedor v4 = new Vendedor("João", "M", 2345);
		Vendedor v5 = new Vendedor("Ana", "F", 1773);
		Vendedor v6 = new Vendedor("Marcos", "M", 1554);
		Vendedor v7 = new Vendedor("Julia", "F", 7543);
		Vendedor v8 = new Vendedor("Fernando", "M", 5432);
		Vendedor v9 = new Vendedor("Caroline", "F", 3521);
		Vendedor v10 = new Vendedor("Lucas", "M", 4245);

		List<Vendedor> vendedores = Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);

		Predicate<Vendedor> valorVendas = (vendedor) -> vendedor.totalVendido > 5234;
		Predicate<Vendedor> sexo = (vendedor) -> vendedor.sexo.equalsIgnoreCase("f");

		Function<Vendedor, String> resultadoPesquisa = vendedor -> "Nome: " + vendedor.nome + "\nValor vendido: R$"
				+ vendedor.totalVendido + "\n";

		System.out.println("====Filtro por valor vendido!====");
		vendedores.stream().filter(valorVendas).map(resultadoPesquisa).forEach(System.out::println);

		System.out.println("====Filtro por sexo!====");
		vendedores.stream().filter(sexo).map(resultadoPesquisa).forEach(System.out::println);
		
		System.out.println("====Filtro por sexo e valor vendido!====");
		vendedores.stream().filter(sexo).filter(valorVendas).map(resultadoPesquisa).forEach(System.out::println);
		;

		/*
		 * System.out.
		 * println("Deseja iniciar o sistema: Digite 's' para sim, ou 'n' para não: ");
		 * String resp = entrada.next();
		 * 
		 * String tipo; while(resp.equals("s")) { System.out.
		 * println("Digite o modo por causa deseja filtrar! 's' para sexo ou 'v' para valor vendido:"
		 * ); tipo = entrada.next();
		 * 
		 * if (tipo.equalsIgnoreCase("v")) {
		 * System.out.println("Digite o valor do filtro: "); parametro =
		 * entrada.nextDouble();
		 * 
		 * System.out.println("====Filtro por valor vendido!====");
		 * vendedores.stream().filter(valorVendas);
		 * 
		 * }else if(tipo.equalsIgnoreCase("s")) {
		 * System.out.println("Digite o valor do filtro: "); parametro2 =
		 * entrada.next();
		 * 
		 * System.out.println("====Filtro por sexo!====");
		 * vendedores.stream().filter(sexo).map(resultadoPesquisa)
		 * .forEach(System.out::println);; }
		 * System.out.println("Deseja continuar: Digite 's' para sim, ou 'n' para não: "
		 * ); resp = entrada.next(); } entrada.close();
		 */

	}// main
}
