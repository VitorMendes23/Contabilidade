package principal;

public class Comissionado extends Empregado{
	
	private double valorVendas;
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public Comissionado(String nome, String sobrenome, int numIdent, double valorVendas) {
		super(nome, sobrenome, numIdent);
		this.valorVendas = valorVendas;
	}

	public Comissionado() {
		super();
		this.valorVendas = 0;
	}

	public double getValorAPagar(int diaPagto, int mes) {

		return valorVendas * 0.06;
	}

}
