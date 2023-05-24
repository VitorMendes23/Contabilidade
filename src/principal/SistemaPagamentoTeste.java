package principal;
import java.util.Scanner;

public class SistemaPagamentoTeste {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		ControlePagamento controlePagamento = new ControlePagamento();
		
		//adicionando previamente alguns gastos fixos no sistema
		//Conta titulo1 = new Titulo(7,5,120);
		controlePagamento.adicionaPagamento(new Titulo(10,6,120));//int dia, int mes, double valor
		controlePagamento.adicionaPagamento(new Concessionaria(7,6,150));//int dia, int mes, double valor
		
		controlePagamento.adicionaPagamento(new Assalariado("Vitor","Mendes",1121150,1));//String nome, String sobrenome, int numIdent, double horasExtras
		controlePagamento.adicionaPagamento(new Tercerizado("Pedro","Souza",1121566,50));//String nome, String sobrenome, int numIdent, double horasTrabalhadas
		controlePagamento.adicionaPagamento(new Comissionado("Lucas","Penido",5761566,12000));//String nome, String sobrenome, int numIdent, double valorVendas
		controlePagamento.adicionaPagamento(new AssalariadoComissionado("Lucas","Penido",5761556,12000,10));//String nome, String sobrenome, int numIdent, double valorVendas, double percentualBonus


		
		//System.out.print("quantidade de itens " + controlePagamento.getPagamentos().size());
		
		System.out.print("Bem vindo ao sistema de controle ge gastos passivos! \n\n" );
//		System.out.print("Os seguintes gastos estão cadastratos no sistema:  \n" );
		
		
		double valorTotal = 0;
		
			
			for(Passivo passivo : controlePagamento.getPagamentos()) {
				String nomeGasto = "";
				if(passivo instanceof Titulo)
					nomeGasto = "Titulo";
				else if(passivo instanceof Concessionaria)
					nomeGasto = "Concessionaria";
				else if(passivo instanceof Assalariado)
					nomeGasto = "Assalariado";
				else if(passivo instanceof Tercerizado)
					nomeGasto = "Tercerizado";
				else if(passivo instanceof AssalariadoComissionado)
					nomeGasto = "AssalariadoComissionado";
				else if(passivo instanceof Comissionado)
					nomeGasto = "Comissionado";

				
				System.out.print("Um(a) "+ nomeGasto + " possui um gasto de " + passivo.getValorAPagar(10, 10) +" ! \n" );
		
					
				valorTotal += passivo.getValorAPagar(01, 10);
			}
			System.out.print("\n O total de gastos no momento é : "+ valorTotal +"  \n\n" );
		}
	} 

			