package oo.composicao.desafio.desafio2;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compra;
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	public double obterValorTotal() {
		double valorTot = 0;
		for(Compra compras:compra) {
			valorTot += compras.valorTotal();
		}
		return valorTot;
	}

}
