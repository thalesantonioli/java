package br.com.fiap.estrutura;

public class ManipularString {

	public static void main(String[] args) {

		// String nome = new String();
		// nome = "\"FIAP \nA melhor\t faculdade\\ de tecnologia\"";

		String nome = "FIAP";
		String slogan = "A melhor faculdade de tecnologia, faculdade";
		String faculdade = nome;
		faculdade += " - ";
		faculdade += slogan;

		System.out.println(faculdade);

		String nome1 = new String("FIAP");
		String nome2 = new String("FIAP");

		//comparando endereço de memória e não o valor
		if (nome1 == nome2) {
			System.out.println("As Strings são iguais");
		} else {
			System.out.println("As String são diferentes");
		}
		
		//diferencia letras maiúsculas de minúsculas
		if (nome1.equals(nome2)) {
			System.out.println("As Strings são iguais");
		} else {
			System.out.println("As String são diferentes");
		}
		
		//NÃO diferencia letras maiúsculas de minúsculas
		if (nome1.equalsIgnoreCase("fiap")) {
			System.out.println("As Strings são iguais");
		} else {
			System.out.println("As String são diferentes");
		}
		
		//diferencia letras maiúsculas de minúsculas
		if(faculdade.startsWith("FIAP")) {
			System.out.println("A String começa com FIAP");
		}else {
			System.out.println("A String não começa com FIAP");
		}
		
		//diferencia letras maiúsculas de minúsculas
		if(faculdade.endsWith("gia")) {
			System.out.println("A String termina com gia");
		}else {
			System.out.println("A String não termina com gia\"");
		}
		
		System.out.println("A String \"" + faculdade + "\" possui " + faculdade.length() + " caracteres");
		
		System.out.println("O segundo caracter é \"" + faculdade.charAt(1) + "\"");
		
		//primeira ocorrência de uma palavra ou caracter
		System.out.println("O indice do primeiro caracter 'a' na string é " + faculdade.indexOf("a"));
		
		//retorno igual a -1 não possui o caracter ou palavra
		System.out.println("O indice do primeiro caracter 'a' na string é " + faculdade.indexOf("x"));
		
		System.out.println("O indice da palavra \"faculdade\" na string é " + faculdade.indexOf("faculdade"));
		
		//último ocorrência de uma palavra ou caracter
		System.out.println("O indice do último caracter 'a' na string é " + faculdade.lastIndexOf("a"));
	
		System.out.println("O indice da última palavra \"faculdade\" na string é " + faculdade.lastIndexOf("faculdade"));
	
		String nova = faculdade.substring(16, 25);
		
		System.out.println("A nova string é: " + nova);
		
		nova = faculdade.substring(faculdade.indexOf('m'), 25);
		
		System.out.println("A nova string é: " + nova);
		
		nova = faculdade.substring(16);
		
		System.out.println("A nova string é: " + nova);
		
		nova = faculdade.substring(faculdade.lastIndexOf('t'));
		
		System.out.println("A nova string é: " + nova);
		
		System.out.println("A nova string é: " + faculdade.toLowerCase());
		
		System.out.println("A nova string é: " + faculdade.toUpperCase());
		
		System.out.println("A nova string é: " + faculdade.replace('a', 'x'));
		
		System.out.println("A nova string é: " + faculdade.replace("tecnologia", "São Paulo"));
		
		String[] palavras = faculdade.split(" ");
		
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
