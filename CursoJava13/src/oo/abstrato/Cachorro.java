package oo.abstrato;

public class Cachorro extends Mamifero{
	
	@Override
	public String mamar() {
		return "Usando as patas";
	}
	
	@Override
	public String mover() {
		return "Usando leite";
	}

}
