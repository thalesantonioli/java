package br.com.fiap.arquivo;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private String nome;

	private short quantidade;

	private String unidadeMedida;

	private Double valorUnidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public short getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(short quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Double getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(Double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

	public static List<Produto> parseListProduto(List<String> conteudo) {
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto;

		String[] linha;

		for (int i = 0; i < conteudo.size(); i++) {
			linha = conteudo.get(i).split(";");

			produto = new Produto();

			produto.setNome(linha[0]);
			produto.setQuantidade(Short.parseShort(linha[1]));
			produto.setUnidadeMedida(linha[2]);
			produto.setValorUnidade(Double.parseDouble(linha[3]));

			produtos.add(produto);

		}

		return produtos;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", unidadeMedida=" + unidadeMedida
				+ ", valorUnidade=" + valorUnidade + "]";
	}

}
