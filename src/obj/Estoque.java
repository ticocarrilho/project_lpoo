package obj;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private List<AbstractProdutos> listaEstoque;
	
	public Estoque() {
		listaEstoque = new ArrayList<AbstractProdutos>();
	}

	public void addEstoque(AbstractProdutos produto) {
		listaEstoque.add(produto);
	}	
	
	public void listAllEstoque() {
		for (AbstractProdutos abstractProdutos : listaEstoque) {
			System.out.println("entrou");
			System.out.println(abstractProdutos.toString());
		}
	}
	
}
