package principal;

public class Tercerizado extends Empregado{
	
	private double horasTrabalhadas;
		
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public Tercerizado(String nome, String sobrenome, int numIdent, double horasTrabalhadas) {
		super(nome, sobrenome, numIdent);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Tercerizado() {
		super();
		this.horasTrabalhadas = 0;
	}

	public double getValorAPagar(int diaPagto, int mes) {
		
		return horasTrabalhadas * HORA;
	}
	
}
