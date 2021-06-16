package br.com.fiap.clinic.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.clinic.dao.PacienteDAO;
import br.com.fiap.clinic.entity.Genero;
import br.com.fiap.clinic.entity.Paciente;

public class Teste {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("clinic-scheduling").createEntityManager();

		PacienteDAO pacienteDAO = new PacienteDAO(entityManager);

		Paciente paciente = new Paciente();
		paciente.setDataNascimento(new GregorianCalendar(1996, Calendar.NOVEMBER, 12));
		paciente.setEmail("thales.antonioli@gmail.com");
		paciente.setGenero(Genero.M);
		paciente.setNome("Thales");

		pacienteDAO.cadastrar(paciente);

		pacienteDAO.commit();
		
		entityManager.close();
	}

}
