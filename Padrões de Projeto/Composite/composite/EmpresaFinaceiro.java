package composite;

public class Empresa implements Empresa{
	private int id;
	private String nome;

	public void printEmpresaName(){
		System.out.println(getClass().getSimpleName());
	}
	public Empresa(int id, String name){
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