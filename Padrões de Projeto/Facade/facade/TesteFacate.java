package facade;

import java.time.LocalDate;
import java.time.Month;

public class TesteFacate {
	public static void main(String[] args) {
		BankAccount contaCorrente = new ContaCorrenteFacade(LocalDate.of(2025, Month.OCTOBER, 20), 125,"Andrew Santos");
		BankAccount contaCorrente2 = new ContaCorrenteFacade(LocalDate.of(2025, Month.OCTOBER, 20), 1050,"Rogério");
		contaCorrente.transfeir(200, contaCorrente2);
	}
}