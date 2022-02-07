package escola;

public class CPF {

	private String numeracao;
	
	CPF(String numeracao) {
		if(numeracao == null || !numeracao.matches("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})")) {
			throw new IllegalArgumentException("CPF inválido.");
		}
		
		this.numeracao = numeracao;
	}
	
}
