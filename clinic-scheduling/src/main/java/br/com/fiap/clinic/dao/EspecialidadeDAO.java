package br.com.fiap.clinic.dao;

import javax.persistence.EntityManager;

import br.com.fiap.clinic.entity.Especialidade;

public class EspecialidadeDAO extends GenericDAO<Especialidade, Long> {

	public EspecialidadeDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
