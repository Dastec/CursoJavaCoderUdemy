package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Main {
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		
		Ferrari ferrari = new Ferrari(300);
		ferrari.ligarTurbo();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println("CIVIC - Velocidade: "+civic.velocidadeatual);
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		System.out.println("CIVIC - Velocidade: "+civic.velocidadeatual);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		System.out.println("FERRARI - Velocidade: "+ferrari.velocidadeatual);
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		System.out.println("FERRARI - Velocidade: "+ferrari.velocidadeatual);
		
	}//main
}
