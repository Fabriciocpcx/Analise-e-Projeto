package br.com.SistemaDeGestaoLojasInfinity.model;

public class Pagamento {

	public Pagamento(int codVenda) {
		super();
		this.setCodVenda(codVenda);
	}

	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	private int codVenda;

}
