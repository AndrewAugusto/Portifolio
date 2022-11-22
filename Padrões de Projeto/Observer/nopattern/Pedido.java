package nopatter;

public class Pedido {
	
	public int getNumero() {
		return numero;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getData() {
		return data;
	}
	
	private int numero;
	private String nomeCliente;	
	private String data;
	
	public Pedido(int numero, String nomeCliente, String data) {
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.data = data;	
	}
	public void executarAcao(Pedido pedido) {	
	}
}