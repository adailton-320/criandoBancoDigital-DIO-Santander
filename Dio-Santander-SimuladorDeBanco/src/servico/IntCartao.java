package servico;

import modelo.Conta;

public interface IntCartao {
	
	void sacarCartaoCredito(double valor);
	void despositarCartaoCredito(double valor);
	void comprarCartaoCredito(double valor);
	void transferir(double valor, Conta destino);
	void extratoLimite();
}
