package lemuelCavalcante.banco;

public class UsoDeContas {
	
	public static void main(String [] args) {
		
		Pessoa p = new Pessoa(1);
		p.setNome("Neymar Jr");
		
		Conta c1 = new Conta(100, p);
		Conta c2 = new Conta(200, p);
		
		Banco b = new Banco();
		
		b.cadastro(c1);
		b.cadastro(c2);
		
		b.deposito(100, 1200);
		System.out.println("Saldo conta 100: " + b.saldo(100));
			
		b.deposito(200, 955);
		System.out.println("Saldo conta 200: " + b.saldo(200));
		
		b.saque(100, 250);
		System.out.println("Saldo conta 100: " + b.saldo(100));
			
		b.saque(200, 55);
		System.out.println("Saldo conta 200: " + b.saldo(200));
		
		b.deposito(200, 100);
		System.out.println("Saldo conta 200: " + b.saldo(200));
		
		System.out.println("Extrato conta 100: \n" + b.extrato(100));
		System.out.println("Extrato conta 200: \n" + b.extrato(200));
		
	}

}
