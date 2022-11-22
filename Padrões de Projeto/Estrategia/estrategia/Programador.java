package br.andrew.estrategia;

import br.andrew.estrategia.Bonificacao;

public class Programador implements Bonificacao {
	@Override
	public double calculoBonificacao(double salario) {
		return salario + (salario * 0.05);
	}
}