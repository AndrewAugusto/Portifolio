package nopatter;

public class SalvaPedidoBancoDados extends Pedido{

	public SalvaPedidoBancoDados(int numero, String nomeCliente, String data) {
		super(numero, nomeCliente, data);
	}
	@Override
	public void executarAcao(Pedido pedido) {
       System.out.println("Pedido salvo");
	}
}