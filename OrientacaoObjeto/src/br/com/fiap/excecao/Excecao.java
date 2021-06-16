package br.com.fiap.excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite o primeiro número");
			int numero1 = sc.nextInt();

			System.out.println("Digite o segundo número");
			int numero2 = sc.nextInt();

			int divisao = numero1 / numero2;

			System.out.println("O resultado é: " + divisao);
		} catch (ArithmeticException e) {
			System.err.println("Erro ao dividir!");
		} catch (InputMismatchException e) {
			System.err.println("Erro de entrada de dados!");
		} finally {
			sc.close();
			System.out.println("Fechando o Scanner!");
		}

		int[] array = new int[2];

		try {
			array[3] = 5;
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Mensagem de erro: " + e.getMessage());
		}

	}

}
