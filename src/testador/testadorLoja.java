package testador;

import obj.Fornecedores;
import obj.abstractProdutos;
import obj.produtosNaoPereciveis;
import obj.produtosPereciveis;

public class testadorLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testadorLoja testador;
		testador = new testadorLoja();
		
		int resultado = testador.menuPrincipal();
		System.out.println(resultado);
		Fornecedores ab=new Fornecedores(1, "2", "2", "2", "2");
		abstractProdutos t = new produtosPereciveis(1, "Nome", 
				45.0, 485.0, "40", ab, "Validade");
		System.out.println(t.getDataValidade());
	}
	
	public int menuPrincipal() {
		
		return 55;
		
	}
}
