package nopatter;

public class EnviaEmail extends Pedido {
	public EnviaEmail(int numero, String nomeCliente, String data) {
		super(numero, nomeCliente, data);
	}
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviado");	
	}
}