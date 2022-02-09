package escola;

public class FabricaDeAluno {

	private Aluno aluno;
	
	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public static void main(String[] args) {
		FabricaDeAluno fabrica = new FabricaDeAluno();
		
		fabrica
		.comNomeCPFEmail("Rebecca", "11111111111", "rebecca@gmail.com.br")
		.comTelefone("21", "989832982");
		
		System.out.println(fabrica);
	}
	
}
