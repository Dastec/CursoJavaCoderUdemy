package Concessionaria;

import Concessionaria.carros.Carro;
import Concessionaria.carros.Civic;
import Concessionaria.carros.Corsa;
import Concessionaria.carros.Motor;

public class Main {
	public static void main(String[] args) {

		Carro civic01 = new Civic();
		Carro corsa01 = new Corsa();

		civic01.setMarca("Honda");
		civic01.setModelo("Civic");
		civic01.setCor("Preto");
		civic01.setTipo("Sedan");
		civic01.setMotor(new Motor());
		
		civic01.getMotor().setTipo("Flex");
		
		System.out.println(civic01.getMotor().getTipo()); 
		

		civic01.ligar();
		civic01.desligar();

		corsa01.ligar();
		corsa01.desligar();
	}

}
