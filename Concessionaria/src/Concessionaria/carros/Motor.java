package Concessionaria.carros;

public class Motor {

	private String tipo;
	private int cilindradas;
	private Carro carro;

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return this.cilindradas;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}
