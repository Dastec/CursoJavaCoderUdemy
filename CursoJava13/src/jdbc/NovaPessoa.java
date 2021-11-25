package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES(?)";
		PreparedStatement psmtm = conexao.prepareStatement(sql);
		psmtm.setString(1, nome);
		psmtm.execute();
		
		
		System.out.println(nome + " Incluido com sucesso!");
		
		entrada.close();
	}
}
