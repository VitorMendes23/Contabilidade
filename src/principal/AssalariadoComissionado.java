package principal;

public class AssalariadoComissionado extends Comissionado {
	
	private double percentualBonus;

	public double getPercentualBonus() {
		return percentualBonus;
	}

	public void setPercentualBonus(double percentualBonus) {
		this.percentualBonus = percentualBonus;
	}
	
	public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double valorVendas,
			double percentualBonus) {
		super(nome, sobrenome, numIdent, valorVendas);
		this.percentualBonus = percentualBonus;
	}

	public AssalariadoComissionado() {
		super();
		this.percentualBonus = 0;
	}

	public double getValorAPagar(int diaPagto, int mes) {
		
		double valorVendas = getValorVendas() ;

		double salarioFinal = valorVendas * (percentualBonus/100); //pega o valor em cima das vendas realizadas
		
		return salarioFinal + SALARIO + (SALARIO * 0.1); //+10% do salário
	}

}
