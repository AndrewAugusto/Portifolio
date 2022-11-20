package singleton;

public class Log{
	private String data;
	private String descricao;
	private int tipo;
	private static Log instancia = new Log();

	public static Log getInstance(String data, String descricao, int tipo){
		instancia.data = data;
		instancia.descricao = descricao;
		instancia.tipo = tipo;
		return instancia;
	}
	public String getData(){
		return data;
	}
	public String getDescricao(){
		return descricao;
	}
	public int getTipo(){
		return tipo;
	}
	@Override
	public String toString(){
		return "Log [data=" + data + ", descricao=" + descricao + ", tipo=" + tipo + "]";
	}
}