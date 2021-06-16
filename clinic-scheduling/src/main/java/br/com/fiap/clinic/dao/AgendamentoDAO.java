package br.com.fiap.clinic.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.clinic.entity.Agendamento;

public class AgendamentoDAO extends GenericDAO<Agendamento, Long> {

	public AgendamentoDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Agendamento> buscarPorData(Calendar data){
		return entityManager.createQuery("from Agendamento a where a.dataAgendamento = :data", Agendamento.class)
				.setParameter("data", data)
				.getResultList();
	}
	
	public int atualizarDataPrevista(Calendar origem, Calendar nova) {
		entityManager.getTransaction().begin();
		// número de registros que sofreram alteração
		int total = entityManager.createQuery("update Agendamento set dataConsultaPrevista = :nova "
				+ "where dataConsultaPrevista = :origem")
				.setParameter("nova", nova)
				.setParameter("origem", origem)
				.executeUpdate();
		entityManager.getTransaction().commit();
		return total;
	}
	
	public int removerPorDataPreviste(Calendar data) {
		entityManager.getTransaction().begin();
		int total = entityManager.createQuery("delete from Agendamento where dataConsultaPrevista = :data")
				.setParameter("data", data)
				.executeUpdate();
		entityManager.getTransaction().commit();
		return total;
	}

}
