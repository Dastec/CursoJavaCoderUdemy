package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List <Compra> compra = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void obterValorTotal() {
		double valorTotal = 0;
		for(Compra compra: compra) {
			valorTotal += compra.valorTotal();
		}
		System.out.println("Valor total: R$"+valorTotal);
	}

}
