package servico;

import modelo.Conta;

public interface IntConta {
	
	void depositar(double valor);
	void sacar(double valor);
	void transferir(Conta contaDestino, double valor);
	void imprimirExtrato();

}
