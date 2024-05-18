package testeMain;

import modelo.Cartao;
import modelo.CartaoCredito;
import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestMain {

	public static void main(String[] args) {
		
		Cliente cliente= new Cliente();
		cliente.setNome("Junior");
		cliente.setCpf("000000");
		
		Conta cc= new ContaCorrente(cliente);
		Conta poupanca= new ContaPoupanca(cliente);
		Cartao cCredito= new CartaoCredito(cliente);
		
		cCredito.despositarCartaoCredito(5000);
		cCredito.extratoLimite();
		
		cCredito.sacarCartaoCredito(500);
		
		//cCredito.comprarCartaoCredito(250);
		cCredito.extratoLimite();
		
	}

}
