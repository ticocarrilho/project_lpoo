package obj;

public class AlimentosPereciveis extends AbstractAlimentos {
	private String dataValidade;

	public AlimentosPereciveis(String nomeProduto, String tipoProduto, double precoProduto,
			double pesoProduto, String medidaPeso, Fornecedores fornecedor, boolean produtoLiquido,
			String dataValidade) {
		super(nomeProduto, tipoProduto, precoProduto, pesoProduto, medidaPeso, fornecedor, produtoLiquido);
		this.dataValidade = dataValidade;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	


	
	
	
}
