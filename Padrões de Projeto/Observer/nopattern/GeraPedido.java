package nopatter;

public class GeraPedido {
	public void execute(Pedido pedido) {
		System.out.println("Executado");	
		pedido.executarAcao(pedido);
	}
}