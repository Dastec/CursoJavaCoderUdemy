package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Digite um codigo para exclusão de um registro!");
		Scanner entrada = new Scanner(System.in);
		
		
		int codigo = entrada.nextInt();
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement sttm = conexao.prepareStatement(sql);
		sttm.setInt(1, codigo);
		
		if (sttm.executeUpdate() > 0) {
			System.out.println("Registro excluido!");
		}else {
			System.out.println("Error: Registro não excluido!");
		}
		
		sttm.close();
		entrada.close();
		conexao.close();
	}
}
