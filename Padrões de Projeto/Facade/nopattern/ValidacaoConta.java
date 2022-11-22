package nopatter;

import java.time.LocalDate;

public class ValidacaoConta {
	private LocalDate data = LocalDate.now();

	public boolean ValidarConta(BankAccount conta) {
		if (conta.getValidadeConta().isAfter(data)) {
			return true;
		}
		return false;
	}
	public boolean transfeir(double valor, BankAccount outra, BankAccount conta) {
		if (conta.getSaldo() < 0 || conta.getSaldo() < valor) {
			System.out.println("Saldo insuficiente para transferência");
			return false;
		}
		return true;
	}
}