package testador;

import java.util.Scanner;

import obj.AbstractProdutos;
import obj.AlimentosNaoPereciveis;
import obj.Eletronicos;
import obj.Estoque;
import obj.Fornecedores;

public class TestadorLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/*TestadorLoja testador;
		testador = new TestadorLoja();
		testador.menuLogin(in);*/
		
		Estoque estoque = new Estoque();
		Fornecedores forn = new Fornecedores("NomeFor", "CPNJFor", "EmailFor", "TelefoneFor");
		AbstractProdutos a = new AlimentosNaoPereciveis("Nome1", "Tipo1",
				45.0, 45.0, "kg", forn, false);
		
		estoque.addEstoque(a);
		
		a = new Eletronicos("Nome Eletro", "Tipo Eletro",
				34.5, 45.3, "teste", forn, 10, 10, 10);
		
		estoque.addEstoque(a);
		
		estoque.listAllEstoque();
		
		in.close();

	}
	
	/*public void menuLogin(Scanner in) {
		int sair = 0;
		while(sair!=0) {
			
		}
		
	}*/
}
