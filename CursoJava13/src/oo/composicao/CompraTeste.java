package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compras1 = new Compra();
		compras1.cliente = "João Pedro";
		compras1.adcionarItem("Caneta", 20,7.45);
		compras1.adcionarItem(new Item("Borracha", 12,3.89));
		compras1.adcionarItem(new Item("Caderno", 3,18.79));
		
		System.out.println(compras1.itens.size());
		System.out.println(compras1.obterValorTotal());
		
		//Só pra mostrar a relação bidirecional!!!
		double total = compras1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total é R$"+total);
	}

}
