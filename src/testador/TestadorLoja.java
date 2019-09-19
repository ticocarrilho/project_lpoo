package testador;

import java.util.Scanner;

import obj.AlimentosNaoPereciveis;
import obj.Estoque;
import obj.Fornecedores;

public class TestadorLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestadorLoja testador;
		testador = new TestadorLoja();
		Scanner in = new Scanner(System.in);

		//testador.menuLogin(in);
		Estoque estoque = new Estoque();
		Fornecedores forn = new Fornecedores("NomeFor", "CPNJFor", "EmailFor", "TelefoneFor");
		AlimentosNaoPereciveis a = new AlimentosNaoPereciveis("Nome1", "Tipo1",
				45.0, 45.0, "kg", forn, false);
		AlimentosNaoPereciveis b = new AlimentosNaoPereciveis("Nome2", "Tipo2",
				45.0, 45.0, "kg", forn, false);
		estoque.addEstoque(a);
		estoque.addEstoque(b);
		estoque.listAllEstoque();
		
		in.close();

	}
	
	public void menuLogin(Scanner in) {
		int sair = 0;
		while(sair!=0) {
			
		}
		
	}
}
