package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("16C");
		Cliente cliente = new Cliente("Ana", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTrasacao().incluir(assento).fecharTrasacao().fechar();
		
		dao.abrirTrasacao().incluir(cliente).fecharTrasacao().fechar();
		
		
	}
}
