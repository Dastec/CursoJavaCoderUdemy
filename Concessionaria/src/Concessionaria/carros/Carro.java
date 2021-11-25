package Concessionaria.carros;

public abstract class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private String tipo;
	private boolean ligado;
	private Motor motor;

	protected Carro() {

	}

	protected Carro(String marca, String modelo, String cor, String tipo, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.tipo = tipo;
		this.motor = motor;
		this.ligado = false;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getLigado() {
		return this.ligado;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Motor getMotor() {
		return this.motor;
	}

	public void ligar() {
		if (this.ligado == false) {
			this.ligado = true;
			System.out.println("Motor foi ligado!");
		} else {
			System.out.println("Motor já está ligado!");
		}
	}

	public void desligar() {
		if (this.ligado == true) {
			this.ligado = false;
			System.out.println("Motor foi desligado!");
		} else {
			System.out.println("Motor já está desligado!");
		}
	}

	public abstract void acelerar();

	public abstract void frear();

}
