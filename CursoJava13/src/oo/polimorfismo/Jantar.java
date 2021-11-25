package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingridiente1 = new Arroz(0.2);
		Feijao ingridiente2 = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingridiente1);
		convidado.comer(ingridiente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremessa = new Sorvete(0.4);
		
		convidado.comer(sobremessa);
		System.out.println(convidado.getPeso());
		
		
	}
}
