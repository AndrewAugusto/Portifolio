package composite;

public class EmpresaComposite{
	public static void main(String args[]){
		Empresa empresaVenda = new EmpresaVenda(1, "Empresa Venda");
		Empresa empresaFinaceiro = new EmpresaFinaceiro(2, "Empresa Finaceiro");
		EmpresaChefe empresaChefe = new EmpresaChefe(3, "Empresa Chefe");

		empresaChefe.addEmpresa(empresaVenda);
		empresaChefe.addEmpresa(empresaFinaceiro);
		empresaChefe.printEmpresaNome();
	}
}