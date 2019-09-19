package obj;

public class ProdutosPereciveis extends AbstractProdutos {
	private String dataValidade;

	public ProdutosPereciveis(int idProduto, String nomeProduto, double precoProduto, double pesoProduto,
			String medidaPeso, Fornecedores fornecedor, String dataValidade) {
		super(idProduto, nomeProduto, precoProduto, pesoProduto, medidaPeso, fornecedor);
		this.dataValidade = dataValidade;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	


	
	
	
}
