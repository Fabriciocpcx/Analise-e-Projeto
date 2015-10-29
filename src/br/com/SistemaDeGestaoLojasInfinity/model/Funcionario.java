package br.com.SistemaDeGestaoLojasInfinity.model;

public class Funcionario extends Pessoa {

	public Funcionario(int iD, String senha, boolean supervisor,
			double salario, String nome, int rg, int cpf, Endereco endereco,
			int telefone, String email) {
		super(nome, rg, cpf, endereco, telefone, email);
		ID = iD;
		Senha = senha;
		Supervisor = supervisor;
		this.salario = salario;
	}

	private int ID;
	private String Senha;
	private boolean Supervisor;
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public boolean isSupervisor() {
		return Supervisor;
	}

	public void setSupervisor(boolean supervisor) {
		Supervisor = supervisor;
	}

}
