package br.com.fiap.excecao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public static void main(String[] args) {
		try {
			// Abre o arquivo
			FileWriter stream = new FileWriter("C://Teste//arquivo.txt");

			PrintWriter print = new PrintWriter(stream);

			print.println("Teste");
			print.println("Escrevendo no arquivo");

			stream.close();
			print.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileReader stream = new FileReader("C://Teste//arquivo.txt");

			BufferedReader reader = new BufferedReader(stream);

			String linha = reader.readLine();

			while (linha != null) {
				System.out.println(linha);

				linha = reader.readLine();
			}
			
			stream.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File diretorio = new File("fiap");
		
		if(diretorio.exists()) {
			System.out.println("Diret�rio j� existe!");
		} else {
			if(diretorio.mkdir()) {
				System.out.println("Diret�rio criado!");
			} else {
				System.out.println("Diret�rio n�o criado!");
			}
		}
		
		File file = new File(diretorio, "arquivo.txt");
		
		if(file.exists()) {
			System.out.println("Arquivo j� existe!" 
								+ "\nPode ser lido: " + file.canRead()
								+ "\nPode ser gravado: " + file.canWrite()
								+ "\nTamanho: " + file.length()
								+ "\nCaminho: " + file.getPath());
		} else {
			try {
				if(file.createNewFile()) {
					System.out.println("Arquivo criado!");
				}else {
					System.out.println("Arquivo n�o criado!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter writer = new FileWriter(file);
			
			FileReader reader = new FileReader(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
