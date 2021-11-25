package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.50;
	
	Produto()
	{
		
	}
	
	
	Produto(String nomeinicial, double precoInicial)
	{
		nome = nomeinicial;
		preco= precoInicial;
	}
	
	
	
	double precoComDesconto() 
	{
		double precofinal = preco*(1-desconto);
		return precofinal;
	}

}
