package lemuelCavalcante.estoque;

public class Fornecedor {

	private int cpnj;
	private String nome;
	
	public Fornecedor(int cpnj, String nome) {
		
		this.cpnj = cpnj;
		this.nome = nome;
	}

	public int getCpnj() {
		return cpnj;
	}

	public void setCpnj(int cpnj) {
		this.cpnj = cpnj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Fornecedor [cpnj=" + cpnj + ", nome=" + nome + "]";
	}
	
	
}
