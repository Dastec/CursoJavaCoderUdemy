package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;


public class Compra {
	List<Item>itens = new ArrayList<>();
	
	double valorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.produto.preco*item.qtde;
		}
		return total;
	}

	void listaDaCompra() {
		for(Item item: itens) {
			System.out.println("Quantidade: " + item.qtde +" |Item: " + item.produto.nome + " |Preço: R$" + item.produto.preco);
		}
	}
}
