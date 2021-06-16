package br.com.fiap.estatico.teste;

import br.com.fiap.estatico.AcessoCatraca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Total: " + AcessoCatraca.recuperarTotal());
		
		AcessoCatraca a1 = new AcessoCatraca();
		a1.entrar("João");
		
		System.out.println("Total: " + AcessoCatraca.recuperarTotal());
		
		AcessoCatraca a2 = new AcessoCatraca();
		a2.entrar("Thales");
		
		System.out.println("Total: " + AcessoCatraca.recuperarTotal());
	}
	
}
