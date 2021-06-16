package br.com.fiap.banco;

import java.io.Serializable;

import br.com.fiap.excecao.SaldoInsuficienteException;

public final class ContaCorrente extends Conta implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipo;

	private double chequeEspecial;

	public ContaCorrente() {

	}

	public ContaCorrente(double saldo, int agencia, int numero, String tipo) {
		super(saldo, agencia, numero);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public double verificarSaldo() {
		return super.saldo + this.chequeEspecial;
	}

	// Sobrescrever o método da super classe
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		valor += 10;
		super.retirar(valor);
	}
}
