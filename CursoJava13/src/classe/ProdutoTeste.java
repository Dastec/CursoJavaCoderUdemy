package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
	
			
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.80;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		
		
		double precofinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto();
		
		System.out.printf("R$%.2f",precofinal1);
		System.out.printf("\nR$%.2f",precofinal2);
		
		
		
		
		
		
		
		
	}//main
}//class
