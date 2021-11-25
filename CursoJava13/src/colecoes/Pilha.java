package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
			
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Principe!");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //retotna false
		System.out.println(livros.element());//retorna exce��o
		
		System.out.println(livros.poll());//retorna false
		System.out.println(livros.pop());//retorna exce��o
		System.out.println(livros.remove());//retorna exce��o
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
			
	}
}
