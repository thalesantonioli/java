package br.com.fiap.clinic.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.clinic.dao.ConsultaDAO;
import br.com.fiap.clinic.dao.EspecialidadeDAO;
import br.com.fiap.clinic.entity.Consulta;
import br.com.fiap.clinic.entity.Especialidade;

public class ConsultaDAOTeste {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("clinic-scheduling").createEntityManager();

		ConsultaDAO consultaDAO = new ConsultaDAO(entityManager);
		
		List<Consulta> consultas = consultaDAO.buscarPorEmailPaciente("thales.antonioli@gmail.com");
		
		for(Consulta consulta : consultas) {
			System.out.println(consulta.getEspecialidade().getNome());
			System.out.println(consulta.getDataConsulta().getTime());
			System.out.println(consulta.getPaciente().getEmail());
		}
		
		entityManager.close();

	}

}
