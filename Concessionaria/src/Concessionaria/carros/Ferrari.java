package Concessionaria.carros;

public class Ferrari extends Carro implements CarroEsportivo, CarroLuxo {

	private boolean arcondicionadoLigado;
	private boolean turboLigado;

	public Ferrari() {
		this.arcondicionadoLigado = false;
		this.turboLigado = false;

	}

	public void ligarArcondicionado() {
		if (this.arcondicionadoLigado == false) {
			this.arcondicionadoLigado = true;
			System.out.println("Ar-condicionado foi ligado!");
		} else {
			System.out.println("Ar-condicionado já está ligado!");
		}
	}

	public void desligarArcondicionado() {
		if (this.arcondicionadoLigado == true) {
			this.arcondicionadoLigado = false;
			System.out.println("Ar-condicionado foi desligado!");
		} else {
			System.out.println("Ar-condicionado já está desligado!");
		}
	}

	public void ligarTurbo() {
		if(turboLigado == false) {
			this.turboLigado = true;
		}else {
			System.out.print("Turbo já está ligado!");
		}
		
	}

	public void desligarTurbo() {
		if(turboLigado == false) {
			this.turboLigado = true;
		}else {
			System.out.print("Turbo já está ligado!");
		}
	}

	@Override
	public void desligar() {
		if (super.getLigado() == true) {
			this.setLigado(false);
			this.turboLigado = false;
			this.arcondicionadoLigado = false;
			System.out.println("Motor esportivo foi desligado!");
		} else {
			System.out.println("Motor já está desligado!");
		}
	}

	public void acelerar() {
		System.out.println("Freando esportivo!");
	}

	public void frear() {
		System.out.println("Freando esportivo!");
	}
}
