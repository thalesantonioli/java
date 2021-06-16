package smartcities.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_avaliacao")
@IdClass(AvaliacaoId.class)
public class Avaliacao implements Serializable {

	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	private Cliente cliente;

	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_estabelecimento", insertable = false, updatable = false)
	private Estabelecimento estabelecimento;

	@CreationTimestamp
	@Column(name = "dt_avaliacao")
	private Calendar dataAvaliacao;

	@Column(name = "nota")
	private int nota;

	public Avaliacao() {
		super();
	}

	public Avaliacao(Cliente cliente, Estabelecimento estabelecimento, Calendar dataAvaliacao, int nota) {
		this.cliente = cliente;
		this.estabelecimento = estabelecimento;
		this.dataAvaliacao = dataAvaliacao;
		this.nota = nota;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Calendar getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(Calendar dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
