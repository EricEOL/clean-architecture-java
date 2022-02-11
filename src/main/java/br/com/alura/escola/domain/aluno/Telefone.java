package br.com.alura.escola.domain.aluno;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	Telefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
	
}
