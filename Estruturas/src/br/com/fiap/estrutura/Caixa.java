package br.com.fiap.estrutura;

public class Caixa {

	public static void main(String[] args) {
		
		int qtdProdutos = 5;
		int registro = 0;
		
		System.out.println("while");
		
		while(registro < qtdProdutos) {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado");
		}
		
		registro = 0;
		
		System.out.println("do / while");
		
		do {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado");
		} while(registro < qtdProdutos);
		
		System.out.println("for");
		
		for(registro = 1; registro <= qtdProdutos; registro++ ) {
			System.out.println("O produto número " + registro + " foi registrado");
		}
	}
	
}
