package oo.composicao.desafio.desafio2;
import java.util.ArrayList;
public class Compra {
	ArrayList<Item> item;
	
	public double valorTotal() {
		double tot = 0;
		for(Item itens: item) {
			tot += itens.produto.preco * itens.qtde;
		}
		return tot;
	}
	

}
