public class Main {

	public static void main(String[] args) {
		Cliente giovanny = new Cliente();
		giovanny.setNome("Giovanny");
		
		Conta cc = new ContaCorrente(giovanny);
		Conta poupanca = new ContaPoupanca(giovanny);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}