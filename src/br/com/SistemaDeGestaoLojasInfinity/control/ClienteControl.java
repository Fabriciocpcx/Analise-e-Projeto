package br.com.SistemaDeGestaoLojasInfinity.control;

import br.com.SistemaDeGestaoLojasInfinity.model.Cliente;

public interface ClienteControl {

	public int cadastrarCliente(Cliente cliente);

	public void alterarCliente(Cliente cliente);

	public void excluirCliente();

}
