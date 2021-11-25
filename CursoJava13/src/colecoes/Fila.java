package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		//offer e add -> adicionam elementos na fila
		//DIferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); //Retorna false
		fila.offer("Bia");//Lan�a uma exce��o
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//peek e element => obter o proximo elemento da fila (sem remover)
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia!
		System.out.println(fila.peek());
		System.out.println(fila.peek());//Retorna false
		System.out.println(fila.element());//Lan�a uma exce��o
		System.out.println(fila.element());
		
		//fila.sezi();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains;
		
		//peek e element => obter o proximo elemento da fila (e remove)
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia!
		System.out.println(fila.poll());//Retorna false
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());//Lan�a uma exce��o
		
		
		
		
	}

}
