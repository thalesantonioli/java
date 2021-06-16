package br.com.fiap.estrutura;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float[] notas = new float[5];
		float totalNotas = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do aluno");
			notas[i] = sc.nextFloat();
			totalNotas += notas[i];
		}

		sc.close();

		float media = totalNotas / notas.length;

		System.out.println("Média: " + media);

	}

}
