package br.com.SistemaDeGestaoLojasInfinity.model;

import java.util.ArrayList;

public class Relatorios {

	private ArrayList<Mercadoria> mercadorias = new ArrayList<Mercadoria>();
	private ArrayList<Vendas> vendas = new ArrayList<Vendas>();
	private int totalCustoDeMercadorias;
	private int lucroTotal;
	private int saldoCaixa;
	private int valorTotalaReceber;// De vendas parceladas no crediario ou
									// cartao.

	public ArrayList<Mercadoria> getMercadorias() {
		return mercadorias;
	}

	public int getSaldoCaixa() {
		return saldoCaixa;
	}

	public void setSaldoCaixa(int saldoCaixa) {
		this.saldoCaixa = saldoCaixa;
	}

	public int getValorTotalaReceber() {
		return valorTotalaReceber;
	}

	public void setValorTotalaReceber(int valorTotalaReceber) {
		this.valorTotalaReceber = valorTotalaReceber;
	}

	public void setMercadorias(ArrayList<Mercadoria> mercadorias) {
		this.mercadorias = mercadorias;
	}

	public ArrayList<Vendas> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Vendas> vendas) {
		this.vendas = vendas;
	}

	public int getTotalCustoDeMercadorias() {
		return totalCustoDeMercadorias;
	}

	public void setTotalCustoDeMercadorias(int totalCustoDeMercadorias) {
		this.totalCustoDeMercadorias = totalCustoDeMercadorias;
	}

	public int getLucroTotal() {
		return lucroTotal;
	}

	public void setLucroTotal(int lucroTotal) {
		this.lucroTotal = lucroTotal;
	}

}
