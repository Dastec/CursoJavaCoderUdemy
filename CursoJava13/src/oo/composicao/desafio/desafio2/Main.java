package oo.composicao.desafio.desafio2;

public class Main {
	public static void main(String[] args) {
		
	Produto p1 = new Produto("Notbook", 1500);
	Produto p2 = new Produto("Celular", 1000);
	Produto p3 = new Produto("Geladeira", 2000);
	Produto p4 = new Produto("Sofa", 900);
	
	Item i1 = new Item(p1,2);
	Item i2 = new Item(p2,3);
	Item i3 = new Item(p3,1);
	Item i4 = new Item(p4,2);
	
	Cliente c1 = new Cliente("Jo�o");
	
	Compra compra1 = new Compra();
	Compra compra2 = new Compra();
	
	compra1.item.add(i1);
	compra1.item.add(i2);
	
	compra2.item.add(i3);
	compra2.item.add(i4);
	
	c1.compra.add(compra1);
	c1.compra.add(compra2);
	
	System.out.println(compra1.valorTotal());
	System.out.println(compra2.valorTotal());
	//System.out.println(c1.obterValorTotal());
	

	}
}
