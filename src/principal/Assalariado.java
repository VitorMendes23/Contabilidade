package principal;

public class Assalariado extends Empregado{

	private double horasExtras;
	
	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	public Assalariado(String nome, String sobrenome, int numIdent, double horasExtras) {
		super(nome, sobrenome, numIdent);
		this.horasExtras = horasExtras;
	}

	public Assalariado() {
		super();
		this.horasExtras = 0;
	}

	public double getValorAPagar(int diaPagto, int mes) {

		if(horasExtras > 0)
			return SALARIO + (HORA * horasExtras);
		else
			return SALARIO;
	}

}
