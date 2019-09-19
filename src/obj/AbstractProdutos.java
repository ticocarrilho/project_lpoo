package obj;

public  class AbstractProdutos {
	private String nomeProduto;
	private String tipoProduto;
	private double precoProduto;
	private double pesoProduto;
	private String medidaPeso;
	private Fornecedores fornecedor;
	
	public AbstractProdutos(String nomeProduto, String tipoProduto, double precoProduto,
			double pesoProduto, String medidaPeso, Fornecedores fornecedor) {
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.precoProduto = precoProduto;
		this.pesoProduto = pesoProduto;
		this.medidaPeso = medidaPeso;
		this.fornecedor = fornecedor;
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

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	@Override
	public String toString() {
		return "AbstractProdutos [nomeProduto=" + nomeProduto + ", tipoProduto=" + tipoProduto + ", precoProduto="
				+ precoProduto + ", pesoProduto=" + pesoProduto + ", medidaPeso=" + medidaPeso + ", fornecedor="
				+ fornecedor.toString() + "]";
	}

	
	
	
	
	
	
}
