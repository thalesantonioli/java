package br.com.fiap.banco;

import java.io.Serializable;

import br.com.fiap.excecao.SaldoInsuficienteException;
import br.com.fiap.excecao.ValorInvalidoException;

/**
 * Classe que abstrai uma conta bancária
 * 
 * @author thales
 * @version 1.0
 */
public abstract class Conta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Saldo da conta
	 */
	protected double saldo;
	/**
	 * Número da agência
	 */
	private int agencia;
	/**
	 * Número da conta
	 */
	private int numero;


	/*
	 * Construtores da Classe Conta
	 */
	public Conta() {

	}

	public Conta(double saldo, int agencia, int numero) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
	}

	/**
	 * 
	 * Retira um valor do saldo da conta
	 * 
	 * @param valor Valor a ser retirado
	 * @see depositar
	 */
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= valor;
	}

	/**
	 * Deposita um valor ao saldo da conta
	 * 
	 * @param valor Valor a ser depositado
	 */
	public void depositar(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException();
		}
		this.saldo += valor;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public abstract double verificarSaldo();

}
