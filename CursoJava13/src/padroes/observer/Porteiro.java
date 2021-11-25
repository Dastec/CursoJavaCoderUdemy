package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Classe Subject
public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registrarObservador (ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while (!"Sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante Chegou? ");
			valor  = entrada.nextLine();
			
			if ("Sim".equalsIgnoreCase(valor)) {
				//Criar o evento
				EventoChegadaAniversariante evento 
				= new EventoChegadaAniversariante(new Date());
				
				//notificar observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "Sair";
			} else {
				System.out.println("Alarme Falso!");
			}
		}
		entrada.close();
	}
}
