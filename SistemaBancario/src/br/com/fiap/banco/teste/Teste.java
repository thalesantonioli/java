package br.com.fiap.banco.teste;

import br.com.fiap.banco.Conta;
import br.com.fiap.banco.ContaCorrente;
import br.com.fiap.banco.ContaPoupanca;
import br.com.fiap.excecao.SaldoInsuficienteException;

public class Teste {

	public static void main(String[] args) {
		Conta cc = new ContaPoupanca(1000, 1234, 256);

		cc.depositar(600);

		try {
			cc.retirar(500);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

		System.out.println(cc.verificarSaldo());

		if (cc instanceof Conta) {
			System.out.println("cc é do tipo Conta");
		} else {
			System.out.println("cc não é do tipo Conta");
		}

		if (cc instanceof ContaCorrente) {
			System.out.println("cc é do tipo ContaCorrente");
		} else {
			System.out.println("cc não é do tipo ContaCorrente");
		}

	}
}
