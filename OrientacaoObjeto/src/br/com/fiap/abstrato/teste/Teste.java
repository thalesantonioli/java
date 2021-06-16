package br.com.fiap.abstrato.teste;

import br.com.fiap.abstrato.Circulo;
import br.com.fiap.abstrato.Forma;

public class Teste {

	public static void main(String[] args) {
		
		Forma forma = new Circulo(2);

		System.out.println(forma.calcularArea());

	}

}
