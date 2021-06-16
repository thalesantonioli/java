package br.com.fiap.clinic.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.clinic.dao.PacienteDAO;
import br.com.fiap.clinic.entity.Paciente;

public class PacienteDAOTeste {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("clinic-scheduling").createEntityManager();

		PacienteDAO pacienteDAO = new PacienteDAO(entityManager);

		List<Paciente> pacientes = pacienteDAO.buscarPorNome("Thal");

		pacientes.forEach(p -> System.out.println(p.getNome()));
		
		Paciente paciente = pacienteDAO.buscarPorEmail("amanda.antonioli@gmail.com");
		
		System.out.println(paciente.getNome());
		
		System.out.println("Quantidade de pacientes: " + pacienteDAO.contar());
		
		entityManager.close();
	}

}
