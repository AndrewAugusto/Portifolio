package nopatter;

public class EmpresasFinaceiro extends Empresas{
	private int id;
	private String nome;

	@Override
	public void printEmpresasNome(){
		System.out.println(nome);
	}
	public EmpresasFinaceiro(int id, String name){
		super();
		this.id = id;
		this.nome = name;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return nome;
	}
	public void setName(String name){
		this.nome = name;
	}
}