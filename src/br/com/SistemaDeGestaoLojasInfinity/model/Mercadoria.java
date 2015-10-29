package br.com.SistemaDeGestaoLojasInfinity.model;

public class Mercadoria {

	public Mercadoria(int codigo, double precoDeCusto, double precoFinal,
			int quantidadeEmEstoque) {
		super();
		this.codigo = codigo;
		this.precoDeCusto = precoDeCusto;
		this.precoFinal = precoFinal;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	private int codigo;
	private double precoDeCusto;
	private double precoFinal;
	private int quantidadeEmEstoque;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecoDeCusto() {
		return precoDeCusto;
	}

	public void setPrecoDeCusto(double precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

}
