package br.com.fiap.clinic.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.clinic.entity.Consulta;
import br.com.fiap.clinic.entity.Especialidade;

public class ConsultaDAO extends GenericDAO<Consulta, Long> {

	public ConsultaDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public List<Consulta> buscarPorEspecialidade(Especialidade especialidade) {
		return entityManager.createQuery("from Consulta c where c.especialidade = :especialidade", Consulta.class)
				.setParameter("especialidade", especialidade).getResultList();
	}

	public List<Consulta> buscarPorDatas(Calendar inicio, Calendar fim) {
		return entityManager
				.createQuery("from Consulta c where c.dataConsulta between :inicio and :fim", Consulta.class)
				.setParameter("inicio", inicio).setParameter("fim", fim).getResultList();
	}

	public List<Consulta> buscarPorEmailPaciente(String email) {
		return entityManager.createQuery("from Consulta c where c.paciente.email = :email", Consulta.class)
				.setParameter("email", email).getResultList();
	}
}
