package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		final String URL = "jdbc:mysql://localhost";
		final String USUARIO = "root";
		final String SENHA = "1234";
		
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}

}
