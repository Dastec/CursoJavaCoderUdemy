package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String URL = "jdbc:mysql://localhost/curso_java";
		final String USUARIO = "root";
		final String SENHA = "1234";
		
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute("CREATE DATABASE curso_java");
		
		
		conexao.close();
		
	}
}
