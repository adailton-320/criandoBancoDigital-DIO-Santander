package modelo;

import servico.IntConta;

public abstract class Conta implements IntConta {
	
	private static final int AGENCIA_PADRAO= 100;
	private static int NUMEROCONTA=1;
	
	private String nome;
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		
		agencia= Conta.AGENCIA_PADRAO;
		numeroConta= NUMEROCONTA++;
		this.cliente= cliente;
	
	}
	
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
		
	}
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void transferir(Conta contaDestino, double valor) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void iprimirExtratoPrincipal() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d" ,this.getAgencia()));
		System.out.println(String.format("Conta: %d",this.getNumeroConta()));
		System.out.println(String.format("Saldo: %.2f",this.getSaldo()));
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public Cliente getCliente() {
		return cliente;
	}


	

	
	
	
	
	

}
