package br.andrew.estrategia;

import br.andrew.estrategia.Bonificacao;

public class Funcionario {
	private String nome;
	private double salario;
	private Bonificacao bonificacao;
   
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Bonificacao getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(Bonificacao bonificacao) {
		this.bonificacao = bonificacao;
	}
}