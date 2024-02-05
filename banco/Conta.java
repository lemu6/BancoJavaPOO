package lemuelCavalcante.banco;

public class Conta {

	private int numero;
	private double saldo;
	private String extrato = "";
	private Pessoa titular;
	
	// construtor
	public Conta(int n, Pessoa t) {
		
		numero = n;
		titular = t;
	}

	public int getNumero() {
		return numero;
	}

	public String getExtrato() {
		return extrato;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public void setNumero(int n) {
		if (numero > 0) {
			numero = n;
		}else {
			System.out.println("numero invalido!");
		}
	}
	
	
	void credito(double v) {
		saldo = saldo + v;
		extrato = extrato + "Credito " + v +
				" Saldo: " + saldo + ".\n";
		
	}
	void debito(double v) {
		if (v <= saldo) { 
			   saldo = saldo - v;
			   extrato = extrato + "Debito: " + v + 
						" Saldo: " + saldo + ".\n";
			} else { 
				
				System.out.println("Saldo insuficiente.");
	}
	
}
}