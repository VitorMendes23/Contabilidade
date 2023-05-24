package principal;

public class Concessionaria extends Conta {
	
	public double getValorAPagar(int diaPagto, int mes) {

		return valor;
	}
	
	public Concessionaria(int dia, int mes, double valor) {
		super(dia, mes, valor);
	}
	
	public Concessionaria() {
		super();
	}

}
