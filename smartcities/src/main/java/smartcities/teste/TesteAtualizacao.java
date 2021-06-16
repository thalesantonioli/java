package smartcities.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import smartcities.entity.Cliente;

public class TesteAtualizacao {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities"); // Gerenciador

		EntityManager entityManager = fabrica.createEntityManager();

		Cliente cliente = new Cliente(1, "Thales");

		try {
			entityManager.getTransaction().begin();
			entityManager.merge(cliente);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
		}

		System.out.println(cliente.getId() + " " + cliente.getNome());

		entityManager.close();
		fabrica.close();
	}

}
