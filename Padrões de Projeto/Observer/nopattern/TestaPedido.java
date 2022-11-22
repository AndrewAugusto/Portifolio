package nopatter;

public class TestaPedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(0166, "Andrew Santos", "20/10/2022");
		GeraPedido geraPedido = new GeraPedido();
		SalvaPedidoBancoDados salvaPedidoBanco = new SalvaPedidoBancoDados(pedido.getNumero(), pedido.getNomeCliente(), pedido.getData());
		EnviaEmail  enviaEmailPedido = new EnviaEmail(pedido.getNumero(), pedido.getNomeCliente(), pedido.getData());

		geraPedido.execute(salvaPedidoBanco);	 
		geraPedido.execute(enviaEmailPedido);
	}
}