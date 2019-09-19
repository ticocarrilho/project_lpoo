package testador;

import obj.Fornecedores;
import obj.AbstractProdutos;
import obj.ProdutosNaoPereciveis;
import obj.ProdutosPereciveis;

public class TestadorLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestadorLoja testador;
		testador = new TestadorLoja();
		
		int resultado = testador.menuPrincipal();
		System.out.println(resultado);
		Fornecedores ab=new Fornecedores(1, "2", "2", "2", "2");
		AbstractProdutos t = new ProdutosPereciveis(1, "Nome", 
				45.0, 485.0, "40", ab, "Validade");
		System.out.println(t.getDataValidade());
	}
	
	public int menuPrincipal() {
		
		return 55;
		
	}
}
