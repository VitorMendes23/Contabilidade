package principal;

public class Titulo extends Conta{
	
	
	public double getValorAPagar(int diaPagto, int mes) {
		
		if(this.dia >= diaPagto && this.mes >= mes) 
			return valor;
		else
			return valor + (valor * 0.1);
			
	}
	
	public Titulo(int dia, int mes, double valor) {
		super(dia, mes, valor);
	}
	
	public Titulo() {
		super();
	}
	

}
