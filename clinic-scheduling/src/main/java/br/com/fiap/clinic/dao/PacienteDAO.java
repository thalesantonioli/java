package br.com.fiap.clinic.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.clinic.entity.Paciente;

public class PacienteDAO extends GenericDAO<Paciente, Long> {

	public PacienteDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Paciente> listarPorNome(int inicio, int fim){
		return entityManager.createQuery("from Paciente order by nome", Paciente.class)
				.setFirstResult(inicio)
				.setMaxResults(fim)
				.getResultList();
	}
	
	public List<Paciente> buscarPorNome(String nome){
		return entityManager.createQuery("from Paciente p where p.nome like :nome", Paciente.class)
				.setParameter("nome", "%" + nome + "%")
				.getResultList();
	}
	
	public Paciente buscarPorEmail(String email) {
		return entityManager.createQuery("from Paciente p where p.email = :email", Paciente.class)
				.setParameter("email", email)
				.getSingleResult();
	}
	
	public long contar() {
		return entityManager.createQuery("select count(p) from Paciente p", Long.class)
				.getSingleResult();
	}

}
