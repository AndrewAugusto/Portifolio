package nopatter;

import java.util.ArrayList;
import java.util.List;

public class EmpresasChefe extends Empresas {
	private int id;
	private String nome;
	private List<Empresas> empresas;

	public EmpresasChefe(int id, String name) {
		this.id = id;
		this.nome = name;
		this.empresas = new ArrayList<>();
	}

	@Override
	public void printEmpresaNome() {
		empresas.forEach(d -> d.printEmpresasNome());
	}
	public void addEmpresas(Empresas empresas) {
		empresas.add(empresas);
	}
	public void removeEmpresas(Empresas empresas) {
		empresas.remove(empresas);
	}
}