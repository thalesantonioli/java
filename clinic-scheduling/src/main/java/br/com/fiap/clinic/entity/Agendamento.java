package br.com.fiap.clinic.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "agendamento")
public class Agendamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agendamento")
	private long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_agendamento")
	private Calendar dataAgendamento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_consulta_prevista")
	private Calendar dataConsultaPrevista;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_especialidade")
	private Especialidade especialidade;

	public Agendamento(long id, Calendar dataAgendamento, Calendar dataConsultaPrevista, Paciente paciente,
			Especialidade especialidade) {
		this.id = id;
		this.dataAgendamento = dataAgendamento;
		this.dataConsultaPrevista = dataConsultaPrevista;
		this.paciente = paciente;
		this.especialidade = especialidade;
	}

	public Agendamento() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Calendar dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Calendar getDataConsultaPrevista() {
		return dataConsultaPrevista;
	}

	public void setDataConsultaPrevista(Calendar dataConsultaPrevista) {
		this.dataConsultaPrevista = dataConsultaPrevista;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}
