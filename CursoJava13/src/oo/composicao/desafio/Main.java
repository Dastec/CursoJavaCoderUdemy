package oo.composicao.desafio;

public class Main {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Celular",1000);
		Produto p2 = new Produto("Geladeira",2000);
		Produto p3 = new Produto("Xbox One",1800);
		Produto p4 = new Produto("Cama",700);
		
		
		Item i1 = new Item(2,p1);
		Item i2 = new Item(1,p3);
		Item i3 = new Item(1,p2);
		Item i4 = new Item(1,p4);
		
		Compra compra1 = new Compra();
		compra1.itens.add(i1);
		compra1.itens.add(i2);
		
		Compra compra2 = new Compra();
		compra2.itens.add(i3);
		compra2.itens.add(i4);

		Cliente c1 = new Cliente("Gleyciane"); 
		c1.compra.add(compra1);
		c1.compra.add(compra2);
		
		System.out.println(c1.nome);
		compra1.listaDaCompra();
		System.out.println("R$"+compra1.valorTotal());
		compra2.listaDaCompra();
		System.out.println("R$"+compra2.valorTotal());
		c1.obterValorTotal();
		
	}//main
}
