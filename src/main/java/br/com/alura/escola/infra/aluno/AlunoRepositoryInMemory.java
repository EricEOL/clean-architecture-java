package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.AlunoRepository;
import br.com.alura.escola.domain.aluno.CPF;

public class AlunoRepositoryInMemory implements AlunoRepository{

	private List<Aluno> matriculados = new ArrayList<Aluno>();
	
	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.matriculados.stream()
				.filter(aluno -> aluno.getCpf() == cpf.getNumeracao())
				.findFirst()
				.orElseThrow(() ->  new RuntimeException("Aluno não encotrado"));
	}

	@Override
	public List<Aluno> listarAlunosMatriculados() {
		return this.matriculados;
	}
	
}
