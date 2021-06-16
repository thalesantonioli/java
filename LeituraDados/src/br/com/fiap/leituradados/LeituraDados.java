package br.com.fiap.leituradados;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		
		int numero2 = sc.nextInt();
		
		sc.close();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma é: " + soma);
		
		if(soma % 2 == 0) {
			System.out.println("A soma é par");
		} else {
			System.out.println("A soma é ímpar");
		}

	}

}
