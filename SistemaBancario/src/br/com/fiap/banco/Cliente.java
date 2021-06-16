package br.com.fiap.banco;

import java.io.Serializable;

// Serializable, quando gerar uma classe a partir dessa classe, ser� serializada em forma de bits para trafegar para rede
public class Cliente implements Serializable{

	/* No mesmo ambiente de mem�ria pode ter mais de um objeto da classe cliente com vers�es, com isso, posso identificar qual vers�o � aquele
	 * objeto para que os objetos n�o se confundam
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
