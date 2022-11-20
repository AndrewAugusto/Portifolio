package singleton;

public class Singleton{
	public static void main(String[] args){
		ConfiguracaoBanco configuraBanco = new ConfiguracaoBanco("20/10/2022", "//.bd/com", "Tentativa de conexão com banco", 2);
		configuraBanco.conectarBanco("123pin456pin");
		Usuario usuario = new Usuario(1, "Andrew Santos", 5, "20/11/2022");
		usuario.acessarFuncionalidades(1);
	}
}