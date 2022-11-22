package model;

public class EmailPedido implements NotificandoPedido {
	private Email email = new Email();
	@Override
	public void notificar(String acao) {
		String enviaEmail = "Email envidado " + acao;	
	}

	public void cadastrarPedido(Pedido pedido) {
		email.setDestinatario(pedido.getNomeCliente());
		email.setConteudo("Pedido realizado");
	}
}