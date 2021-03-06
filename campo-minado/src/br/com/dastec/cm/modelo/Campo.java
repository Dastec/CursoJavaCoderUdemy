package br.com.dastec.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.dastec.cm.excecao.ExplosaoExcpetion;

public class Campo {
	
	
	private final int LINHA;
	private final int COLUNA;
	
	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>(); 
	
	Campo(int linha, int coluna){
		this.COLUNA = coluna;
		this.LINHA = linha;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = LINHA != vizinho.LINHA;
		boolean colunaDiferenrte = COLUNA != vizinho.COLUNA;
		boolean diagonal = linhaDiferente && colunaDiferenrte;
		
		int deltaLinha = Math.abs(LINHA - vizinho.LINHA);
		int deltaColuna = Math.abs(COLUNA - vizinho.COLUNA);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else {
			return false;
		}
			
	}
	
	void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		if (!aberto && !marcado) {
			aberto = true;
			
			if (minado) {
				throw new ExplosaoExcpetion();
			}
			
			if (vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		}else
		return false;
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	void minar() {
		minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}

	public int getLINHA() {
		return LINHA;
	}

	public int getCOLUNA() {
		return COLUNA;
	}
	
	boolean objetivoAlacacado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhaca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
	}
	
	public String toString() {
		if (marcado){
			return "x";
		}else if (aberto && minado){
			return "*"; 
		}else if (aberto && minasNaVizinhaca() > 0) {
			return Long.toString(minasNaVizinhaca());
		}else if (aberto) {
			return " ";
		}else {
			return "?";
		}
		
		
	}
	

}//Fim classe
