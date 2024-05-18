package modelo;

import servico.IntCartao;

public abstract class Cartao implements IntCartao {

	private static final int NUMCARTAO = 1000;
	private static final int CODSEGURANCA = 001;

	protected Cliente cliente;
	protected int numeroCartao;
	protected int codCeguranca;
	protected double limiteCredito;

	public Cartao(Cliente cliente) {
		numeroCartao = Cartao.NUMCARTAO;
		codCeguranca = CODSEGURANCA;
		this.cliente= cliente;
	}

	@Override
	public void sacarCartaoCredito(double valor) {
		double juros=0;
		
		if(valor <= limiteCredito) {
			juros= (valor*10)/100; 
			
			limiteCredito-= (valor+juros);
			
		}
		
		

	}

	@Override
	public void despositarCartaoCredito(double valor) {
		limiteCredito+=valor;

	}

	@Override
	public void comprarCartaoCredito(double valor) {
		limiteCredito-=valor;

	}
	
	@Override
	public void transferir(double valor, Conta destino) {
		this.sacarCartaoCredito(valor);
		destino.depositar(valor);
		
	}

	@Override
	public void extratoLimite() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d" ,this.getNumeroCartao()));
		System.out.println(String.format("Saldo: %.2f",this.limiteCredito));

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getCodCeguranca() {
		return codCeguranca;
	}

	public void setCodCeguranca(int codCeguranca) {
		this.codCeguranca = codCeguranca;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
