package br.com.fiap.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

	public static void gravarArquivo(String diretorio, String nomeArquivo, List<String> conteudo) {

		String caminho = diretorio + "\\" + nomeArquivo;
		FileWriter stream;
		PrintWriter printer;

		try {
			stream = new FileWriter(caminho);
			printer = new PrintWriter(stream);

			for (String linha : conteudo) {
				printer.println(linha);
			}

			printer.close();
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static List<String> lerArquivo(String diretorio, String nomeArquivo) {

		List<String> conteudo = new ArrayList<String>();
		String linha;

		String caminho = diretorio + "\\" + nomeArquivo;
		FileReader stream;
		BufferedReader reader;

		try {
			stream = new FileReader(caminho);
			reader = new BufferedReader(stream);

			linha = reader.readLine();

			while (linha != null) {
				conteudo.add(linha);
				linha = reader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return conteudo;

	}

}
