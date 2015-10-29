package br.com.SistemaDeGestaoLojasInfinity.model;

public class Endereco {
	public Endereco(String cidade, String rua, int numero, String bairro,
			int cEP, String referencia) {
		super();
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		CEP = cEP;
		this.referencia = referencia;
	}
	
	private String cidade;
	private String rua;
	private int numero;
	private String bairro;
	private int CEP;
	private String referencia;


	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

}
