package teste.basico;

import java.util.List;

import modelo.basico.Produto;
import modelo.basico.ProdutoDAO;

public class ObterProduto {
	
	ProdutoDAO dao = new ProdutoDAO();
	
	List<Produto> produtos = dao.obterTodos();
	
	/*for(Produto produto: produtos) {
		
	}*/
}
