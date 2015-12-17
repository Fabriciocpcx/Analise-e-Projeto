package br.com.SistemaDeGestaoLojasInfinity.control;

import br.com.SistemaDeGestaoLojasInfinity.model.Cliente;
import br.com.SistemaDeGestaoLojasInfinity.model.Funcionario;

public interface FuncionarioControl {

	public int cadastrarFuncionario(Funcionario funcionario);

	public void alterarFuncionario(Funcionario funcionario);

	public void excluirFuncionario();

}
