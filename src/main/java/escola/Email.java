package escola;

public class Email {
	
	private String endereco;
	
	Email(String endereco) {
		if(endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Endereço de email inválido.");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
