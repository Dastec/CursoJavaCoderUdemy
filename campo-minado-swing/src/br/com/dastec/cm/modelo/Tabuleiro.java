package br.com.dastec.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {
	private final int LINHAS;
	private final int COLUNAS;
	private final int MINAS;

	public int getColunas() {
		return COLUNAS;
	}
	
	public int getLinhas() {
		return LINHAS;
	}



	private final List<Campo> campos = new ArrayList<Campo>();
	private List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.LINHAS = linhas;
		this.COLUNAS = colunas;
		this.MINAS = minas;

		gerarCampos();
		associarOsVizinhos();
		sortearMinas();
	}
	
	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}

	public void RegistrarObersavador(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}

	public void notificarObservadores(boolean resultado) {
		observadores.stream().forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}

	public void abrir(int linha, int coluna) {

		campos.parallelStream().filter(c -> c.getLINHA() == linha && c.getCOLUNA() == coluna).findFirst()
				.ifPresent(c -> c.abrir());

	}

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLINHA() == linha && c.getCOLUNA() == coluna).findFirst()
				.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < LINHAS; linha++) {
			for (int coluna = 0; coluna < COLUNAS; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
			}
		}
	}

	private void associarOsVizinhos() {
		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}

	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();

		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).filter(minado).count();
		} while (minasArmadas < MINAS);
	}

	public boolean objetivoAlacacado() {
		return campos.stream().allMatch(c -> c.objetivoAlacacado());
	}

	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if (evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			System.out.println("Perdeu.. :(");
			notificarObservadores(false);
		} else if (objetivoAlacacado()) {
			System.out.println("Ganhou...");
			notificarObservadores(true);
		}

	}
	
	private void mostrarMinas() {
		campos.stream().filter(c -> c.isMinado()).filter(c -> !c.isMarcado()).forEach(c -> c.setAberto(true));
	}

}
