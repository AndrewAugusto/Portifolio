package singleton;

public class ConfiguracaoBanco{
	private String data;
	private String connectionString;
	private String obs;
	private int tipo;	
	
	public ConfiguracaoBanco(String data, String connectionString, String obs, int tipo){
		super();
		this.data = data;
		this.connectionString = connectionString;
		this.obs = obs;
		this.tipo = tipo;
	}
	public void conectarBanco(String connectionString ){
		if(this.connectionString != connectionString){
		  	Log var = Log.getInstance(this.data, this.obs, this.tipo);
			System.out.println(var);
		}
	}
}