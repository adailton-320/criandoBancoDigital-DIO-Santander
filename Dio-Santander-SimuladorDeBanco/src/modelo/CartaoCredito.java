package modelo;

public class CartaoCredito extends Cartao {

	public CartaoCredito(Cliente cliente) {
		super(cliente);
		
	}
	
	public void extratoLimite() {
		System.out.println(" ");
		System.out.println("### LIMITE CARTAO CREDITO###");
		System.out.println("-----------------------------");
		System.out.println(" ");
		super.extratoLimite();
	}

	
	
	

	

}
