package desafioDioBanco;

public class ContaPoupança extends Conta{
	 
	public ContaPoupança(Cliente cliente) {
		super(cliente);
	
	}

	public void imprimirExtrato() {
		System.out.println(" === Extrato Conta Poupanca === ");
		super.imprimirInfosComuns();
	}

}	
