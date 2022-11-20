package composite;

import java.util.ArrayList;
import java.util.List;

public class EmpresaChefe{
	private int id;
	private String nome;
	private List<Empresa> empresas;

	public EmpresaChefe(int id, String name){
		this.id = id;
		this.nome = name;
		this.empresas = new ArrayList<>();
	}
	public void printEmpresaNome() {
		empresas.forEach(Empresa::printEmpresaName);
	}
	public void addEmpresa(Empresa Empresa){
		empresas.add(Empresa);
	}
	public void removeEmpresa(Empresa Empresa){
		empresas.remove(Empresa);
	}
}