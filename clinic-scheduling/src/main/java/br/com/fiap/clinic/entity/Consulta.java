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
@Table(name = "consulta")
public class Consulta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_consulta")
	private long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_consulta")
	private Calendar dataConsulta;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_especialidade")
	private Especialidade especialidade;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_agendamento")
	private Agendamento agendamento;

	public Consulta(long id, Calendar dataConsulta, Paciente paciente, Especialidade especialidade,
			Agendamento agendamento) {
		this.id = id;
		this.dataConsulta = dataConsulta;
		this.paciente = paciente;
		this.especialidade = especialidade;
		this.agendamento = agendamento;
	}

	public Consulta() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Calendar dataConsulta) {
		this.dataConsulta = dataConsulta;
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

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

}
