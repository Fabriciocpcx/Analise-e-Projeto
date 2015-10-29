package br.com.SistemaDeGestaoLojasInfinity.model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
// teste
	
	public Cliente(String nome, int rg, int cpf, Endereco endereco,
			int telefone, String email, double limite, ArrayList<Vendas> compras) {
		super(nome, rg, cpf, endereco, telefone, email);
		this.limite = limite;
		this.compras = compras;
	}
	private double limite;
	private ArrayList<Vendas> compras = new ArrayList<Vendas>();
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public ArrayList<Vendas> getCompras() {
		return compras;
	}
	public void setCompras(ArrayList<Vendas> compras) {
		this.compras = compras;
	}
	
}
