package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;

import com.ibm.icu.util.Calendar;

@Entity // Indica que a classe será usada para mapear uma tabela do banco de dados
@Table(name = "tbl_estabelecimento") // Configura as informações do tabela que está sendo "espelhada" na classe
public class Estabelecimento {

	@Id // Indica qual atributo será maepado para a chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Configura a forma de preenchimento automático da chave
														// primária
	@Column(name = "id_estabelecimento") // Mapeaia uma coluna do banco de dados
	private Integer id;

	@Column(name = "nome_estabelecimento", length = 50)
	private String nome;

	@CreationTimestamp // Receberá automaticamente a data e a hora do sistema no momento da criação do
						// registro
	@Temporal(TemporalType.TIMESTAMP) // Tipo de dado temporal que será armazenado
	@Column(name = "dt_criacao")
	private Calendar dataCriacao;

	// Valor não foi mapeado, porém sempre que solicitado, seu valor será o
	// resultado do select
	@Formula("(select avg(a.nota) + 1 from avaliacao a where a.id_estabelecimento = id_estabelecimento)")
	private Double mediaAvaliacao;

	public Estabelecimento() {
		
	}
	
	public Estabelecimento(Integer id, String nome, Calendar dataCriacao, Double mediaAvaliacao) {
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.mediaAvaliacao = mediaAvaliacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Double getMediaAvaliacao() {
		return mediaAvaliacao;
	}

	public void setMediaAvaliacao(Double mediaAvaliacao) {
		this.mediaAvaliacao = mediaAvaliacao;
	}

}
