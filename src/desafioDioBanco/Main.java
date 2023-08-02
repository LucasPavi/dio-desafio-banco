package desafioDioBanco;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		
		Conta cc = new ContaCorrente(cliente);
	
		cc.depositar(100);
	
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Dani");
		
		
		Conta poupanca = new ContaPoupança(cliente2);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
	}

}
