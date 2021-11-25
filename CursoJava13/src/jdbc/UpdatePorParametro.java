package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePorParametro {

	public static void main(String[] args) throws SQLException {

		try (Scanner entrada = new Scanner(System.in)) {
			String resposta;
			String resp = "";

			System.out.print("Deseja fazer uma busca ou um Update ou Sair?\nDigite sua escolha: b/u/s ->  ");
			resposta = entrada.nextLine();

			while (!resposta.equalsIgnoreCase("s")){

				if (resposta.equalsIgnoreCase("b")) {
					System.out.print("Você deseja buscar por codigo ou nome?\nDigite  sua escolha c/n -> ");
					resp = entrada.nextLine();
					while (!resp.equalsIgnoreCase("u")) {

						if (resp.equalsIgnoreCase("c")) {
							String codigoS;
							int codigo;
							System.out.print("Digite o codigo: ");
							codigoS = entrada.nextLine();
							codigo = Integer.parseInt(codigoS);
							UpdateMetodos.selectPorCodigo(codigo);

							System.out.println("Deseja fazer outra busca ou um Update ou Sair?\nDigite sua escolha: b/u/s -> ");
							resp = entrada.nextLine();

							if (resp.equalsIgnoreCase("s")) {
								System.out.println("Você saiu do sistema!");
								return;
							}else if (resp.equalsIgnoreCase("u")) {
								resposta = "u";	
							}else if (resp.equalsIgnoreCase("b")) {
								break;
							}else {
								System.out.println("Opção invalida! Você saiu do sistema!");
								return;
							}

						} else if (resp.equalsIgnoreCase("n")) {
							String nome;
							System.out.print("Digite o nome: ");
							nome = entrada.nextLine();
							UpdateMetodos.selectPorNome(nome);
							
							System.out.println("Deseja fazer outra busca ou um Update ou Sair?\nDigite sua escolha: b/u/s -> ");
							resp = entrada.nextLine();

							if (resp.equalsIgnoreCase("s")) {
								System.out.println("Você saiu do sistema!");
								return;
							}else if (resp.equalsIgnoreCase("u")) {
								resposta = "u";	
							}else if (resp.equalsIgnoreCase("b")) {
								break;
							}else {
								System.out.println("Opção invalida! Você saiu do sistema!");
								return;
							}
						}
					}
				} 
				else if (resposta.equalsIgnoreCase("u")) {
					
					System.out.print("Você deseja fazer uma alteração por codigo ou nome?\nDigite  sua escolha c/n -> ");
					resp = entrada.nextLine();
					
					while (!resp.equalsIgnoreCase("b")) {

						if (resp.equalsIgnoreCase("c")) {
							String codigoS;
							int codigo;
							String novoNome;
							
							System.out.print("Digite um codigo para pesquisa: ");
							codigoS = entrada.nextLine();
							codigo = Integer.parseInt(codigoS);
							
							System.out.println("\nResultado da pesquisa! ");
							UpdateMetodos.selectPorCodigo(codigo);
							
							System.out.println("Digite o código do registro que deseja atualizar: ");
							codigoS = entrada.nextLine();
							codigo = Integer.parseInt(codigoS);
							
							System.out.print("Digite o novo Nome: ");
							novoNome = entrada.nextLine();
							
							UpdateMetodos.updatePorCodigo(codigo, novoNome);

							System.out.println("Deseja fazer outro Update ou uma busca ou Sair?\nDigite sua escolha: b/u/s -> ");
							resp = entrada.next();

							if (resp.equalsIgnoreCase("s")) {
								System.out.println("Você saiu do sistema!");
								return;
							}else if (resp.equalsIgnoreCase("b")) {
								resposta = "b";	
							}else if (resp.equalsIgnoreCase("u")) {
								break;
							}else {
								System.out.println("Opção invalida! Você saiu do sistema!");
								return;
							}

						} else if (resp.equalsIgnoreCase("n")) {
							
							System.out.println("Importante:\nNessa função é necessario passar o nome corretamente para atualizar um Registro!");
							
							String nome;
							String novoNome;
							
							System.out.print("Digite um nome para pesquisa: ");
							nome = entrada.nextLine();
							
							System.out.println("\nResultado da pesquisa! :");
							UpdateMetodos.selectPorNome(nome);
						
							System.out.print("Digite o nome exatamente como o do registro: ");
							nome = entrada.nextLine();
												
							System.out.print("Digite o novo Nome: ");
							novoNome = entrada.nextLine();
							
							UpdateMetodos.updatePorNome(nome, novoNome);
							

							System.out.println("Deseja fazer outro Update ou uma busca ou Sair?\nDigite sua escolha: b/u/s -> ");
							resp = entrada.next();

							if (resp.equalsIgnoreCase("s")) {
								System.out.println("Você saiu do sistema!");
								return;
							}else if (resp.equalsIgnoreCase("b")) {
								resposta = "b";	
							}else if (resp.equalsIgnoreCase("u")) {
								break;
							}else {
								System.out.println("Opção invalida! Você saiu do sistema!");
								return;
							}
						}
					}
				}
				
				else {
					System.out.println("Opção invalida! Você saiu do sistema!");
					return;
				}
			}
			System.out.println("Você saiu do sistema!");
			entrada.close();
		}
	}//main
}
