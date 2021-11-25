package classedesafio;

public class Jantar {
	 public static void main(String[] args) {


	     Pessoa p1 = new Pessoa();
	     p1.nome = "Gleyciane";
	     p1.peso = 48;
	     
	     Comida c1 = new Comida("Arroz", 0.200);
	     Comida c2 = new Comida("Feijão", 0.150);
	     Comida c3 = new Comida("Bife", 0.100);
	
	     
	     p1.comer(c1);
	     p1.comer(c2);
	     p1.comer(c3);
	    

	     System.out.printf("%s\n%.2fkg",p1.nome,p1.peso);
	     
	     
	     
	     
	     

	  }
}
