package lemuelCavalcante.banco;

public class Pessoa {

	private int cpf;
	private String Nome;
	
	public Pessoa(int n) {
		
		cpf = n;
	
	}

	public int getCpf() {
		return cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	
	
	
}
