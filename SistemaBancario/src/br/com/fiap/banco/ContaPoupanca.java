package br.com.fiap.banco;

import java.io.Serializable;

public final class ContaPoupanca extends Conta implements Serializable {

	private static final long serialVersionUID = 1L;

	public double verificarSaldo() {
		return super.saldo;
	}

	public ContaPoupanca() {

	}

	public ContaPoupanca(double saldo, int agencia, int numero) {
		super(saldo, agencia, numero);
	}

}
