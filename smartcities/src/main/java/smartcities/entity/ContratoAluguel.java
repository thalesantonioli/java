package smartcities.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_contrato_aluguel")
public class ContratoAluguel {

	@Id
	@Column(name = "id_contrato")
	private int id;

	@Column(name = "vl_aluguel")
	private double valor;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_vencimento_aluguel")
	private Calendar dataVencimento;

	@OneToOne
	@JoinColumn(name = "id_estabelecimento")
	private Estabelecimento estabelecimento;

	public ContratoAluguel() {
		super();
	}

	public ContratoAluguel(int id, double valor, Calendar dataVencimento, Estabelecimento estabelecimento) {
		this.id = id;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.estabelecimento = estabelecimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

}
