package obj;

public class AbstractAlimentos extends AbstractProdutos{
	private boolean produtoLiquido;

	public AbstractAlimentos(int idProduto, String nomeProduto, double precoProduto, double pesoProduto,
			String medidaPeso, Fornecedores fornecedor, boolean produtoLiquido) {
		super(idProduto, nomeProduto, precoProduto, pesoProduto, medidaPeso, fornecedor);
		this.produtoLiquido = produtoLiquido;
	}

	public boolean isProdutoLiquido() {
		return produtoLiquido;
	}

	public void setProdutoLiquido(boolean produtoLiquido) {
		this.produtoLiquido = produtoLiquido;
	}
	

}
