package br.com.fiap.estrutura;

import java.util.Scanner;

public class Estrutura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcao;

		do {
			System.out.println("Digite um n�mero");
			int n1 = sc.nextInt();
			System.out.println("Digite outro n�mero");
			int n2 = sc.nextInt();
			System.out.println("A soma � " + (n1 + n2));
			System.out.println("Deseja somar outro n�mero? (S/N)");
			opcao = sc.next();
		} while (opcao.equals("S"));

		sc.close();

	}

}
