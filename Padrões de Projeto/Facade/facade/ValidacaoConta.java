package facade;

import java.time.LocalDate;

public class ValidacaoConta implements Valida {
	private LocalDate data = LocalDate.now ();
	@Override
	public boolean ValidarConta(BankAccount conta) {
		if (conta.getValidadeConta().isAfter(data)) {
			return true;
		}
		return false;
	}
}