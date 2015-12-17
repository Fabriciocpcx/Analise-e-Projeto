package br.com.SistemaDeGestaoLojasInfinity.control;

import br.com.SistemaDeGestaoLojasInfinity.model.Mercadoria;

public interface MercadoriaControl {

	public int cadastrarMercadoria(Mercadoria mercadoria);

	public void alterarMercadoria(Mercadoria mercadoria);

	public void excluirMercadoria();

}
