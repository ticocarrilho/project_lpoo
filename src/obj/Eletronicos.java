package obj;

public class Eletronicos extends AbstractProdutos{
	private double alturaCaixa;
	private double comprimentoCaixa;
	private double larguraCaixa;
	public Eletronicos(String nomeProduto, String tipoProduto, double precoProduto, double pesoProduto,
			String medidaPeso, Fornecedores fornecedor, double alturaCaixa, double comprimentoCaixa,
			double larguraCaixa) {
		super(nomeProduto, tipoProduto, precoProduto, pesoProduto, medidaPeso, fornecedor);
		this.alturaCaixa = alturaCaixa;
		this.comprimentoCaixa = comprimentoCaixa;
		this.larguraCaixa = larguraCaixa;
	}
	public double getAlturaCaixa() {
		return alturaCaixa;
	}
	public void setAlturaCaixa(double alturaCaixa) {
		this.alturaCaixa = alturaCaixa;
	}
	public double getComprimentoCaixa() {
		return comprimentoCaixa;
	}
	public void setComprimentoCaixa(double comprimentoCaixa) {
		this.comprimentoCaixa = comprimentoCaixa;
	}
	public double getLarguraCaixa() {
		return larguraCaixa;
	}
	public void setLarguraCaixa(double larguraCaixa) {
		this.larguraCaixa = larguraCaixa;
	}
	
	public double getVolumeCaixa() {
		double tamanho = 0;
		tamanho = this.alturaCaixa*this.comprimentoCaixa*this.larguraCaixa;
		return tamanho;
	}
	@Override
	public String toString() {
		return super.toString() +  " Eletronicos [alturaCaixa=" + alturaCaixa + ", comprimentoCaixa=" + comprimentoCaixa + ", larguraCaixa="
				+ larguraCaixa + ", getVolumeCaixa()=" + getVolumeCaixa() + "]";
	}
	
	
}

