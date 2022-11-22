package nopatter;

public class TesteNo {

	public static void main(String[] args) {
		FuncionarioNo andrew = new GerenteNo();
		andrew.setNome("Andrew Santos");
		andrew.setSalario(5746.00);
		System.out.println(andrew.calculoBonificacao(andrew.getSalario()));	
		
	FuncionarioNo kley = new ProgramadorNo();
		kley.setNome("Kley Jonas");
		kley.setSalario(2567.00);
		System.out.println(kley.calculoBonificacao(kley.getSalario()));	
	}
}