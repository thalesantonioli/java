package smartcities.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import smartcities.entity.Avaliacao;
import smartcities.entity.AvaliacaoId;
import smartcities.entity.Cliente;
import smartcities.entity.Estabelecimento;

public class TesteAvaliacao {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities");

		EntityManager entityManager = fabrica.createEntityManager();

		Cliente cliente = entityManager.find(Cliente.class, 1);
		Estabelecimento estabelecimento = entityManager.find(Estabelecimento.class, 1);

		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setCliente(cliente);
		avaliacao.setEstabelecimento(estabelecimento);
		avaliacao.setNota(6);

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(avaliacao);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
		}

		fabrica.close();
		entityManager.close();
	}
}
