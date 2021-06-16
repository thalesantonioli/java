package br.com.fiap.leituradados;

import java.util.Scanner;

public class CalcularImc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura");
		
		float altura = sc.nextFloat();
		
		System.out.println("Digite seu peso");
		
		float peso = sc.nextFloat();
		
		sc.close();
		
		float imc = peso / (altura * altura);
		
		if(imc >= 18.5 && imc <= 25) {
			System.out.println("Peso ideal");
		} else {
			System.out.println("Fora do peso normal");
		}

	}

}
