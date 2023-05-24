package principal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class ControlePagamento {
	
	private ArrayList<Passivo> pagamentos;

	public ArrayList<Passivo> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(ArrayList<Passivo> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public ControlePagamento(ArrayList<Passivo> pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	public ControlePagamento() {
		this.pagamentos = new ArrayList<Passivo>();
	}
	 
	public void adicionaPagamento(Passivo pagamento) {
		pagamentos.add(pagamento);
	}
	public void removePagamento(Passivo pagamento) {
		pagamentos.remove(pagamento);
	}

	public int hashCode() {
		return Objects.hash(pagamentos);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ControlePagamento other = (ControlePagamento) obj;
		return Objects.equals(pagamentos, other.pagamentos);
	}
	

}
