package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (v ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean comproutv50 = trabalho1 && trabalho2;
		boolean comproutv32 = trabalho1 ^ trabalho2;
		boolean comprousorvete = trabalho1 || trabalho2;
		
		//Operador un�rio!
		boolean maissaudavel = !comprousorvete;
		
		
		System.out.println("Comprou TV 50� ?" + comproutv50);
		System.out.println("Comprou TV 32� ?" + comproutv32);
		System.out.println("Comprou sorvete ?" + comprousorvete);
		System.out.println("Mais saudavel?" + maissaudavel);
		
	
		
	}

}
