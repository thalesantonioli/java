package br.com.fiap.clinic.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.clinic.dao.AgendamentoDAO;
import br.com.fiap.clinic.entity.Agendamento;

public class AgendamentoDAOTeste {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("clinic-scheduling").createEntityManager();

		AgendamentoDAO agendamentoDAO = new AgendamentoDAO(entityManager);
		
		List<Agendamento> agendamentos = agendamentoDAO.buscarPorData(new GregorianCalendar(2017, Calendar.AUGUST, 01));
		
		for (Agendamento agendamento : agendamentos) {
			System.out.println(agendamento.getDataAgendamento().getTime());
			System.out.println(agendamento.getEspecialidade().getNome());
			System.out.println(agendamento.getPaciente().getNome());
		}
		
		Calendar origem = new GregorianCalendar(2021, Calendar.APRIL, 10);
		Calendar nova = new GregorianCalendar(2021, Calendar.MARCH, 19);
		
		int total = agendamentoDAO.atualizarDataPrevista(origem, nova);
		
		System.out.println("Total registros atualizados: " + total);
		
		total = agendamentoDAO.removerPorDataPreviste(new GregorianCalendar(2017, Calendar.AUGUST, 01));
		System.out.println("Total registros excluídos: " + total);
		
		entityManager.close();

	}

}
