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

		//comparando endere�o de mem�ria e n�o o valor
		if (nome1 == nome2) {
			System.out.println("As Strings s�o iguais");
		} else {
			System.out.println("As String s�o diferentes");
		}
		
		//diferencia letras mai�sculas de min�sculas
		if (nome1.equals(nome2)) {
			System.out.println("As Strings s�o iguais");
		} else {
			System.out.println("As String s�o diferentes");
		}
		
		//N�O diferencia letras mai�sculas de min�sculas
		if (nome1.equalsIgnoreCase("fiap")) {
			System.out.println("As Strings s�o iguais");
		} else {
			System.out.println("As String s�o diferentes");
		}
		
		//diferencia letras mai�sculas de min�sculas
		if(faculdade.startsWith("FIAP")) {
			System.out.println("A String come�a com FIAP");
		}else {
			System.out.println("A String n�o come�a com FIAP");
		}
		
		//diferencia letras mai�sculas de min�sculas
		if(faculdade.endsWith("gia")) {
			System.out.println("A String termina com gia");
		}else {
			System.out.println("A String n�o termina com gia\"");
		}
		
		System.out.println("A String \"" + faculdade + "\" possui " + faculdade.length() + " caracteres");
		
		System.out.println("O segundo caracter � \"" + faculdade.charAt(1) + "\"");
		
		//primeira ocorr�ncia de uma palavra ou caracter
		System.out.println("O indice do primeiro caracter 'a' na string � " + faculdade.indexOf("a"));
		
		//retorno igual a -1 n�o possui o caracter ou palavra
		System.out.println("O indice do primeiro caracter 'a' na string � " + faculdade.indexOf("x"));
		
		System.out.println("O indice da palavra \"faculdade\" na string � " + faculdade.indexOf("faculdade"));
		
		//�ltimo ocorr�ncia de uma palavra ou caracter
		System.out.println("O indice do �ltimo caracter 'a' na string � " + faculdade.lastIndexOf("a"));
	
		System.out.println("O indice da �ltima palavra \"faculdade\" na string � " + faculdade.lastIndexOf("faculdade"));
	
		String nova = faculdade.substring(16, 25);
		
		System.out.println("A nova string �: " + nova);
		
		nova = faculdade.substring(faculdade.indexOf('m'), 25);
		
		System.out.println("A nova string �: " + nova);
		
		nova = faculdade.substring(16);
		
		System.out.println("A nova string �: " + nova);
		
		nova = faculdade.substring(faculdade.lastIndexOf('t'));
		
		System.out.println("A nova string �: " + nova);
		
		System.out.println("A nova string �: " + faculdade.toLowerCase());
		
		System.out.println("A nova string �: " + faculdade.toUpperCase());
		
		System.out.println("A nova string �: " + faculdade.replace('a', 'x'));
		
		System.out.println("A nova string �: " + faculdade.replace("tecnologia", "S�o Paulo"));
		
		String[] palavras = faculdade.split(" ");
		
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
