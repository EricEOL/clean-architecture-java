package br.com.alura.escola.domain.aluno;

import br.com.alura.escola.infra.aluno.AlunoRepositoryInMemory;

public class TesteInMemory {

	public static void main(String[] args) {
		CPF cpf = new CPF("11111111111");
		CPF cpf2 = new CPF("22222222222");
		
		Aluno aluno = new Aluno(cpf, "Rebecca", new Email("rebecca@email.com.br"));
		Aluno aluno2 = new Aluno(cpf2, "Thamiris", new Email("rebecca@email.com.br"));

		AlunoRepositoryInMemory repository = new AlunoRepositoryInMemory();
		repository.matricular(aluno);
		repository.matricular(aluno2);
		
		for(Aluno al : repository.listarAlunosMatriculados()) {
			System.out.println(al.getNome());
		}
		
		Aluno alunoFound = repository.buscarPorCPF(cpf2);
		
		System.out.println(alunoFound.getNome());
	}
	
}
