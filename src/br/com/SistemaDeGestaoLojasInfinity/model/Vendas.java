package br.com.SistemaDeGestaoLojasInfinity.model;

import java.util.ArrayList;
import java.util.Date;

public class Vendas {

	private ArrayList<Mercadoria> mercadorias = new ArrayList<Mercadoria>();
	private int codVenda;
	private Date data;
	private Funcionario funcionario;

	public ArrayList<Mercadoria> getMercadorias() {
		return mercadorias;
	}

	public void setMercadorias(ArrayList<Mercadoria> mercadorias) {
		this.mercadorias = mercadorias;
	}

	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codVenda;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendas other = (Vendas) obj;
		if (codVenda != other.codVenda)
			return false;
		return true;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
