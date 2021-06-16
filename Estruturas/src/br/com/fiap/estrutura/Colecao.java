package br.com.fiap.estrutura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Colecao {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();

		lista.add("LTP");
		lista.add("Web");
		lista.add(3);

		System.out.println("------------------------------------");
		System.out.println("ArrayList");
		System.out.println("------------------------------------");

		lista.forEach(d -> System.out.println(d));
		lista.set(1, "Algoritmos");

		System.out.println("------------------------------------");

		lista.forEach(d -> System.out.println(d));

		System.out.println("------------------------------------");

		lista.remove(0);
		lista.forEach(d -> System.out.println(d));

		System.out.println("------------------------------------");

		lista.add("Web");
		lista.add("Web");
		lista.forEach(d -> System.out.println(d));

		System.out.println("------------------------------------");

		int indice = lista.indexOf("Web");

		System.out.println("Primeira posição do valor \"Web\": " + indice);

		indice = lista.lastIndexOf("Web");

		System.out.println("Última posição do valor \"Web\": " + indice);
		System.out.println("------------------------------------");
		System.out.println("Set");

		// Principal vantagem, performance nas operações de busca (método contains), em
		// relação a List
		HashSet cursos = new HashSet();

		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");
		cursos.add("Java");

		System.out.println("------------------------------------");

		cursos.forEach(d -> System.out.println(d));

		System.out.println("------------------------------------");
		System.out.println("Map");

		HashMap mapa = new HashMap();

		mapa.put("RM1234", "Thiago");
		mapa.put("RM4321", "João");

		System.out.println(mapa);
		System.out.println("------------------------------------");
		System.out.println("O RM1234 pertence ao " + mapa.get("RM1234"));

		mapa.remove("RM1234");

		System.out.println("------------------------------------");
		System.out.println(mapa);
		System.out.println("------------------------------------");
		System.out.println("Generics");
		System.out.println("------------------------------------");

		// A partir do Java 5
		ArrayList<String> aluno = new ArrayList<String>();

		aluno.add("Thiago");
		aluno.add("Thales");
		aluno.add("João");

		aluno.forEach(d -> System.out.println(d));

	}

}
