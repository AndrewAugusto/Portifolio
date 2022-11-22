package br.andrew.estrategia;

import br.andrew.estrategia.Funcionario;
import br.andrew.estrategia.Gerente;
import br.andrew.estrategia.Programador;

public class Teste {
	public static void main(String[] args) {		
		Funcionario Andrew = new Funcionario();
		Funcionario Kley = new Funcionario();

		Andrew.setNome("Andrew Santos");
		Kley.setNome("Kley Ferdiz");
		Andrew.setSalario(5738.00);
		Kley.setSalario(3468.00);
		Andrew.setBonificacao(new Gerente());
		Kley.setBonificacao(new Programador());

		System.out.println(Andrew.getBonificacao().calculoBonificacao(Andrew.getSalario()));
		System.out.println(Kley.getBonificacao().calculoBonificacao(Kley.getSalario()));
	}
}