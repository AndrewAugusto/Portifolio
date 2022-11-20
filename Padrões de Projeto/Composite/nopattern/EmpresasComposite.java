package nopatter;

public class EmpresasComposite{
	public static void main(String args[]){

		Empresas empresasVenda = new EmpresasVenda(1, "Departamento Venda");	        
		Empresas empresasFinaceiro = new EmpresasFinaceiro(2, "Departamento Finaceiro");
		EmpresasChefe empresasChefe = new EmpresasChefe(3, "Departamento Chefe");

		empresasChefe.addDepartamento(empresasVenda);
		empresasChefe.addDepartamento(empresasFinaceiro);
		empresasChefe.printEmpresasNome();
	}
}