package oo.heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeatual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima)
	{
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		
	if(velocidadeatual + getDelta() > VELOCIDADE_MAXIMA){
		velocidadeatual = VELOCIDADE_MAXIMA;
	} 
	else
		{
		velocidadeatual+=getDelta();
		}
		
	}
	
	public void frear() {
		if(this.velocidadeatual > 5) 
		{
			velocidadeatual-=5;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	

}
