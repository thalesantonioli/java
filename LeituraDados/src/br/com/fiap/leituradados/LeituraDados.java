package br.com.fiap.leituradados;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		
		int numero2 = sc.nextInt();
		
		sc.close();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma �: " + soma);
		
		if(soma % 2 == 0) {
			System.out.println("A soma � par");
		} else {
			System.out.println("A soma � �mpar");
		}

	}

}
