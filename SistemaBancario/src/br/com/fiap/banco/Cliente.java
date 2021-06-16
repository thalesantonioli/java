package br.com.fiap.banco;

import java.io.Serializable;

// Serializable, quando gerar uma classe a partir dessa classe, será serializada em forma de bits para trafegar para rede
public class Cliente implements Serializable{

	/* No mesmo ambiente de memória pode ter mais de um objeto da classe cliente com versões, com isso, posso identificar qual versão é aquele
	 * objeto para que os objetos não se confundam
	 */
	private static final long serialVersionUID = 1L;	

	private String nome;

	private byte idade;

	public Cliente() {

	}

	public Cliente(String nome, byte idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

}
