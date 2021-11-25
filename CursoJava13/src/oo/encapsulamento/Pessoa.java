package oo.encapsulamento;

public class Pessoa {
	private int idade;
	String nome;
	String sobrenome;
	


	public Pessoa(String nome, String sobrenome, int idade) {
		setIdade(idade);
		setSobrenome(sobrenome);
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade= Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <=120) {
			this.idade = novaIdade;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Olá eu sou " + getNome()
		+ " e tenho " + getIdade()+ " anos.";
	}
}
