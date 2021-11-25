package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int vel){
		super(vel);
		setDelta (15);
	}
	
	
	@Override
	public void ligarTurbo() {
		this.ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		this.ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		this.ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		this.ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
			
	}
	
	/*@Override
	public void acelerar() 
	{
		super.acelerar();
	}*/
	
}
