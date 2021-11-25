package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UpdateMetodos {

	static Connection conexao = FabricaConexao.getConexao();

	public static void selectPorCodigo(int codigo) throws SQLException {
		boolean existe = verificarSeExiteCodigo(codigo);
		
		if (existe) {
			String sql = "SELECT * FROM pessoas WHERE codigo = ?";
			PreparedStatement sttm = conexao.prepareStatement(sql);
			sttm.setInt(1, codigo);
			ResultSet resultado = sttm.executeQuery();

			while (resultado.next()) {
				int codigo2 = resultado.getInt("codigo");
				String nome2 = resultado.getString("nome");

				Pessoa p = new Pessoa(codigo2, nome2);

				System.out.println("\n" + p.getCodigo() + " | " + p.getNome() + "\n");
			}
		}else {
			System.out.println("\nCódigo não existe!\n");
			
		}
		
	}

	public static void selectPorNome(String nome) throws SQLException {
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement sttm = conexao.prepareStatement(sql);
		sttm.setString(1, "%" + nome + "%");
		ResultSet resultado = sttm.executeQuery();

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (resultado.next()) {
			int codigo2 = resultado.getInt("codigo");
			String nome2 = resultado.getString("nome");

			pessoas.add(new Pessoa(codigo2, nome2));

			for (Pessoa p : pessoas) {
				System.out.println("\n" + p.getCodigo() + " | " + p.getNome() + "\n");
			}
		}
	}

	public static void updatePorCodigo(int codigo, String novoNome) throws SQLException {
		
		boolean existe = verificarSeExiteCodigo(codigo);
		
		if (existe) {
			String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			PreparedStatement sttm = conexao.prepareStatement(sql);
			sttm.setString(1, novoNome);
			sttm.setInt(2, codigo);
			sttm.execute();
			System.out.println("\nAtualizado com sucesso!\n");
			
			System.out.println("Esse é o registro atualizado!: ");
			UpdateMetodos.selectPorCodigo(codigo);
		}
		System.out.println("\nCódigo não existe!\n");
	}

	public static void updatePorNome(String nome, String novoNome) throws SQLException {
		boolean existe = verificarSeExiteNome(nome);
		if (existe) {
			String sql = "UPDATE pessoas SET nome = ? WHERE nome = ?";
			PreparedStatement sttm = conexao.prepareStatement(sql);
			sttm.setString(1, novoNome);
			sttm.setString(2, nome);
			sttm.execute();
			System.out.println("\nAtualizado com sucesso!\n");
			
			System.out.println("Esse é o registro atualizado!: ");
			selectPorNome(novoNome);
		}else {
			System.out.println("\nParametro errado!\n");
		}
	}

	public static boolean verificarSeExiteNome(String nome) throws SQLException{

		String sql = "SELECT * FROM pessoas WHERE nome = ?";
		PreparedStatement sttm = conexao.prepareStatement(sql);
		sttm.setString(1, nome);
		ResultSet resultado = sttm.executeQuery();

		if (resultado.next()) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public static boolean verificarSeExiteCodigo(int codigo) throws SQLException{
		
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		PreparedStatement sttm = conexao.prepareStatement(sql);
		sttm.setInt(1, codigo);
		ResultSet resultado = sttm.executeQuery();
		
		if (resultado.next()) {
			return true;
			
		}else {
			return false;
		}
	}

}
