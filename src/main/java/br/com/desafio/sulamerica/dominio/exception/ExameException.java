package br.com.desafio.sulamerica.dominio.exception;

public class ExameException extends Exception {

	/**
	 * Implementado tratamento de erro para o negócio
	 */
	private static final long serialVersionUID = 1L;

	public ExameException(String erro) {
		super(erro);
	}
}
