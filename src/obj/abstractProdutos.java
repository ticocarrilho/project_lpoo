package obj;

public  class abstractProdutos {
	private int idProduto;
	private String nomeProduto;
	private double precoProduto;
	private double pesoProduto;
	private String medidaPeso;
	private Fornecedores fornecedor;
	
	public abstractProdutos(int idProduto, String nomeProduto, double precoProduto, double pesoProduto,
			String medidaPeso, Fornecedores fornecedor) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.pesoProduto = pesoProduto;
		this.medidaPeso = medidaPeso;
		this.fornecedor = fornecedor;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public double getPesoProduto() {
		return pesoProduto;
	}

	public void setPesoProduto(double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}

	public String getMedidaPeso() {
		return medidaPeso;
	}

	public void setMedidaPeso(String medidaPeso) {
		this.medidaPeso = medidaPeso;
	}

	public Fornecedores getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedores fornecedor) {
		this.fornecedor = fornecedor;
	}

	//gerar construct e get/set
	
	
	
	
	
}
