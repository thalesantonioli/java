package br.com.fiap.arquivo.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.arquivo.Arquivo;
import br.com.fiap.arquivo.Produto;

public class Teste {

	public static void main(String[] args) {

		String nomeArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		
		List<String> conteudo = new ArrayList<String>();
		conteudo.add("Pera;200;pct;5.40");
		conteudo.add("Morango;280;cx;6.50");
		conteudo.add("Abacaxi;280;un;5.00");

		Arquivo.gravarArquivo(diretorio, nomeArquivo, conteudo);

		conteudo = Arquivo.lerArquivo(diretorio, nomeArquivo);

		List<Produto> produtos = Produto.parseListProduto(conteudo);

		for (Produto produto : produtos) {
			System.out.println(produto);
		}

	}
}
